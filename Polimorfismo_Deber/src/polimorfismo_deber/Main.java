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
public class Main {

    public static void main(String[] args) {
        
        Solicitud_Saldo saldo = new Solicitud_Saldo(2000 );
        Depositos dep = new Depositos(1000);
        Retiros ret = new Retiros(500 );
        System.out.println(""+saldo+"\n"+dep+"\n"+ret);
        
        
        
    }

}
