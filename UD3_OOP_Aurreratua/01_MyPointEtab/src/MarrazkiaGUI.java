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
public class MarrazkiaGUI extends JPanel {

    public MarrazkiaGUI() {

    }

    @Override
    public void paintComponent(Graphics g) {  // invoke via repaint()
        
        //puntuak
        MyPoint p1 = new MyPoint(-3, 7);    //A
        MyPoint p2 = new MyPoint(5, 4);     //B
        MyPoint p3 = new MyPoint(-2, -1);   //C
        
        //distancia
        int xPuntoA = (int) p1.distance(0, this.getHeight() * 2);
        int xPuntoB = (int) p2.distance(0, this.getHeight() * 2);
        
        
        //valores punto A
        int xA = (int) p1.distance(0, 200);
        int yA = (int) p1.distance(200, 0);
        
        int xDeA = this.getWidth() - (this.getWidth() - xA);
        int yDeA = this.getHeight() - (this.getHeight() - yA);
        
        //valores punto B
        int xB = (int) p2.distance(this.getWidth() / 2, this.getHeight() / 2);
        int yB = (int) p2.distance(200, 0);
        
        int xDeB = this.getWidth() - (this.getWidth() - xB);
        int yDeB = this.getHeight() - (this.getHeight() - yB);
        
        
        super.paintComponent(g);    // fill background
        this.setBackground(Color.WHITE); // set its background color
        
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2 - xDeA, 140, this.getHeight() - 100, 40);
        g.drawPolyline(new int[] {p1.getX() * -100, p2.getX() * 100, p3.getX() * 100}, new int[] {p1.getY() * 100, p2.getY() * 100, p3.getY() * 100}, 3);
        
        g.drawLine(p1.getX(), p1.getY(), p2.getY(), p2.getY());
        g.drawLine(p2.getX(), p2.getY(), p3.getY(), p3.getY());
        g.drawLine(p3.getX(), p3.getY(), p1.getY(), p1.getY());
        
        g.drawLine(
                //this.getWidth() - ((p1.getX() * -1) + p2.getX()), 
                this.getWidth() / (p1.getX() * - 1), 
                (this.getHeight() / p1.getY()), 
                this.getWidth() / p2.getX(), 
                this.getWidth() / p2.getY()
        );
        
        
        /*g.drawLine(
                //this.getWidth() - ((p1.getX() * -1) + p2.getX()), 
                0, 
                (this.getHeight() / 2 ) + this.getHeight() - p1.getY(), 
                this.getWidth() / p2.getX(), 
                this.getWidth() / p2.getY()
        );*/
        
        
        
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
                frame.setContentPane(new MarrazkiaGUI());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                /*MarrazkiaGUI panel = new MarrazkiaGUI();
                frame.add(panel);*/
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MarrazkiaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                frame.setSize(500, 500);

            }
        });
    }

}


/*
Video dibujar lineas con puntos:https://www.youtube.com/watch?v=lODT2uQs1B0
Método DrawLine: https://www.youtube.com/watch?v=UKTbLZjO4JU
*/