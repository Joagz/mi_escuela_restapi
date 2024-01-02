package dev.joago.mi_alumno_api.escuela;

import org.springframework.data.domain.Page;

/*
    Repository method list:
    
    Page<Escuela> findAll(Pageable pageable);

    List<Escuela> findByNumero(String numero);

    List<Escuela> findByAmbito(String ambito);

    List<Escuela> findBySector(String sector);

    List<Escuela> findByLocalidad(String localidad);

    List<Escuela> findByCueAnexo(String cueAnexo);

    List<Escuela> findByNombre(String nombre);

    List<Escuela> findByMail(String mail);
 */

interface EscuelaService {

    public Page<Escuela> findAll(EscuelaQuery query, int page);

}
