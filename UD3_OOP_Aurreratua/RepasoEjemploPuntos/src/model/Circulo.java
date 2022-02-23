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
public class Circulo extends Figura2D implements Operaciones {
    
    private double radio;
    
    
    /**
     * Constructor que nos permite introducir los valores del 
     * origen (indicando "x" e "y") y el radio.
     * 
     * @param x
     * @param y 
     * @param radio 
     */
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    
    /**
     * Constructor que nos permite introducir los valores del 
     * origen (pasando un elemento de tipo Punto2D) y el radio.
     * 
     * @param origen
     * @param radio
     */
    public Circulo(Punto2D origen, double radio) {
        super(origen);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void especificarNuevoOrigen(int xNuevoOrigen, int yNuevoOrigen) {
        Punto2D nuevoOrigen = new Punto2D(xNuevoOrigen, yNuevoOrigen);
        this.setOrigen(nuevoOrigen);
    }
    
    @Override
    public double getPerimetro() {
        double perimetro = 2 * Math.PI * this.getRadio();
        return perimetro;
    }
    
    @Override
    public double getArea() {
        double area = Math.PI * (radio * radio);
        return area;
    }
    
    
    @Override
    public String toString() {
        return "Circulo-{origen= " + this.getOrigen() + ", radio= " + this.getRadio() + "}";
    }
    
}
