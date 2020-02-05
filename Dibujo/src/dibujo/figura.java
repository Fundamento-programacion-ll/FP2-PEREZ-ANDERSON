/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class figura extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawArc( 40, 35, 80, 80, 0, 360);
        g.drawLine(160, 75, 200, 75);
        g.setColor(Color.BLUE);
        g.fillArc( 40, 150, 80, 70,   0, 360);
    }
    
}
