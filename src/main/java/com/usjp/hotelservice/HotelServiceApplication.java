package com.usjp.hotelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
@Import(SwaggerConfig.class)
public class HotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceApplication.class, args);
    }

}
