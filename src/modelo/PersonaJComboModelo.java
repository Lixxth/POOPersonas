package modelo;
import java.util.List;
import javax.swing.JComboBox;
import repositorio.Repositorio;
public class PersonaJComboModelo {
    private List<Persona> personas = Repositorio.getListaPersonas();
    
    public void rellenarCombo(JComboBox comboBox){
        for (Persona persona : personas) {
            comboBox.addItem(persona);
        }
    }
    
    public void vaciarCombo(JComboBox comboBox){
        comboBox.removeAllItems();
    }
}
