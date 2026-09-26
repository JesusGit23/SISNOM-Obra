package modelo;

// PILAR EVIDENCIADO: Polimorfismo (Mediante la definición de un comportamiento común)
public interface CalculadoraPago {
    
    /**
     * Calcula el pago base multiplicando el tiempo laborado por la tarifa.
     */
    double calcularPago(double horasTrabajadas, double tarifaPorHora);
    
}