package com.delicias.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// Con el proyecto en ejecución, accede a la documentación de Swagger en tu navegador:
// http://localhost:8080/swagger-ui/index.html
// Aquí podrás ver y probar las diferentes operaciones de la API, así como obtener detalles sobre cómo utilizar cada endpoint.
// @Api: Define información general sobre la API.
// @ApiOperation: Descripción de cada operación en la API.
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.delicias.product.controller"))
//                .apis(RequestHandlerSelectors.basePackage("com.delicias.api.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
