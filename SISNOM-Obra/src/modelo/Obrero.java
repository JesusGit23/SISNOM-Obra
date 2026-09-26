package modelo;

// PILAR EVIDENCIADO: Herencia (Uso de 'extends' para heredar de Persona)
public class Obrero extends Persona {
    
    // Atributo específico del obrero según requerimiento RF-01
    private double tarifaPorHora;

    public Obrero(String nombre, String documentoIdentidad, double tarifaPorHora) {
        // Uso de 'super' para invocar el constructor de la clase padre
        super(nombre, documentoIdentidad, "Obrero");
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}