/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=0;
       int n2=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        numero=sc.nextInt();
     primo_noprimo cal = new primo_noprimo(numero); 
        System.out.println("resultado"+cal.calculo());
        if(n2 == 1){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    
    
}}
