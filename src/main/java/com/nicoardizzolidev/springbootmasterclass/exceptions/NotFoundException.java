package com.nicoardizzolidev.springbootmasterclass.exceptions;


//SIEMPRE PARA MANEJAR LAS EXCEPTIONS ES BUENO SABER CUALES HTTPSTATUS USAR YA QUE MUCHAS VECES SE MANEJAN MAL LAS RESPONSES
// HTTP STATUS CODES //
// Informational responses (100-199)
// Successfull responses (200-299)
// Redirects (300 - 399)
// client errors (400-499)
//server errors (500-599)
//de todas maneras, podemos entrar en la clase HttpStatus y ver el que mas se adapte a la respuesta que queremos dar.

//aca vamos a comentar el responsestatus porque vamos a manejar todas las exceptions con un handler.
//@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
