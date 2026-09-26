package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Capataz;
import modelo.Obrero;
import modelo.Persona;

// PILAR EVIDENCIADO: Separación de responsabilidades (Arquitectura MVC)
public class ObreroController {
    
    // Listas temporales para almacenar los registros en memoria
    private List<Obrero> listaObreros;
    private List<Capataz> listaCapataces;

    public ObreroController() {
        this.listaObreros = new ArrayList<>();
        this.listaCapataces = new ArrayList<>();
    }

    // --- Métodos para cumplir con el RF-01 ---

    public boolean registrarObrero(String nombre, String documento, double tarifa) {
        // Validar que los datos no vengan vacíos
        if (nombre.isEmpty() || documento.isEmpty() || tarifa <= 0) {
            return false;
        }
        Obrero nuevoObrero = new Obrero(nombre, documento, tarifa);
        listaObreros.add(nuevoObrero);
        return true; // Registro exitoso
    }

    public boolean registrarCapataz(String nombre, String documento) {
        if (nombre.isEmpty() || documento.isEmpty()) {
            return false;
        }
        Capataz nuevoCapataz = new Capataz(nombre, documento);
        listaCapataces.add(nuevoCapataz);
        return true;
    }

    // Métodos para que la vista (las tablas) puedan consultar los datos
    public List<Obrero> obtenerTodosLosObreros() {
        return listaObreros;
    }

    public List<Capataz> obtenerTodosLosCapataces() {
        return listaCapataces;
    }
}