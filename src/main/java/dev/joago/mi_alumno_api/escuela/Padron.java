package dev.joago.mi_alumno_api.escuela;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.joago.annotations.AutoRepository;
import dev.joago.annotations.Field;
import dev.joago.enums.PrimaryKeyTypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "escuelas")
@AutoRepository(databaseName = "escuelas", primaryKeyType = PrimaryKeyTypes.STRING)
public class Escuela {

    @Id
    private String id;

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
    @JsonProperty("cue_anexo")
    private String cueAnexo;

    private String mail;

    private String cp;

    @Column(name = "codigo_de_area")
    @JsonProperty("codigo_de_area")
    private String codigoDeArea;

    private String telefono;

    @Column(name = "codigo_localidad")
    @JsonProperty("codigo_localidad")
    private String codigoLocalidad;


}
