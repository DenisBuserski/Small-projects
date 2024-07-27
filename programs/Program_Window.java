import javax.swing.*;
import java.awt.*;

public class Program_Window {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creates window
        frame.setTitle("My first program"); // Window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit window and close program, when X is pressed
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Cannot press X
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Only closes the window

        frame.setResizable(false); // Cannot resize the window
        frame.setSize(420, 420); // Window size
        frame.setVisible(true); // Window visibility

        ImageIcon image = new ImageIcon("program_window_icon.png"); // Program window icon
        frame.setIconImage(image.getImage()); // Changes window icon

        // Changes window background color
        frame.getContentPane().setBackground(new Color(0,255, 0));
        frame.getContentPane().setBackground(Color.red);
        frame.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}
