/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_deber;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
     double  n;

    public static void main(String[] args) {
        int op;
        double n1 = 0;
        double n2 = 0;
        double s=0;
        String u;
        String c;
        String nc = null;
        String usuario [] =  new  String [ 3 ];
        usuario [ 0 ] = " User1 " ;
        usuario [ 1 ] = " User2 " ;
        usuario [ 2 ] = " User3 " ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE USUARIO");
        u = sc.next();
        System.out.println("CONTRASEÑA");
        c = sc.next();
        
        if("123".equals(c) && "Paul".equals(u)){
        
        System.out.println("MENU");
        System.out.println("\nelija una opcion"
                +"\n1.-DEPOSITO"
                +"\n2.-RETIRO");
            
        op = sc.nextInt();
        
        switch(op){
        
            case 1:
                System.out.println("NUMERO DE CUENTA:");
            nc=sc.next();
                System.out.println("DEPOSITO");
                System.out.println("ingrese el monto");
                n1=sc.nextDouble();
                s=70+n1;
                
             
                break;
            case 2:
                System.out.println("NUMERO DE CUENTA:");
            nc=sc.next();
                System.out.println("RETIRO");
                System.out.println("ingrese el monto:");
                n2=sc.nextDouble();
                s=70-n2;
                break;
        
        }
        
        
        Solicitud_Saldo saldo = new Solicitud_Saldo(70,nc );
        Depositos dep = new Depositos(n1,nc);
        Retiros ret = new Retiros(n2, nc );
        System.out.println(""+saldo+"\n"+dep+"\n"+ret);
        System.out.println("SALDO TOTAL:"+s);
        
        
        
    }else{
            System.out.println("datos incorrectos");
        }
    
    }

}
