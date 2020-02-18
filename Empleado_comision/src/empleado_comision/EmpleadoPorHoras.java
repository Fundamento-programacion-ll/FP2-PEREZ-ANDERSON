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
public class EmpleadoPorHoras extends Empleado{
    
    double Sueldo;        
    double Horas;

    public EmpleadoPorHoras(double Sueldo, double Horas) {
        this.Sueldo = Sueldo;
        this.Horas = Horas;
    }

    public EmpleadoPorHoras(double Sueldo, double Horas, String Nombre, String Apellido, String CI) {
        super(Nombre, Apellido, CI);
        this.Sueldo = Sueldo;
        this.Horas = Horas;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double getHoras() {
        return Horas;
    }

    public void setHoras(double Horas) {
        this.Horas = ((Horas > 0 && Horas <= 168) ? Horas : 0);
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getApellido() {
        return Apellido;
    }

    @Override
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

return Sueldo * Horas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras"+ "Sueldo="+calcular_ingreso();
    }
    


}
