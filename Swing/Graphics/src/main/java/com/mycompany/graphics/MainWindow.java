package com.mycompany.graphics;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MainWindow extends JFrame {

    public MainWindow(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        Graphic graphic = new Graphic();
        MainWindow window = new MainWindow("Learning Graphics");
        window.setVisible(true);
        window.setResizable(true);
        window.setSize(1366,768);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(graphic);
    }
}
