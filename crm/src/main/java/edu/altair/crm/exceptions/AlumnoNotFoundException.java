package edu.altair.crm.exceptions;


public class AlumnoNotFoundException extends RuntimeException {

    public AlumnoNotFoundException(String mensaje) {
        super(mensaje);
    }

    public AlumnoNotFoundException(Long id) {
        super("Alumno no encontrado con el ID: " + id);
    }
}