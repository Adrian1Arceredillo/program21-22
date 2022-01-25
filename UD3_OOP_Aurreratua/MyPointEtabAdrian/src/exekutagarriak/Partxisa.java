package exekutagarriak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class Partxisa extends JPanel {

    public Partxisa() {

    }

    @Override
    public void paintComponent(Graphics g) {  // invoke via repaint()

        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);

        g.drawLine(this.getWidth() / 2 - 25, 100, this.getWidth() / 2 - 25, 900);
        g.drawLine(this.getWidth() / 2 + 25, 100, this.getWidth() / 2 + 25, 900);
        g.drawLine(150, this.getHeight() / 2 - 20, 1500,  this.getHeight() / 2 - 20);
        g.drawLine(150, this.getHeight() / 2 + 20, 1500, this.getHeight() / 2 + 20);
        this.setBackground(Color.GRAY);

        g2.setColor(Color.black);
        g2.drawRect(150, 100, 1350, 800); 
        
        g2.setColor(Color.RED); // A
        g2.drawOval(325, 200, 300, 200);  
        g2.setColor(Color.GREEN);   // B
        g2.drawOval(1025, 200, 300, 200);
        g2.setColor(Color.YELLOW);  // C
        g2.drawOval(1025, 600, 300, 200);
        g2.setColor(Color.BLUE);  // D
        g2.drawOval(325, 600, 300, 200);
        
        //g.drawOval(100-50, 300-50, 2*50, 2*50);

        //graphics.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    }

    public static void main(String[] args) {

        /*
        MyPoint p1 = new MyPoint(-3, 7);
        MyPoint p2 = new MyPoint(5, 4);
        MyPoint p3 = new MyPoint(-2, -1);
         */
        // Run GUI construction codes in Event-Dispatching thread for thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Adrian");
                // Set the content-pane of the JFrame to an instance of main JPanel
                frame.setContentPane(new Partxisa());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                /*Partxisa panel = new Partxisa();
                frame.add(panel);*/
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Partxisa.class.getName()).log(Level.SEVERE, null, ex);
                }

                frame.setSize(600, 600);

            }
        });
    }

}


/*
Video dibujar lineas con puntos:https://www.youtube.com/watch?v=lODT2uQs1B0
Método DrawLine: https://www.youtube.com/watch?v=UKTbLZjO4JU
*/
