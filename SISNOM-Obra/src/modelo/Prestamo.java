package modelo;

import java.time.LocalDate;

// PILAR EVIDENCIADO: Encapsulamiento
public class Prestamo {
    
    private Obrero obrero;
    private double montoInicial;
    private double saldoPendiente;
    private LocalDate fecha;

    public Prestamo(Obrero obrero, double montoInicial, LocalDate fecha) {
        this.obrero = obrero;
        this.montoInicial = montoInicial;
        // Al registrar un préstamo nuevo, el saldo pendiente es igual al monto total prestado
        this.saldoPendiente = montoInicial; 
        this.fecha = fecha;
    }

    // Método para reducir el saldo pendiente cuando se aplica un descuento en la nómina
    public void aplicarDescuento(double montoDescontado) {
        if (montoDescontado <= this.saldoPendiente) {
            this.saldoPendiente -= montoDescontado;
        } else {
            this.saldoPendiente = 0;
        }
    }

    // Getters y Setters
    public Obrero getObrero() {
        return obrero;
    }

    public void setObrero(Obrero obrero) {
        this.obrero = obrero;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}