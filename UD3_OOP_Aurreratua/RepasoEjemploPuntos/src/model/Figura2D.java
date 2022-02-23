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
public class Figura2D {
    
    private Punto2D origen;
    
    
    public Figura2D(int x, int y) {
        origen = new Punto2D(x, y);
        //this.origen.setX(x);
        //this.origen.setY(y);
    }
    
    public Figura2D(Punto2D origen) {
        this.origen = origen;
    }

    public Punto2D getOrigen() {
        return origen;
    }

    public void setOrigen(Punto2D origen) {
        this.origen = origen;
    }
    
    
    @Override
    public String toString() {
        return "fwqwqw";
    }
    
}
