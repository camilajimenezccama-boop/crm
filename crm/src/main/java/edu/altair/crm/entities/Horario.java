
package edu.altair.crm.entities;

import jakarta.persistence.*;
import java.time.LocalTime;

// Representa un horario de clase en la base de datos.
@Entity
@Table(name = "horario")
public class Horario {

    // Identificador único del horario, generado automáticamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Long idHorario;

    // Relaciona el horario con el alumno al que pertenece.
    @ManyToOne
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    // Día de la semana en el que se imparte la clase.
    @Column(name = "dia_semana", nullable = false, length = 20)
    private String diaSemana;

    // Hora de inicio de la clase.
    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    // Hora de finalización de la clase.
    @Column(name = "hora_fin", nullable = false)
    private LocalTime horaFin;

    // Nombre del módulo o asignatura.
    @Column(name = "modulo", nullable = false, length = 100)
    private String modulo;

    // Nombre del profesor que imparte la clase.
    @Column(name = "profesor", nullable = false, length = 100)
    private String profesor;

    public Horario() {
    }

    // Constructor para inicializar el horario con sus datos.
    public Horario(Long idHorario, Alumno alumno,
                   String diaSemana, LocalTime horaInicio,
                   LocalTime horaFin, String modulo,
                   String profesor) {
        this.idHorario = idHorario;
        this.alumno = alumno;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.modulo = modulo;
        this.profesor = profesor;
    }

    // Getters y Setters

    public Long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Long idHorario) {
        this.idHorario = idHorario;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

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
