package com.mycompany.spacegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;



public class GameWindow extends JPanel implements KeyListener,ActionListener {

    Timer timer = new Timer(5,this);
    private int elapsedTime = 0;
    private int ammo = 0;
    private BufferedImage image;
    private ArrayList<Bullet> bullets = new ArrayList<Bullet>();
    //Movement Directions
    private int bulletDirY = 1;
    private int ballX = 0;
    private int ballDirX = 3;
    private int spaceShipX = 0;
    private int spaceShipDirX = 20;
    private boolean flag = false;
    
    public boolean check(){
        
        for(Bullet bullet:bullets){
            if(new Rectangle(bullet.getX(),bullet.getY(),10,20).intersects(new Rectangle(ballX,0,20,20))){
                flag = true;
            }
        }
        return flag;
    }

    public GameWindow() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("rocket.png")));
            
        } catch (IOException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setBackground(Color.black);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        elapsedTime += 5;
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(ballX,0,20,20);
        g.drawImage(image, spaceShipX, 490, this);
        for(Bullet bullet:bullets){
            if(bullet.getY()<0){
                bullets.remove(bullet);
            }
        }
        g.setColor(Color.green);
        for(Bullet bullet:bullets){
            g.fillRect(bullet.getX(), bullet.getY(), 10, 20);
        }
        if(check()){
            timer.stop();
            String message = "You Won\nAmmo: " + ammo + "\nElapsed Time: " + elapsedTime/1000.0;
            JOptionPane.showMessageDialog(this,message);
            System.exit(0);
        }
        
    }

    @Override
    public void repaint() {
        super.repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        
        if(c == KeyEvent.VK_LEFT){
            if(spaceShipX <= 0){
                spaceShipX = 0;
            }
            else{
                spaceShipX -= spaceShipDirX;
            }
            
        }
        else if(c == KeyEvent.VK_RIGHT){
            if(spaceShipX >= 740){
                spaceShipX = 740;
            }
            else{
                spaceShipX += spaceShipDirX;
            }
        }
        else if(c == KeyEvent.VK_CONTROL){
            bullets.add(new Bullet(spaceShipX+15,490));
            ammo++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       for(Bullet bullet : bullets){
           bullet.setY(bullet.getY() - bulletDirY);
       }
       ballX += ballDirX;
       if(ballX >= 750){
           ballDirX = -ballDirX;
       }
       if(ballX <= 0){
           ballDirX = -ballDirX;
       }
       this.repaint();
    }

  
    
    
}
