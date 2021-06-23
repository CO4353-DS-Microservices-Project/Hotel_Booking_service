package com.usjp.hotelservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.ant("/**"))
                .apis(RequestHandlerSelectors.basePackage("com.usjp"))
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "hotel service",
                "hotel service , serve only hotel details",
                "V1",
                "",
                new Contact("Dilmi", "", ""),
                "", "", Collections.emptyList());
    }

}