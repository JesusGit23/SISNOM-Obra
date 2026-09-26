package modelo;

// PILAR EVIDENCIADO: Abstracción (Clase abstracta que define el molde general)
public abstract class Persona {
    
    // PILAR EVIDENCIADO: Encapsulamiento (Atributos privados)
    private String nombre;
    private String documentoIdentidad;
    private String tipoPersona;

    public Persona(String nombre, String documentoIdentidad, String tipoPersona) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.tipoPersona = tipoPersona;
    }

    // PILAR EVIDENCIADO: Encapsulamiento (Métodos Getters y Setters públicos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}