package dev.joago.mi_alumno_api.escuela;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.joago.mi_alumno_api.json.JsonClassMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class EscuelaServiceImpl implements EscuelaService {

    private final EscuelaAutoRepository repository;


    public EscuelaServiceImpl(EscuelaAutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<Escuela> findAll(EscuelaQuery query, int page) {
        Pageable pageable = Pageable.ofSize(10).withPage(page);
        var found = repository.findQuery(query, pageable);
        if (found.getTotalElements() == 0) {
            throw new EscuelaNotFoundException("Escuela no encontrada. \nParametros: %s".formatted(query.toString()));
        }
        return found;
    }

    @Override
    public Escuela findById(String id) {
        if (repository.findById(id).isEmpty())
            throw new EscuelaNotFoundException("Escuela con id %s no encontrada".formatted(id));
        else return repository.findById(id).get();
    }

    @Override
    public Escuela findByCueAnexo(String cue_anexo) {
        if (repository.findByCueAnexo(cue_anexo) == null)
            throw new EscuelaNotFoundException("Escuela con id %s no encontrada".formatted(cue_anexo));
        else return repository.findByCueAnexo(cue_anexo);
    }

    @Override
    public Object filterFieldsAndReturn(String id, String[] fields) throws JsonProcessingException {
        Escuela escuela = this.findById(id);
        return JsonClassMapper.createObjectFromProperties(escuela, fields);
    }

}
