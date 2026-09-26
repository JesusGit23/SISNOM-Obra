package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

// PILAR EVIDENCIADO: Encapsulamiento
public class RegistroHoras {
    
    // Relaciones con las otras entidades
    private Obrero obrero;
    private Obra obra;
    private Capataz capataz;
    
    // Datos de tiempo según RF-03
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public RegistroHoras(Obrero obrero, Obra obra, Capataz capataz, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        this.obrero = obrero;
        this.obra = obra;
        this.capataz = capataz;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Getters y Setters
    public Obrero getObrero() {
        return obrero;
    }

    public void setObrero(Obrero obrero) {
        this.obrero = obrero;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Capataz getCapataz() {
        return capataz;
    }

    public void setCapataz(Capataz capataz) {
        this.capataz = capataz;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
}