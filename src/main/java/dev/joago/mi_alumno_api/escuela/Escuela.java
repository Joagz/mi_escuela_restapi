package dev.joago.mi_alumno_api.escuela;

import static jakarta.persistence.GenerationType.IDENTITY;

import dev.joago.annotations.AutoRepository;
import dev.joago.annotations.Field;
import jakarta.persistence.Column;
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
@AutoRepository(databaseName = "censo_escolar_data")
public class Escuela {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long index;

    @Field
    private String jurisdiccion;

    @Field
    private String nombre;

    @Field
    private String sector;

    @Field
    private String ambito;

    @Field
    private String localidad;

    @Field
    private String departamento;

    @Field
    private String numero;

    @Field
    @Column(name = "cue_anexo")
    private String cueAnexo;

    private String mail;

    private String cp;

    @Column(name = "codigo_de_area")
    private String codigoDeArea;

    private String telefono;

    @Column(name = "codigo_localidad")
    private String codigoLocalidad;


}
