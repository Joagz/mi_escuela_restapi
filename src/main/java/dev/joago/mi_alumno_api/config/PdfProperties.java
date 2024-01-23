package dev.joago.mi_alumno_api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application.file")
public record FileProperties(String location, Long maxSize) {
}
