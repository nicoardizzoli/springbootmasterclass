package com.nicoardizzolidev.springbootmasterclass.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
public class Customer {

    //Si queremos cambiar el nombre en el que Jackson convierte a una propiedad, tenemos dos alternativas, o hacer un getter con el nombre nuevo y que devuelva
    // el mismo valor, o cambiarle la jsonProperty y poner el nombre que querramos.
//    @Getter(onMethod = @__(@JsonProperty(value = "customerId")))
    private final Long id;

    private final String name;

    //Los objetos en java, son mapeados a JSON por una libreria que se llama Jackson, si por ejemplo queremos que en el payload (osea el json que se genera del objeto java)
    //se omita cierta propiedad, usamos el jsonIgnore, si usamos lombok es asi, y sino va en el getter ya que Jackson transforma en JSON todos los getters.
   @Getter(onMethod = @__(@JsonIgnore))

   //Con esto le decimos que vamos a poder unicamente guardar el password pero no leerlo desde el cliente, y evitamos que nos tire el error de que no tiene getter, ya que lo estamos ignorando en jackson
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

}
