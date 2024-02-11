package dev.joago.mi_alumno_api.escuela;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/padron")
class EscuelaController {

    private final EscuelaServiceImpl service;

    public EscuelaController(EscuelaServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<Page<Escuela>> findAll(EscuelaQuery query, @RequestParam("page") int page) throws EscuelaNotFoundException {
        return new ResponseEntity<>(service.findAll(query, page), HttpStatusCode.valueOf(200));
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    ResponseEntity<Object> findByIdFilter(@PathVariable String id, @RequestParam(value = "fields", required = false) String[] fields) throws JsonProcessingException {
        if (fields != null && fields.length > 0) {
            return new ResponseEntity<>(service.filterFieldsAndReturn(id, fields), HttpStatusCode.valueOf(200));
        } else {
            return new ResponseEntity<>(service.findById(id), HttpStatusCode.valueOf(200));
        }
    }


}
