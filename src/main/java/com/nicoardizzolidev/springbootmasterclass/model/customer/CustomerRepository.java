package com.nicoardizzolidev.springbootmasterclass.model.customer;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository(value = "real")
public class CustomerRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        // TODO conectar a la database real.
        return Collections.emptyList();
    }
}
