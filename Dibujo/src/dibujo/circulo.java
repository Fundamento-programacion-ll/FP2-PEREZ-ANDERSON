/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class circulo extends punto {

    int radio;

    circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public circulo(int x, int y) {
        super(x, y);
    }

    public circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public void Dcirculo() {
       
    }

}
