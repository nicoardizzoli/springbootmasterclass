package com.nicoardizzolidev.springbootmasterclass.model.customer;

import java.util.List;


public interface CustomerService {

    Customer getCustomer(Long id);
    List<Customer> getCustomers();
}
