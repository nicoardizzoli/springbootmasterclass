package com.nicoardizzolidev.springbootmasterclass.model.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    //con esto se puede leer una variable del application.properties
    @Value("${app.useFakeCustomerRepo : false}")
    private Boolean useFakeCustomerRepo;

    //SI SE ANOTA ALGO COMO BEAN, SPRING LO VA A EJECUTAR EN EL INICIO DEL SERVIDOR.
    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner hellooo");
        };
    }

//    @Bean
//    CustomerRepo customerRepo() {
//        System.out.println("use fake customer = " + useFakeCustomerRepo);
//        return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
//    }
}
