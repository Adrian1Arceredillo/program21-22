/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arceredillo.adrian
 */
public class MyLine {
    
    private MyPoint begin;  //instancias de la clase "MyPoint"
    private MyPoint end;    //instancias de la clase "MyPoint"
    
    
    /**
     * Constructor que, dados 2 puntos en (x1, y1) and (x2, y2) crea 
     * una línea.
     * @param x1
     * @param xy
     * @param x2
     * @param y2 
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);        
    }
    
    /**
     * Constructor que crea una instancia MyLine, recibiendo 
     * dos instancias MyPoint (recibiendo 2 puntos)
     * @param begin
     * @param end 
     */
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     * Getter para obtener el valor de "begin"
     * @return 
     */
    public MyPoint getBegin() {
        return begin;
    }
    
    /**
     * Getter para obtener el valor de "end"
     * @return 
     */
    public MyPoint getEnd() {
        return end;
    }
    
    //seguir haciendo
    
}
