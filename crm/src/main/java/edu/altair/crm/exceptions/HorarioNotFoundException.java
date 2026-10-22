package edu.altair.crm.exceptions;



// Excepción lanzada cuando no existe un horario con el identificador indicado.

public class HorarioNotFoundException extends RuntimeException {
    // Crea una excepción para un horario inexistente.

    // @param idHorario identificador del horario que no existe

    public HorarioNotFoundException(Long idHorario) {
        super("No se ha encontrado ningún horario con ID: " + idHorario);
    }
}