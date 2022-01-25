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
public class MyCircle {
    
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
    
    /**
     * Constructor que se encargará de crear objetos del tipo MyCircle
     * NO tendrá parámetros de entrada
     */
    public MyCircle() {
        
    }
    
    /**
     * Constructor que creará un objeto del tipo MyCircle con determinados parámetros
     * @param x
     * @param y
     * @param radius 
     */
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    
    /**
     * Constructor al que se le pasará los valores de un punto y estos se guardarán 
     * como los valores del CENTRO DEL NUEVO CÍRCULO
     * También se le pasará el radius
     * @param center
     * @param radius 
     */
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    
    /**
     * Este método devolverá la distancia entre este circle y el que le 
     * digamos. Para ello, podemos utilizar el método "distance()" de 
     * la clase MyPoint
     * @param besteBat
     * @return 
     */
    public double distance(MyCircle besteCircleBat) {
        return center.distance(besteCircleBat.center);
    }
    
    
    /**
     * Este método devolverá True si el punto que nosotros le digamos, está
     * o no dentro del circle
     * @param puntua
     * @return 
     */
    public boolean isInside(MyPoint puntua) {
        /*Provisional*/
        int xDiff = this.center.getX() - puntua.getX();
        int yDiff = this.center.getY() - puntua.getY();
        if (Math.sqrt((xDiff * xDiff) + (yDiff * yDiff)) <= radius) {
            return true;
        }
        return false;
    }
    
    /**
     * Getter para obtener el área del circle
     * @return 
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    /**
     * Getter para obtener el centro del circle
     * -> se obtendrán datos como pueden ser (3, 1)
     * @return 
     */
    public MyPoint getCenter() {
        return center;
    }
    
    /**
     * Setter para establecer un nuevo center de este circle. Para ello, 
     * se le tendrá que pasar un punto (objeto tipo MyPoint) como parámetro. 
     * @param center 
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    
    /**
     * Devuelve la coordenada x del centro de este MyCircle
     *  -> NO se puede utilizar "center.x" ni "x" porque son privadas en MyPoint
     * @return 
     */
    public int getCenterX() {
        return center.getX();   
    }
    
    /**
     * Establecer un nuevo valor de X para el center de este circle
     * @param x 
     */
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    
    /**
     * Establecer un nuevo valor de Y para el center de este circle
     * @param y 
     */
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    
    /**
     * Establecer un nuevo valor de X e Y para el center de este circle
     * @param x
     * @param y 
     */
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }
    
    /**
     * Devuelve la coordenada x del centro de este MyCircle
     *  -> NO se puede utilizar "center.y" ni "y" porque son privadas en MyPoint
     * @return 
     */
    public int getCenterY() {
        return center.getY();   
    }
    
    /**
     * Llamaremos al método definido en la clase MyPoint
     * @return 
     */
    public int[] getCenterXY() {
        return center.getXY();
    }
    
    /**
     * Getter para obtener el valor (int) del radius
     * @return 
     */
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
    public String toString() {
        return "MyCircle[radius = " + this.getRadius() + ", center = " + center.toString() + "]";
    }
    
    /**
     * ??
     * Galdetu klasean
     * ??
     * @return 
     */
    public double getCircumference() {
        double zirkunferentziarenBalioa = Math.PI * 2 * radius;
        return zirkunferentziarenBalioa;
        
    }
    
    
    
    
    
    
    
    
}
