package com.nicoardizzolidev.springbootmasterclass.model.customer;

import com.nicoardizzolidev.springbootmasterclass.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

//Tanto el @Service como el @Component hacen referencia a que esta clase va a ser un Singleton y se va a inyectar mediante Dependency Injection en las clases que necesitemos.
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Long id) {

        LOGGER.info("getcustomers was called");
        return customerRepository.findById(id).orElseThrow(() ->
        {
            LOGGER.error("No se encuentra el customer " + id);
            throw new NotFoundException("customer not found");
        });
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
