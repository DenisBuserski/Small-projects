package MovingRocketGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        this.addKeyListener(this);

        icon = new ImageIcon("rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);

//        label.setBackground(Color.red);
//        label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - 10, label.getY()); // Left
            case 38 -> label.setLocation(label.getX(), label.getY() - 10); // Up
            case 39 ->label.setLocation(label.getX() + 10, label.getY()); // Right
            case 40 -> label.setLocation(label.getX(), label.getY() + 10); // Down
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { // Prints pressed keys
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode()); // Number of the button
    }
    
}
