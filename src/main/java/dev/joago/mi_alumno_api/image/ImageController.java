package dev.joago.mi_alumno_api.file;

import dev.joago.mi_alumno_api.config.ImageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/v1/api/image")
public class ImageController {

    @Autowired
    private ImageProperties imageProperties;

    private static final String[] AVAILABLE_IMAGE_FORMATS = {".jpg", ".png", ".jpeg", ".webp", ".ico", ".svg"};

    private boolean formatValidation(String fileName) {
        for (String f : AVAILABLE_IMAGE_FORMATS) {
            if (fileName.contains(f)) {
                return true;
            }
        }
        return false;
    }

    @PostMapping(value = "", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<?> upload(MultipartFile image) {
        String path = imageProperties.location();
        Long maxSize = imageProperties.maxSize();
        System.out.println(image.getSize());

        if (image.isEmpty()) {
            return new ResponseEntity<>("La imagen no puede ser un archivo vacío", HttpStatus.BAD_REQUEST);
        }

        if (image.getSize() > maxSize) {
            return new ResponseEntity<>("El tamaño máximo del archivo es de 15MB", HttpStatus.BAD_REQUEST);
        }

        if (!formatValidation(image.getOriginalFilename())) {
            return new ResponseEntity<>("Formato incorrecto. Formatos disponibles: " + Arrays.toString(AVAILABLE_IMAGE_FORMATS), HttpStatus.BAD_REQUEST);
        }

        File file = new File(path + "/" +
                UUID.randomUUID() +
                Objects.requireNonNull(image.getOriginalFilename())
                        .toLowerCase()
                        .replace(" ", "_"));

        try (FileOutputStream writer = new FileOutputStream(file)) {
            writer.write(image.getBytes());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new ResponseEntity<>(file.getPath(), HttpStatus.OK);
    }

}
