package repositorio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Persona;

public class Repositorio {

    private static List<Persona> listaPersonas = new ArrayList<Persona>();

    public static List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    private int existePersona(Persona persona) {
        for (Persona personaTemporal : listaPersonas) {
            if (persona.equals(personaTemporal)) {
                return listaPersonas.indexOf(personaTemporal);
            }
        }
        return -1;
    }

    public void agregarPersona(Persona persona) {
        if (existePersona(persona) < 0) {
            listaPersonas.add(persona);
        } else {
            JOptionPane.showMessageDialog(null, "ESTA PERSONA YA EXISTE");
        }
    }

    public void modificarPersona(Persona persona) {
        int posicion = existePersona(persona);
        if (posicion > -1) {
            listaPersonas.set(posicion, persona);
        } else {
            JOptionPane.showMessageDialog(null, "ESTA PERSONA NO EXISTE");
        }
    }

    public void eliminarPersona(Persona persona) {
        int posicion = existePersona(persona);
        if (posicion > -1) {
            listaPersonas.remove(posicion);
        } else {
            JOptionPane.showMessageDialog(null, "ESTA PERSONA NO EXISTE");
        }
    }

    public Persona buscarPersona(String curp) {
        for (Persona cte : listaPersonas) {
            if (curp.equals(cte.getCurp())) {
                return cte;
            }
        }
        return null;
    }
}
