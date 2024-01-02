package dev.joago.mi_alumno_api.escuela;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class EscuelaServiceImpl implements EscuelaService {

    private final EscuelaRepository repository;

    public EscuelaServiceImpl(EscuelaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<Escuela> findAll(EscuelaQuery query, int page) {
        Pageable pageable = Pageable.ofSize(10).withPage(page);
        return repository.findByQuery(
                query.jurisdiccion,
                query.localidad,
                query.cueAnexo,
                query.nombre,
                query.sector,
                query.ambito,
                query.numero, pageable);
    }

}
