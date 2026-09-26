package modelo;

import java.util.ArrayList;
import java.util.List;

// PILAR EVIDENCIADO: Encapsulamiento
public class Obra {
    
    private String nombre;
    private String ubicacion;
    // Listas para asignar múltiples obreros y capataces según RF-02
    private List<Capataz> capatacesAsignados;
    private List<Obrero> obrerosAsignados;

    public Obra(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capatacesAsignados = new ArrayList<>();
        this.obrerosAsignados = new ArrayList<>();
    }

    // Métodos para agregar personal a la obra
    public void agregarCapataz(Capataz capataz) {
        this.capatacesAsignados.add(capataz);
    }

    public void agregarObrero(Obrero obrero) {
        this.obrerosAsignados.add(obrero);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Capataz> getCapatacesAsignados() {
        return capatacesAsignados;
    }

    public void setCapatacesAsignados(List<Capataz> capatacesAsignados) {
        this.capatacesAsignados = capatacesAsignados;
    }

    public List<Obrero> getObrerosAsignados() {
        return obrerosAsignados;
    }

    public void setObrerosAsignados(List<Obrero> obrerosAsignados) {
        this.obrerosAsignados = obrerosAsignados;
    }
}