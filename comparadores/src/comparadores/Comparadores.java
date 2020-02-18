
package comparadores;



public class Comparadores {

   
    public static void main(String[] args) {
        
        String salida="";
        pais p  = new pais();
        p.setListaprovincias();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
        p.ordenarp();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
    }
    
}
