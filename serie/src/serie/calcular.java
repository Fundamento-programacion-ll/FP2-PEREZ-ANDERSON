/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

/**
 *
 * @author Dell Administrador
 */
public class calcular {
    
    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public calcular(int n) {
        this.n = n;
    }
    public int calculo() {
        int result =1;
        for (int i = 1; i <= n; i++) {
            result=result*2;
        }
      return result;  
    }
    
}
