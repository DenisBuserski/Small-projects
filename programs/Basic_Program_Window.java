import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Basic_Program_Window {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("picture.png"); // Insert image

        Border border = BorderFactory.createLineBorder(Color.green, 3); // Color and size of window border

        JLabel label = new JLabel(); //JLabel label = new JLabel("Do you even code?"));
        label.setText("Do you even code?"); // Text inside the window

        label.setIcon(image); // Add image inside the window
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT, CENTER, RIGHT of the image
        label.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER, BOTTOM of the image
        label.setForeground(Color.red); // Text color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Text FONT
        label.setIconTextGap(20); // Distance between text and image
        label.setBackground(Color.blue); // Background color
        label.setOpaque(true); // Display background color

        label.setBorder(border); // Inset border
        label.setVerticalAlignment(JLabel.CENTER); // Move image and text
        label.setHorizontalAlignment(JLabel.CENTER); // Move image and text
        //label.setBounds(100,100,250, 250); // The placement of the text and icon

        // Create window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null); // + label.setBounds(0,0,250, 250);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // Resize image and text in window

    }
}
