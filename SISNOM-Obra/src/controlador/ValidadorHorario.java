package controlador;

import java.util.List;
import modelo.RegistroHoras;

// PILAR EVIDENCIADO: Separación de responsabilidades (Arquitectura MVC)
public class ValidadorHorario {

    /**
     * Verifica si un nuevo registro de horas se solapa con los registros existentes.
     * Resuelve el requerimiento RF-04.
     */
    public boolean existeCruceHorario(RegistroHoras nuevoRegistro, List<RegistroHoras> historialObrero) {
        
        for (RegistroHoras registroExistente : historialObrero) {
            // 1. Verificar si coinciden en la misma fecha
            if (nuevoRegistro.getFecha().equals(registroExistente.getFecha())) {
                
                // 2. Lógica de solapamiento: (InicioA < FinB) y (FinA > InicioB)
                boolean solapa = nuevoRegistro.getHoraInicio().isBefore(registroExistente.getHoraFin()) &&
                                 nuevoRegistro.getHoraFin().isAfter(registroExistente.getHoraInicio());
                
                if (solapa) {
                    return true; // Se encontró un cruce, se debe bloquear el guardado
                }
            }
        }
        return false; // No hay conflictos, es seguro guardar
    }

    /**
     * Devuelve el registro exacto que genera el conflicto para poder mostrar 
     * la alerta con la obra y el horario específico, como exige el RF-04.
     */
    public RegistroHoras obtenerRegistroEnConflicto(RegistroHoras nuevoRegistro, List<RegistroHoras> historialObrero) {
        
        for (RegistroHoras registroExistente : historialObrero) {
            if (nuevoRegistro.getFecha().equals(registroExistente.getFecha())) {
                
                boolean solapa = nuevoRegistro.getHoraInicio().isBefore(registroExistente.getHoraFin()) &&
                                 nuevoRegistro.getHoraFin().isAfter(registroExistente.getHoraInicio());
                
                if (solapa) {
                    return registroExistente; // Retorna el registro problemático
                }
            }
        }
        return null;
    }
}