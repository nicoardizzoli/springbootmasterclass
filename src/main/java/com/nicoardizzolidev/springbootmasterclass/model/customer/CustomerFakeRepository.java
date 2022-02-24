package com.nicoardizzolidev.springbootmasterclass.model.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//EL VALUE DEL COMPONENT LO PODEMOS USAR PARA USAR EL @Qualifier en el lugar donde se quiera inyectar, porque por ej tenemos 2 implementaciones de customerRepo y en DI no
// sabe cual inyectar. Tambien se puede usar el @Primary en la que querramos y directamente usa esa.
@Repository(value = "fake")
//@Primary SI USAMOS EL CustomerConfig no hace falta poner el primary
public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(new Customer(1L, "Nicolas", "123123", "email@gmail.com"), new Customer(2L, "Roberto", "123","email@gmail.com"));
    }

    @Override
    public Customer getCustomer(Long id) {
        return null;
    }
}
