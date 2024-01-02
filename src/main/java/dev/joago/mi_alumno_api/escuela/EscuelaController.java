package dev.joago.mi_alumno_api.escuela;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/escuela")
class EscuelaController {

    private final EscuelaServiceImpl service;

    public EscuelaController(EscuelaServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    Page<Escuela> findAll(EscuelaQuery query, @RequestParam("page") int page) {
        System.out.println(query.toString());
        return service.findAll(query, page);
    }

}
