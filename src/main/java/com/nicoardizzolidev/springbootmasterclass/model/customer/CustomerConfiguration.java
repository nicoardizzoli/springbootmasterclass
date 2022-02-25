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


    //asi se lee una variable del application.properties (las unicas q pueden sobreescribir una propiedad, son variablers de la jvm o de entorno)
    //Tambien se puede ller con enviroment.getProperty("info.company.name")
    @Value("${info.company.name}")
    private String companyName;


    //SI SE ANOTA ALGO COMO BEAN, SPRING LO VA A EJECUTAR EN EL INICIO DEL SERVIDOR.
    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner hellooo");
            System.out.println(companyName);
        };
    }

//    @Bean
//    CustomerRepo customerRepo() {
//        System.out.println("use fake customer = " + useFakeCustomerRepo);
//        return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
//    }
}
