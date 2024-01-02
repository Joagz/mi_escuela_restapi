package dev.joago.mi_alumno_api.escuela;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
 class EscuelaNotFoundException extends Exception {

    private String message;

    EscuelaNotFoundException(String message) {
        this.message = message;
    }

}
