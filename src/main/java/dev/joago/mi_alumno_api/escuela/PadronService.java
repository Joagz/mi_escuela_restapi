package dev.joago.mi_alumno_api.escuela;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Page;

interface EscuelaService {
    public Page<Escuela> findAll(EscuelaQuery query, int page);
    public Escuela findById(String id);
    public Escuela findByCueAnexo(String cue_anexo);
    public Object filterFieldsAndReturn(String id, String[] fields) throws JsonProcessingException;
}
