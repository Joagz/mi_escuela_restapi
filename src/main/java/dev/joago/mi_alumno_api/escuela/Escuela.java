package dev.joago.mi_alumno_api.escuela;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "censo_escolar_data")
public class Escuela {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String jurisdiccion;
    private String cueAnexo;
    private String nombre;
    private String sector;
    private String ambito;
    private String domicilio;
    private String cp;
    private String codigoDeArea;
    private String telefono;
    private String codigoLocalidad;
    private String localidad;
    private String departamento;
    private String mail;
    private String numero;

}
