package edu.altair.crm.exceptions;


import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


 // Gestiona de forma centralizada las excepciones de la API REST.

@RestControllerAdvice
public class GlobalExceptionHandler {


     // Gestiona los casos en los que no existe el alumno solicitado.

    @ExceptionHandler(AlumnoNotFoundException.class)
    public ProblemDetail handleAlumnoNotFound(
            AlumnoNotFoundException exception) {

        ProblemDetail problem = ProblemDetail.forStatusAndDetail(
                HttpStatus.NOT_FOUND,
                exception.getMessage()
        );

        problem.setTitle("Alumno no encontrado");
        return problem;
    }


     // Gestiona los casos en los que no existe el horario solicitado.

    @ExceptionHandler(HorarioNotFoundException.class)
    public ProblemDetail handleHorarioNotFound(
            HorarioNotFoundException exception) {

        ProblemDetail problem = ProblemDetail.forStatusAndDetail(
                HttpStatus.NOT_FOUND,
                exception.getMessage()
        );

        problem.setTitle("Horario no encontrado");
        return problem;
    }


     // Gestiona las peticiones que contienen datos inválidos.

    @ExceptionHandler(BadRequestException.class)
    public ProblemDetail handleBadRequest(
            BadRequestException exception) {

        ProblemDetail problem = ProblemDetail.forStatusAndDetail(
                HttpStatus.BAD_REQUEST,
                exception.getMessage()
        );

        problem.setTitle("Petición incorrecta");
        return problem;
    }


     // Gestiona los errores de acceso a la base de datos.
     // No expone detalles internos al cliente.
    @ExceptionHandler(DataAccessException.class)
    public ProblemDetail handleDataAccessError(
            DataAccessException exception) {

        ProblemDetail problem = ProblemDetail.forStatusAndDetail(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Se ha producido un error al acceder a la base de datos."
        );

        problem.setTitle("Error interno del servidor");
        return problem;
    }
}
