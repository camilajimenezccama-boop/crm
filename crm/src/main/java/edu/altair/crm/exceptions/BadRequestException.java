package edu.altair.crm.exceptions;


 // Excepción lanzada cuando una petición contiene datos inválidos.

public class BadRequestException extends RuntimeException {


     // Crea una excepción con el motivo del error.
     // @param mensaje descripción del problema de la petición
    public BadRequestException(String mensaje) {
        super(mensaje);
    }
}