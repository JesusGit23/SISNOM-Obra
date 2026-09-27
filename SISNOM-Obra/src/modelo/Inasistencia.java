package modelo;

import java.time.LocalDate;

// PILAR EVIDENCIADO: Encapsulamiento
public class Inasistencia {
    
    private Obrero obrero;
    private LocalDate fecha;
    private String motivo;

    // Constructor completo
    public Inasistencia(Obrero obrero, LocalDate fecha, String motivo) {
        this.obrero = obrero;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    // Constructor sobrecargado para cuando el motivo es opcional y no se proporciona
    public Inasistencia(Obrero obrero, LocalDate fecha) {
        this.obrero = obrero;
        this.fecha = fecha;
        this.motivo = "Sin justificar";
    }

    // Getters y Setters
    public Obrero getObrero() {
        return obrero;
    }

    public void setObrero(Obrero obrero) {
        this.obrero = obrero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}