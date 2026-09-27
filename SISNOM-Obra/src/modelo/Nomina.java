package modelo;

import java.time.LocalDate;

// PILAR EVIDENCIADO: Encapsulamiento
public class Nomina {
    
    private Obrero obrero;
    private LocalDate fechaInicioPeriodo;
    private LocalDate fechaFinPeriodo;
    
    // Desglose del pago según RF-07
    private double totalHorasTrabajadas;
    private double pagoBruto; // Pago base sin descuentos
    private double descuentoInasistencias;
    private double descuentoPrestamo;
    private double pagoNeto; // Lo que finalmente recibe el obrero

    public Nomina(Obrero obrero, LocalDate fechaInicio, LocalDate fechaFin, 
                  double horas, double bruto, double descInasistencias, 
                  double descPrestamo, double neto) {
        this.obrero = obrero;
        this.fechaInicioPeriodo = fechaInicio;
        this.fechaFinPeriodo = fechaFin;
        this.totalHorasTrabajadas = horas;
        this.pagoBruto = bruto;
        this.descuentoInasistencias = descInasistencias;
        this.descuentoPrestamo = descPrestamo;
        this.pagoNeto = neto;
    }

    // Genera todos los Getters para que la tabla de la vista pueda mostrarlos luego
    public Obrero getObrero() { return obrero; }
    public LocalDate getFechaInicioPeriodo() { return fechaInicioPeriodo; }
    public LocalDate getFechaFinPeriodo() { return fechaFinPeriodo; }
    public double getTotalHorasTrabajadas() { return totalHorasTrabajadas; }
    public double getPagoBruto() { return pagoBruto; }
    public double getDescuentoInasistencias() { return descuentoInasistencias; }
    public double getDescuentoPrestamo() { return descuentoPrestamo; }
    public double getPagoNeto() { return pagoNeto; }
}