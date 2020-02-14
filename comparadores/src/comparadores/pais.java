
package comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class pais {
    private ArrayList<provincias> listaprovincias;

    public ArrayList<provincias> getListaprovincias() {
        return listaprovincias;
    }

    public void setListaprovincias() {
        int opcion ;
        provincias provincia;
        do {            
            provincia = new provincias();
            agregarprov(provincia);
            
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION); 
        
        
    }

    public pais(ArrayList<provincias> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }
    //aqui se inicializan las variables
    public pais() {
        this.listaprovincias = new ArrayList<>();
        
    }
    
    public void agregarprov (provincias p){
        
    this.listaprovincias.add(p);
    }
    
    public void ordenarp (){
    
     Collections.sort(listaprovincias, new comparador());
    }

    @Override
    public String toString() {
        return "Los paises son "+ this.listaprovincias.toString()+ "";
    }
}
