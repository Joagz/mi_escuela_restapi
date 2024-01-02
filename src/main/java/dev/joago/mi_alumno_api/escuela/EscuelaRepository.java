package dev.joago.mi_alumno_api.escuela;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
interface EscuelaRepository extends PagingAndSortingRepository<Escuela, Long>, JpaSpecificationExecutor<Escuela> {

    @Query(nativeQuery = true, value = """
            select * from censo_escolar_data
            where
            jurisdiccion LIKE %:jurisdiccion%
            and localidad LIKE %:localidad%
            and cue_anexo LIKE %:cueAnexo%
            and nombre LIKE %:nombre%
            and sector LIKE %:sector%
            and ambito LIKE %:ambito%
            and numero LIKE %:numero%

             """)
    Page<Escuela> findByQuery(String jurisdiccion,
            String localidad,
            String cueAnexo,
            String nombre,
            String sector,
            String ambito,
            String numero, Pageable pageable);

}
