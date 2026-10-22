package edu.altair.crm.services;

import edu.altair.crm.dtos.HorarioResponseDto;

import java.util.List;

public interface HorarioService {

    List<HorarioResponseDto>
    obtenerHorarioAlumno(Long idAlumno);

}