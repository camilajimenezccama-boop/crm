package edu.altair.crm.repositories;

import edu.altair.crm.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Permite consultar y gestionar los horarios en la base de datos.
@Repository
public interface HorarioRepository
        extends JpaRepository<Horario, Long> {

    // Busca todos los horarios asociados al ID de un alumno.
    List<Horario> findByAlumnoIdAlumno(Long idAlumno);

}