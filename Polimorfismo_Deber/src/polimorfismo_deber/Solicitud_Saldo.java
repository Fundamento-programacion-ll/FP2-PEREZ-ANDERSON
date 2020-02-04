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
public class Solicitud_Saldo extends Transaccion{
    double saldo;

    public Solicitud_Saldo(double saldo, String Ncuenta) {
        super(Ncuenta);
        this.saldo = saldo;
    }

  

   

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    @Override
    public double ejecutar() {
          
        this.saldo=saldo;
        return saldo ;
        
    }

    @Override
    public String toString() {
        return "-----------------"
                +"\n# Cuenta : "+getNcuenta()
                +"\nSaldo cuenta : "+getSaldo()
                +"\n-----------------";
    }
    
    
}
