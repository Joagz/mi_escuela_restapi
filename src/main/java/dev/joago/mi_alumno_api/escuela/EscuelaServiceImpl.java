package dev.joago.mi_alumno_api.escuela;

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

}
