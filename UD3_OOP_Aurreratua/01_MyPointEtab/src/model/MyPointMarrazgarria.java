/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.MyPoint;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author arceredillo.adrian
 */
public class MyPointMarrazgarria extends MyPoint {
    
    Color kolorea = Color.BLUE;
    
    public MyPointMarrazgarria(int x, int y) {
        super(x, y);
    }
    
    
    public MyPointMarrazgarria(int x, int y, Color kolorea) {
        super(x, y);
        this.kolorea = kolorea;
    }
    
    
    public void marraztu(Graphics2D g2d) {
        g2d.setColor(kolorea);
        g2d.fillOval(getX(), getY(), 5, 5);
        
        g2d.drawString(this.toString(), getX() + 5, getY());
    }
    
    public void marraztuKartesiarretan(Graphics2D g2d, MyPoint jatorria) {
        g2d.setColor(kolorea);
        g2d.fillOval(
                jatorria.getX() + (this.getX()*40),
                jatorria.getY() - (this.getY()*40),
                5,
                5);
        
        g2d.drawString(
                this.toString(), 
                jatorria.getX() + (this.getX()*40) + 5, 
                jatorria.getY() - (this.getY()*40));
    }
    
}
