
package edu.altair.crm.dtos;

import java.time.LocalTime;

// Contiene los datos del horario que se devuelven al cliente.
public class HorarioResponseDto {

    private String diaSemana;

    private LocalTime horaInicio;

    private LocalTime horaFin;

    private String modulo;

    private String profesor;

    // Constructor vacío necesario para crear el objeto sin parámetros.
    public HorarioResponseDto() {
    }

    // Constructor para crear el DTO con todos sus datos.
    public HorarioResponseDto(String diaSemana,
                              LocalTime horaInicio,
                              LocalTime horaFin,
                              String modulo,
                              String profesor) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.modulo = modulo;
        this.profesor = profesor;
    }

    // Getter y Setters
    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
