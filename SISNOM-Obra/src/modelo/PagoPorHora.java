package modelo;

// PILAR EVIDENCIADO: Polimorfismo (Implementación concreta de la interfaz)
public class PagoPorHora implements CalculadoraPago {

    // La anotación @Override indica que estamos sobrescribiendo el método de la interfaz
    @Override
    public double calcularPago(double horasTrabajadas, double tarifaPorHora) {
        // Retorna el cálculo bruto de las horas por el valor de la hora del obrero
        return horasTrabajadas * tarifaPorHora;
    }
    
}