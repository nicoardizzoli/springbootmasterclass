package com.nicoardizzolidev.springbootmasterclass.model.customer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//ES BUENA PRACTICA VERSIONAR LAS APIS
@RestController()
@RequestMapping(path = "api/v1/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;



    //VALUE o PATH ES LO MISMO. GETMAPPING IS A SHORTHAND OF RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer();
    }

    //CON EL @RequestBody lo que hacemos es asociar el Customer, con su mapeo en JSON que hace jackson.
    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping
    void updateNewCustomer(@RequestBody Customer customer) {
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }


    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST customer ID:...");
        System.out.println(id);
    }

}
