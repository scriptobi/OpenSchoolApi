package org.scriptobi.openschoolapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {
    @Bean
    public Docket postApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("OpenSchool", "Scriptobi API", "1.0", "Terms of service",
                new Contact("Scriptobi", "scriptobi.bzh", "scriptobi@mail.bzh"),
                "License", "License Url", Collections.emptyList());
        /*
        return new ApiInfoBuilder().title(("AdminSchool"))
                .description("Admin school spring boot Api")
                .termsOfServiceUrl("localhost")
                .contact("Scriptobi@mail.bzh")
                .license("Scriptobi")
                .licenseUrl("scriptobi@mail.bzh")
                .version("1.0")
                .build();
         */
    }
}