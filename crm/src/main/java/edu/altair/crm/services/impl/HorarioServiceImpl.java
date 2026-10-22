package edu.altair.crm.services.impl;

import edu.altair.crm.dtos.HorarioResponseDto;
import edu.altair.crm.repositories.HorarioRepository;
import edu.altair.crm.services.HorarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServiceImpl
        implements HorarioService {

    private final HorarioRepository horarioRepository;

    public HorarioServiceImpl(
            HorarioRepository horarioRepository) {

        this.horarioRepository = horarioRepository;
    }

    @Override
    public List<HorarioResponseDto>
    obtenerHorarioAlumno(Long idAlumno) {

        return horarioRepository
                .findByAlumnoIdAlumno(idAlumno)
                .stream()
                .map(h ->
                        new HorarioResponseDto(
                                h.getDiaSemana(),
                                h.getHoraInicio(),
                                h.getHoraFin(),
                                h.getModulo(),
                                h.getProfesor()
                        ))
                .toList();
    }
}