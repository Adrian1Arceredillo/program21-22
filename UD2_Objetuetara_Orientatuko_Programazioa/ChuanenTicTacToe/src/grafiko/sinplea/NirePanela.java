package grafiko.sinplea;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Tic-Tac-Toe: Two-player Graphic version with better OO design. The Board and
 * Cell classes are separated in their own classes.
 */
@SuppressWarnings("serial")
public class NirePanela extends JPanel {

    /**
     * Constructor to setup the UI and game components
     */
    public NirePanela() {

    }

    @Override
    public void paintComponent(Graphics g) {  // invoke via repaint()
        super.paintComponent(g);    // fill background
        this.setBackground(Color.BLACK); // set its background color
        g.drawLine(this.getWidth() / 4, 0, this.getWidth() / 4, this.getHeight());
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        g.drawLine(0, 100, this.getWidth(), 100);
        g.drawLine(0, 200, this.getWidth(), 200);
        g.drawLine(0, 300, this.getWidth(), 300);
    }

    /**
     * The entry "main" method
     */
    public static void main(String[] args) {
        // Run GUI construction codes in Event-Dispatching thread for thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Adrian");
                // Set the content-pane of the JFrame to an instance of main JPanel
                frame.setContentPane(new NirePanela());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NirePanela.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                frame.setSize(400, 400);

            }
        });
    }
}


/*
Por ejemplo:
cuando ponemos el nombre de la clase (NirePanela), seguido de "extends" y 
luego "JPanel", hace que la clase "NirePanela" pueda utilizar los métodos 
de NirePanela y los de JPanel
*/
