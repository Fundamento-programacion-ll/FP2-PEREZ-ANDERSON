/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;


import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class Dibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Graphics g = null;
        //punto pto = new punto();
        //JFrame ventana = new JFrame("contexto grafico");
        //ventana.add(pto.Dibujo(g));
        //ventana.setSize(700,400);
        //ventana.setVisible(true);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        
        JFrame f = new JFrame("Ventana con Contexto Grafico");
        figura panel=new figura(); 
        f.add(panel);
        f.setBounds(280, 150, 500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
        

    }
    
}
