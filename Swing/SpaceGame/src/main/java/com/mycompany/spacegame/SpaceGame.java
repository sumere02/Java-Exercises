package com.mycompany.spacegame;

import javax.swing.JFrame;

public class SpaceGame {
    public static void main(String[] args) {
        MainWindow window = new MainWindow("Space Game");
        window.setResizable(false);
        window.setFocusable(false);
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameWindow gameWindow = new GameWindow();
        gameWindow.requestFocus();
        gameWindow.addKeyListener(gameWindow);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        window.add(gameWindow);
        window.setVisible(true);
        
    }
}
