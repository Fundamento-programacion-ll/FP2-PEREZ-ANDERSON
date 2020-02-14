/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

/**
 *
 * @author Dell
 */
public class primo_noprimo {
    int numero;

    public primo_noprimo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int calculo (){
        int n2=numero-1;
        while((numero%n2) != 0){
            n2--;
        }
        return n2;
        
    }
    
    }

