
package empleado_comision;

public class Empleado_comision {

    
    public static void main(String[] args) {
        
   EmpleadoPorHoras h = new EmpleadoPorHoras(10, 8, "Paul", "Perez","12345");
   EmpleadoSalario p = new EmpleadoSalario(120, "Paul", "Perez", "123444");
        
        System.out.println(p);
        System.out.println(h);

    }
    
}
