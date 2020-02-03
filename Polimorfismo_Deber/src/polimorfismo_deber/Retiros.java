/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_deber;

/**
 *
 * @author Dell
 */
public class Retiros extends Transaccion{
   double monto;

    public Retiros(double monto) {
        
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public double ejecutar() {
     
      return monto;

    }

    @Override
    public String toString() {
        return "-----------------"
                +"\nRetiros:"+monto
                +"\n# Cuenta :"+obten_cuenta()
                +"\n-----------------";
    }
    
   
   
    
}
