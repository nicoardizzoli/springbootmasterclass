package com.nicoardizzolidev.springbootmasterclass.model.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "real")
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
