package dev.joago.mi_alumno_api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties(prefix = "application")
@ConfigurationPropertiesScan
public class ConfigProperties {



}
