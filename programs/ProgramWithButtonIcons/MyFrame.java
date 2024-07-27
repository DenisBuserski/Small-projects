package ProgramWithButtonIcons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton appleButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon appleIcon;
    ImageIcon hotdogIcon;

    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("pizza.png");
        appleIcon = new ImageIcon("apple.png");
        hotdogIcon = new ImageIcon("hotdog.png");

        pizzaButton = new JRadioButton("Pizza");
        appleButton = new JRadioButton("Apple");
        hotdogButton = new JRadioButton("Hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(appleButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        appleButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        appleButton.setIcon(appleIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(appleButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        } else if (e.getSource() == appleButton) {
            System.out.println("You ordered apple!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered hotdog!");
        }
    }
    
}
