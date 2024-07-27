package WindowObjects;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;

    MyPanel() {
        image = new ImageIcon("icon.png").getImage();
        this.setPreferredSize(new Dimension(500, 500)); // Set Window size
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0,null); // Draw image

        g2D.setPaint(Color.blue); // Choose color

        g2D.setStroke(new BasicStroke(5)); // Line thickness
        g2D.drawLine(0, 0, 500, 500); // Draw line from right top to left bottom

        g2D.drawRect(0, 0, 100, 200); // Draw rectangle
        // If we have a line and a rectangle they will be one top of the other
        g2D.setPaint(Color.pink); // Rectangle inner color
        g2D.fillRect(0, 0, 100, 200); // Set Rectangle position

        g2D.setPaint(Color.orange);
        g2D.drawOval(0, 0, 100, 100); // Draw circle
        g2D.fillOval(0, 0, 100, 100); // Fill color

        g2D.setPaint(Color.red);
        g2D.drawArc(0, 0, 100, 100, 0, 180); // Draw arc
        g2D.fillArc(0, 0, 100, 100, 0, 180); // Fill arc

        g2D.setPaint(Color.white);
        g2D.fillArc(0, 0, 100, 100, 180, 180);

        int [] xPoints = {150, 250, 350};
        int [] yPoints = {300, 150, 300};
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(xPoints, yPoints, 3); // Draw triangle
        g2D.fillPolygon(xPoints, yPoints, 3); // Fill triangle

        g2D.setPaint(Color.green);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50)); // Set text font
        g2D.drawString("You are a winner", 50, 50); // Draw text

    }
}