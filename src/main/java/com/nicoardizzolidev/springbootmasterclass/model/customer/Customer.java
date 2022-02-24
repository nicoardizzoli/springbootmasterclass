package com.nicoardizzolidev.springbootmasterclass.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Objects;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    //Si queremos cambiar el nombre en el que Jackson convierte a una propiedad, tenemos dos alternativas, o hacer un getter con el nombre nuevo y que devuelva
    // el mismo valor, o cambiarle la jsonProperty y poner el nombre que querramos.
//    @Getter(onMethod = @__(@JsonProperty(value = "customerId")))
    @Id
    private  Long id;

    //spring validation, se agrega en el pom, y podemos validar que el cliente no nos mande cosas en blanco o null o lo que sea
    @NotBlank(message = "name must be not empty")
    private String name;

    //Los objetos en java, son mapeados a JSON por una libreria que se llama Jackson, si por ejemplo queremos que en el payload (osea el json que se genera del objeto java)
    //se omita cierta propiedad, usamos el jsonIgnore, si usamos lombok es asi, y sino va en el getter ya que Jackson transforma en JSON todos los getters.
   @Getter(onMethod = @__(@JsonIgnore))

   //Con esto le decimos que vamos a poder unicamente guardar el password pero no leerlo desde el cliente, y evitamos que nos tire el error de que no tiene getter, ya que lo estamos ignorando en jackson
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   @NotBlank(message = "password must be not empty")
    private String password;


   //validation para mails
    @NotBlank(message = "email must be not empty")
    //dentro de la validacion, se le puede mandar la regex q querramos para ver que tomamos como valido.
    //NOTA: SE PUEDE VER EN EL PACKAGE DE JAVAX.VALIDATION.CONSTRAINT todas las validaciones que se pueden hacer.
    @Email
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return id != null && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
