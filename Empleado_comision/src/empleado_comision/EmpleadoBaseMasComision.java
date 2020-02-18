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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    double SalarioBase;

    public EmpleadoBaseMasComision(double SalarioBase, double VentasBrutas, double TarifaComision) {
        super(VentasBrutas, TarifaComision);
        this.SalarioBase = SalarioBase;
    }

    public EmpleadoBaseMasComision(double SalarioBase, double VentasBrutas, double TarifaComision, String Nombre, String Apellido, String CI) {
        super(VentasBrutas, TarifaComision, Nombre, Apellido, CI);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
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

   public double ingresos (){
   return SalarioBase * super.calcular_ingreso();
   
   }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" + "SalarioBase=" + SalarioBase + '}';
    }
   
   
    
}
