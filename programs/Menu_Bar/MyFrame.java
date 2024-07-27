package Menu_Bar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("home.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("quit.png");

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        // Key shortcuts
        fileMenu.setMnemonic(KeyEvent.VK_F); // ALT + F
        editMenu.setMnemonic(KeyEvent.VK_E); // ALT + E
        helpMenu.setMnemonic(KeyEvent.VK_H); // ALT + H
        loadItem.setMnemonic(KeyEvent.VK_L); // L
        saveItem.setMnemonic(KeyEvent.VK_S); // S
        exitItem.setMnemonic(KeyEvent.VK_E); // E

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Denis is loaded!");
        } else if (e.getSource() == saveItem) {
            System.out.println("Denis is saved!");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
    
}
