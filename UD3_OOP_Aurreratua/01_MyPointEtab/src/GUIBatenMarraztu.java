/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.MyPoint;
import model.*;


@SuppressWarnings("serial")

public class GUIBatenMarraztu extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.DARK_GRAY);
        g2d.drawString("Testu bat idazi dut", TOP_ALIGNMENT, TOP_ALIGNMENT);

        g2d.setColor(Color.RED);
        int erradioa = 20;
        g2d.fillOval(0, 0, erradioa*2, erradioa);

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawLine(100,0 ,100,300);
        
        MyPoint p = new MyPoint((int)Math.random()*50,(int)Math.random()*50);
        p.marraztu(g2d);        

    }

    public GUIBatenMarraztu() {
          System.out.println("JFramea sortua, baina momentuz ez dago ikusgai.");       
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFramearen Izenburua");
        frame.add(new GUIBatenMarraztu());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

    }
}
