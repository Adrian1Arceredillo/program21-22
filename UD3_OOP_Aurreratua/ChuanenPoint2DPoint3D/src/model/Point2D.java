/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AdriAlex
 */
public class Point2D {
    
    private int x = 0;
    private int y = 0;
    
    /**
     * Constructor por defecto.
     */
    public Point2D() {
        
    }
    
    /**
     * Constructor que recibirá como parámetro de entrada 
     * los valores para los atributos "x" e "y". 
     * 
     * @param x
     * @param y 
     */
    public Point2D (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Devuelve en forma de string los datos del objeto. En este 
     * caso los valores de los atributos "x" e "y". 
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    
}
