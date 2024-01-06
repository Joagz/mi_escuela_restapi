package dev.joago.mi_alumno_api.escuela;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/escuela")
class EscuelaController {

    private final EscuelaServiceImpl service;

    public EscuelaController(EscuelaServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<Page<Escuela>> findAll(EscuelaQuery query, @RequestParam("page") int page) throws  EscuelaNotFoundException {
        return new ResponseEntity<>(service.findAll(query, page), HttpStatusCode.valueOf(200));
    }

}
