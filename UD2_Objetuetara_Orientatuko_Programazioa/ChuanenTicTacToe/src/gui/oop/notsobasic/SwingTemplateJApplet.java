/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.oop.notsobasic;

import javax.swing.*;

/**
 * Applet for ....
 */
@SuppressWarnings("serial")
public class SwingTemplateJApplet extends JApplet {

    /**
     * init() to setup the UI components
     */
    @Override
    public void init() {
        // Run GUI codes in the Event-Dispatching thread for thread safety
        try {
            // Use invokeAndWait() to ensure that init() exits after GUI construction
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    // Set the content-pane of "super" JApplet to an instance of main JPanel
                    setContentPane(new SwingTemplateJPanel());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
