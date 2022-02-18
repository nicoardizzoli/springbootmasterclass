package com.nicoardizzolidev.springbootmasterclass.model.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//Tanto el @Service como el @Component hacen referencia a que esta clase va a ser un Singleton y se va a inyectar mediante Dependency Injection en las clases que necesitemos.
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepo customerRepo;

    @Override
    public Customer getCustomer() {
        return new Customer(1L, "nico", "123");
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }
}
