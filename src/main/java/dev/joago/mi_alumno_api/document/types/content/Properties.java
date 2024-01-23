package dev.joago.mi_alumno_api.document.types;


public record Properties(

        float width,
        float height,
        float fontWeight,
        float fontSize,
        float fontFamily,
        boolean italic,
        boolean bold,
        boolean underline,
        String colorHex,
        Tags tag

){}
