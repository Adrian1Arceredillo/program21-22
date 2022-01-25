/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author arceredillo.adrian
 */
public class MyPoint {
    
    private int x;
    private int y;
    
    /** Constructor
     * 
     */
    public MyPoint() {
        
    }

    
    /**
     * Constructor al que se le pasan unos determinados valores para "X" e "Y"
     * @param x
     * @param y 
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Este getter obtiene el valor de la variable X
     * @return 
     */
    public int getX() {
        return x;
    }
    
    /**
     * Este getter obtiene el valor de la variable Y
     * @return 
     */
    public int getY() {
        return y;
    }

    /**
     * Con este setter podremos establecer un nuevo valor para la varaible X
     * @param x 
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Con este setter podremos establecer un nuevo valor para la varaible Y
     * @param y 
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Devuelve un int[] de 2 elementos de {x,y}. El valor [0] será el 
     * dato correspondiente a la variable X, y el valor en [1] pertenecerá 
     * a la variable Y.
     * @return 
     */
    public int[] getXY() {
        int arrayValoresXY[] = new int[2];
        arrayValoresXY[0] = this.getX();
        arrayValoresXY[1] = this.getY();
        return arrayValoresXY;
    }
    
    /**
     * Mediante este método, podemos cambiar los valores X e Y del punto 
     * de una sola vez.
     * @param x
     * @param y 
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Devolverá los datos del punto con el siguiente formato:
     *      - puntuarenIzena(x,y)
     * @return 
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    
    /**
     * Distancia desde este punto hasta el punto dado en (x,y)
     * @param x
     * @param y
     * @return 
     */
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
    
    /**
     * Distancia desde este/un punto hasta otro.
     * @return 
     */
    public double distance(MyPoint bestePuntuBat) {
        int xDiff = this.x - bestePuntuBat.x;
        int yDiff = this.y - bestePuntuBat.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
    
    
    /**
     * Devuelve la distancia de aquí hasta (0, 0)
     * @return 
     */
    public double distance() {
        int xEnCero = 0;
        int yEnCero = 0;
        
        int xDiff = this.x - xEnCero;
        int yDiff = this.y - yEnCero;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyPoint other = (MyPoint) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    
    
}
