package edu.altair.crm.controllers;


import edu.altair.crm.dtos.HorarioResponseDto;
import edu.altair.crm.services.HorarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class HorarioController {

    // Servicio que obtiene el horario del alumno.
    private final HorarioService horarioService;

    // Constructor para recibir el servicio.
    public HorarioController(
            HorarioService horarioService) {

        this.horarioService = horarioService;
    }

    // Consulta el horario semanal de un alumno por su ID.
    @GetMapping("/{id}/horario")
    public ResponseEntity<List<HorarioResponseDto>>
    obtenerHorario(@PathVariable Long id) {

        // Devuelve el horario del alumno con una respuesta HTTP 200.
        return ResponseEntity.ok(
                horarioService
                        .obtenerHorarioAlumno(id)
        );
    }
}