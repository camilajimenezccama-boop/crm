package edu.altair.crm.exceptions;

public class DniAlreadyExistsException extends RuntimeException {
    public DniAlreadyExistsException(String mensaje) {
        super(mensaje);
    }
}