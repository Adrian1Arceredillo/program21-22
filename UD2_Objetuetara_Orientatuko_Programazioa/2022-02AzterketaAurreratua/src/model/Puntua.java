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
public class Puntua implements Marrazgarria {
    
    private int x;
    private int y;
    private static int sortutakoPuntuak = 0;
    
    
    /**
     * Constructor por defecto. 
     */
    public Puntua() {
        this.x = 0;
        this.y = 0;
        ++sortutakoPuntuak;
    }
    
    
    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
        ++sortutakoPuntuak;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public static int getSortutakoPuntuak() {
        return sortutakoPuntuak;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Si el valor de X de un punto (A), es menor que el valor de X del otro 
     * punto (B), significa que el punto A está situado más hacia la izquierda. 
     * 
     * @param bestePuntuBat
     * @return 
     */
    public boolean isEzkerreragoThan(Puntua bestePuntuBat) {
        if (this.getX() < bestePuntuBat.getX()) {
            return true;
        }
        return false;
    }
    
    
    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    @Override
    public void marraztu() {
        System.out.println(this.toString() + " puntua GUI baten marraztua izan da. ");
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Puntua other = (Puntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    
    /**
     * Método ADICIONAL AL EXAMEN (ariketa gehigarriak). Este método 
     * recibirá los parámetros necesarios para desplazar el punto.
     * 
     * Estos parámetros serán: cuánto y hacia dónde
     * 
     * @param x
     * @param y 
     */
    public void mugitu(int x, int y) {
        
    }
    
    
    
    
    
}
