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
public class EscuelaQuery {

    String jurisdiccion = "";
    String localidad = "";
    String cueAnexo = "";
    String nombre = "";
    String sector = "";
    String ambito = "";
    String numero = "";

}
