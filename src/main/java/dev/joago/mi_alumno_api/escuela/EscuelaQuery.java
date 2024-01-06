package dev.joago.mi_alumno_api.escuela;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
class EscuelaQuery {

    String jurisdiccion = null;
    String departamento = null;
    String nombre = null;
    String cue_anexo = null;
    String localidad = null;
    String sector = null;
    String ambito = null;
    String numero = null;

}
