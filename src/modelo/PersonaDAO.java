package modelo;
import java.util.List;
import javax.swing.JOptionPane;
import repositorio.Repositorio;
public class PersonaDAO {
    Repositorio repositorio = new Repositorio();
    
    public void agregarPersonaDAO (Persona persona){
        repositorio.agregarPersona(persona);
        
    }
    
    public void modificarPersonaDAO (Persona persona){
        JOptionPane.showMessageDialog(null, persona + "LLEGO A DAO MODIFICAR");
        repositorio.modificarPersona(persona);
    }
    
    public void eliminarPersonaDAO(Persona persona){
        repositorio.eliminarPersona(persona);
    }
    
    public Persona consultarDAO(String curp){
        return repositorio.buscarPersona(curp);
    }
    
    public List <Persona> getListaPersonasDAO(){
        List <Persona> listadoPersonas = Repositorio.getListaPersonas();
        return listadoPersonas;
    }
    
}
