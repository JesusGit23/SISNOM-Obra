package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.CalculadoraPago;
import modelo.Inasistencia;
import modelo.Nomina;
import modelo.Obrero;
import modelo.PagoPorHora;
import modelo.Prestamo;

public class NominaController {
    
    private List<Nomina> historialNominas;
    // PILAR EVIDENCIADO: Polimorfismo (Inyectamos la interfaz, no la clase concreta directamente)
    private CalculadoraPago calculadora;

    public NominaController() {
        this.historialNominas = new ArrayList<>();
        // Instanciamos el comportamiento de pago por hora
        this.calculadora = new PagoPorHora(); 
    }

    /**
     * RF-07: Generación de nómina calculando valoradas, inasistencias y préstamos.
     */
    public Nomina generarNominaObrero(Obrero obrero, LocalDate inicio, LocalDate fin, 
                                      double horasTrabajadasEnPeriodo, 
                                      List<Inasistencia> inasistencias, 
                                      Prestamo prestamoActivo) {
        
        // 1. Calcular pago base usando polimorfismo
        double pagoBruto = calculadora.calcularPago(horasTrabajadasEnPeriodo, obrero.getTarifaPorHora());
        
        // 2. Calcular descuento por inasistencias (Ejemplo: se descuenta 8 horas por cada falta)
        double descuentoInasistencias = 0;
        if (inasistencias != null) {
            descuentoInasistencias = inasistencias.size() * (8 * obrero.getTarifaPorHora());
        }
        
        // 3. Calcular abono a préstamo (Ejemplo: se descuenta el 10% del salario bruto o el saldo total si es menor)
        double descuentoPrestamo = 0;
        if (prestamoActivo != null && prestamoActivo.getSaldoPendiente() > 0) {
            double abonoSugerido = pagoBruto * 0.10; 
            descuentoPrestamo = Math.min(abonoSugerido, prestamoActivo.getSaldoPendiente());
            prestamoActivo.aplicarDescuento(descuentoPrestamo); // Actualiza el saldo en la clase Prestamo
        }
        
        // 4. Calcular el pago neto
        double pagoNeto = pagoBruto - descuentoInasistencias - descuentoPrestamo;
        
        // Si las deudas superan el sueldo, el neto no puede ser negativo
        if (pagoNeto < 0) pagoNeto = 0; 
        
        // 5. Crear el registro de nómina
        Nomina nuevaNomina = new Nomina(obrero, inicio, fin, horasTrabajadasEnPeriodo, pagoBruto, descuentoInasistencias, descuentoPrestamo, pagoNeto);
        historialNominas.add(nuevaNomina);
        
        return nuevaNomina;
    }

    // RF-08: Retorna la lista para que la Vista la dibuje en el JTable
    public List<Nomina> obtenerNominasGeneradas() {
        return historialNominas;
    }
}