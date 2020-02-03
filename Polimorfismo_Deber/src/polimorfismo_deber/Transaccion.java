/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_deber;


public abstract class Transaccion {
    private String Ncuenta;

    

    public String getNcuenta() {
        return Ncuenta;
    }

    public void setNcuenta(String Ncuenta) {
        this.Ncuenta = Ncuenta;
    }
    
    public String obten_cuenta(){
    String N="1234567";
    this.Ncuenta=N;
        return Ncuenta;
    }
    
        
    
    public abstract double ejecutar();
    
}
