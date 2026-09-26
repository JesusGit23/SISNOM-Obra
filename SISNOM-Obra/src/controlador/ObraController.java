package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Capataz;
import modelo.Obra;
import modelo.Obrero;

public class ObraController {
    
    private List<Obra> listaObras;

    public ObraController() {
        this.listaObras = new ArrayList<>();
    }

    // --- Métodos para cumplir con el RF-02 ---

    public boolean registrarObra(String nombre, String ubicacion) {
        if (nombre.isEmpty() || ubicacion.isEmpty()) {
            return false;
        }
        Obra nuevaObra = new Obra(nombre, ubicacion);
        listaObras.add(nuevaObra);
        return true;
    }

    public boolean asignarCapatazAObra(Obra obra, Capataz capataz) {
        if (obra != null && capataz != null) {
            obra.agregarCapataz(capataz);
            return true;
        }
        return false;
    }

    public boolean asignarObreroAObra(Obra obra, Obrero obrero) {
        if (obra != null && obrero != null) {
            obra.agregarObrero(obrero);
            return true;
        }
        return false;
    }

    public List<Obra> obtenerTodasLasObras() {
        return listaObras;
    }
}