package Program_With_Buttons_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("picture.png");
        ImageIcon icon2 = new ImageIcon("new-picture.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(300, 300, 250, 250);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(50, 50, 200, 250);
        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("You are gay")); // When button clicked -> Prints on the console
        button.setText("A Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(10);
        button.setForeground(Color.blue);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("You are gay");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
    
}
