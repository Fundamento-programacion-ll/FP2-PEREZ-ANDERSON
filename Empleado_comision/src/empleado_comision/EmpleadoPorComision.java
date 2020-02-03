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
public class EmpleadoPorComision extends Empleado{
    
    double VentasBrutas;
    double TarifaComision;

    public EmpleadoPorComision(double VentasBrutas, double TarifaComision) {
        this.VentasBrutas = VentasBrutas;
        this.TarifaComision = TarifaComision;
    }

    public EmpleadoPorComision(double VentasBrutas, double TarifaComision, String Nombre, String Apellido, String CI) {
        super(Nombre, Apellido, CI);
        this.VentasBrutas = VentasBrutas;
        this.TarifaComision = TarifaComision;
    }

    public double getVentasBrutas() {
        return VentasBrutas;
    }

    public void setVentasBrutas(double VentasBrutas) {
        this.VentasBrutas = VentasBrutas;
    }

    public double getTarifaComision() {
        return TarifaComision;
    }

    public void setTarifaComision(double TarifaComision) {
        this.TarifaComision = TarifaComision;
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
    return VentasBrutas * TarifaComision;

    }

    @Override
    public String toString() {
        return "Empleado por Comision "+calcular_ingreso();
    }
    
    
    
}
