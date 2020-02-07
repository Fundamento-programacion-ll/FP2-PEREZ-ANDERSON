
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class provincias {
    
    private String nombre;
    private int num_hab;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    public provincias() {
        String datos ;
                datos= JOptionPane.showInputDialog(null,"Ingrese los datos separados por punto y coma");
        StringTokenizer tokens = new StringTokenizer(datos,",");
        this.nombre=tokens.nextToken();
        this.num_hab=Integer.parseInt(tokens.nextToken());
    }

    public provincias(String nombre, int num_hab) {
        this.nombre = nombre;
        this.num_hab = num_hab;
    }

    @Override
    public String toString() {
        return ""+ getNombre()+ " habitantes: "+getNum_hab();
    }
    
    
    
}
