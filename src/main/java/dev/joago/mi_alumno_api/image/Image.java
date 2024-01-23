package dev.joago.mi_alumno_api.file;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    String name;
    String path;
    float size;
    float width;
    float height;

}
