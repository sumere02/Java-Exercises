
package com.mycompany.graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Graphic extends JPanel{

    public Graphic() {
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(200, 100, 30, 40);
        g.setColor(Color.blue);
        g.drawOval(1000, 10, 30, 40);
        g.fillOval(200, 200, 30, 40);
        g.setColor(Color.yellow);
        g.drawLine(100,100,300,300);
        
    }
    
    
    
    
}
