package Mouse_Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame1 extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon pic1;
    ImageIcon pic2;
    ImageIcon pic3;
    ImageIcon pic4;


    MyFrame1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        pic1 = new ImageIcon("face1.png");
        pic2 = new ImageIcon("face2.png");
        pic3 = new ImageIcon("face3.png");
        pic4 = new ImageIcon("face4.png");

        label.setIcon(pic1);

        this.add(label);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pic3);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(pic4);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(pic2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(pic1);
    }
}