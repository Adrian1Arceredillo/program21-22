/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.oop.notsobasic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ... Purpose of this program ...
 */
@SuppressWarnings("serial")
public class SwingTemplateJPanel extends JPanel {
    // Name-constants

    public static final int CANVAS_WIDTH = 640;
    public static final int CANVAS_HEIGHT = 480;
    public static final String TITLE = "...Title...";
    // ......

    // Declare private variables of GUI components
    // ......
    /**
     * Constructor to setup the GUI components
     */
    public SwingTemplateJPanel() {
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        // "super" JPanel container sets layout
        // setLayout(new ....Layout());

        // Allocate the GUI components
        // .....
        // "super" JPanel adds components
        // add(....)
        // Source objects add listeners
        // .....
    }

    /**
     * Custom painting codes on this JPanel
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // fill background
        setBackground(Color.BLACK);

        // Custom painting codes
        // ......
    }

    /**
     * The entry main() method
     */
    public static void main(String[] args) {
        // Run GUI codes in the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame(TITLE);
                // Set the content-pane of the JFrame to an instance of main JPanel
                frame.setContentPane(new SwingTemplateJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();                      // JFrame packs its components
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it
            }
        });
    }
}
