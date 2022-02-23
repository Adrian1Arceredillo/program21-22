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
public class Rectangulo extends Figura2D implements Operaciones {

    private int anchura;
    private int altura;

    public Rectangulo(Punto2D origen, int anchura, int altura) {
        super(origen);
        this.altura = altura;
        this.anchura = anchura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void especificarNuevoOrigen(int xNuevoOrigen, int yNuevoOrigen) {
        Punto2D nuevoOrigen = new Punto2D(xNuevoOrigen, yNuevoOrigen);
        this.setOrigen(nuevoOrigen);
    }
    
    @Override
    public double getPerimetro() {
        double perimetroRectangulo = (2 * this.altura) + (2 * this.anchura);
        return perimetroRectangulo;
    }
    
    @Override
    public double getArea() {
        double areaRectangulo = this.altura * this.anchura;
        return areaRectangulo;
    }
    
    
    @Override
    public String toString() {
        return "Rectangulo-{origen=" + this.getOrigen() + ", anchura= " + this.getAnchura() + ", altura= " + this.getAltura() + ", area=" + this.getPerimetro() + "}" ;
    }

}
