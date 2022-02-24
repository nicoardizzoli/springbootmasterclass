package com.nicoardizzolidev.springbootmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

//esto es para openfeign osea para poder consumir datos de otra API
@EnableFeignClients
public class SpringbootmasterclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmasterclassApplication.class, args);
    }

}
