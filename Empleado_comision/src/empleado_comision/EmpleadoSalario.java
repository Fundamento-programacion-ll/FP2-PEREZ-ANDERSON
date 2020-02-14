/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado_comision;

/**
 *
 * @author Dell
 */
public class EmpleadoSalario extends Empleado{
    
    double SalarioSemanal;

    

    public EmpleadoSalario(double SalarioSemanal, String Nombre, String Apellido, String CI) {
        super(Nombre, Apellido, CI);
        this.SalarioSemanal = SalarioSemanal;
    }

    public double getSalarioSemanal() {
        return SalarioSemanal;
    }

    public void setSalarioSemanal(double SalarioSemanal) {
        this.SalarioSemanal = SalarioSemanal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

   

    @Override
    public double calcular_ingreso() {
     return SalarioSemanal * 4;

    }
     @Override
    public String toString() {
        return "empleadoAsalariado:" + getNombre()+ "\nApellido:"+getApellido()+ "\nCI:" +getCI()+"\nSalario_Semanal:"+calcular_ingreso();
    }
    
    
}
