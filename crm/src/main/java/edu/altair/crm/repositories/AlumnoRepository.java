package edu.altair.crm.repositories;

import edu.altair.crm.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {


    // Método derivado para consultar si ya existe un DNI registrado
    boolean existsByDni(String dni);

    // Método derivado para buscar un alumno por su DNI
    Optional<Alumno> findByDni(String dni);
}
