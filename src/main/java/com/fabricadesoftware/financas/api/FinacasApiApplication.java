package com.fabricadesoftware.financas.api;

import com.fabricadesoftware.financas.api.config.property.FinancasApiproperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FinancasApiproperty.class)
public class FinacasApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinacasApiApplication.class, args);
    }

}
