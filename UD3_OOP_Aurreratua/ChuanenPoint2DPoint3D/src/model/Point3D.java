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
public class Point3D extends Point2D {
    
    private int z = 0;
    
    
    /**
     * Constructor por defecto. 
     */
    public Point3D() {
        
    }
    
    /**
     * Constructor que recibe como parámetro de entrada los valores 
     * de los atributos ("x" e "y") de la clase padre (Point2D) y el 
     * valor del atributo "z" de la subclase "Point3D". 
     * 
     * @param x
     * @param y
     * @param z 
     */
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    /**
     * Devuelve en forma de string los datos del objeto. En este 
     * caso los valores de los atributos "x", "y", "z". 
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
    
}
