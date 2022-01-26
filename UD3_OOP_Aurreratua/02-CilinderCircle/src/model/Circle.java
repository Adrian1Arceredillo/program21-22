/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author arceredillo.adrian
 */
public class Circle {

    private double radius;
    private String color;

    /**
     * Constructor 1 -  Se creará un objeto del tipo Circle con
     * unos valores predefinidos.
     */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    
    /**
     * Se creará un objeto de tipo Circle, pasándole el valor del 
     * radio del mismo.
     * @param radius 
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    
    /**
     * Se creará un objeto de tipo Circle, pasándole tanto el valor del 
     * radio, como el color que tendrá.
     * @param radius 
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Método para obtener el RADIO del Circle
     * @return 
     */
    public double getRadius() {
        return this.radius;
    }
    
    /**
     * * Método para obtener el COLOR del Circle
     * @return 
     */
    public String getColor() {
        return this.color;
    }
    
    /**
     * Con este método podremos establecer un nuevo valor 
     * para el radio del Circle. Para ello, tendremos que pasar 
     * como parámetro un valor de tipo double.
     * @param radius 
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Con este método podremos establecer un nuevo valor para el color 
     * que tendrá el Circle. Para ello, tendremos que pasarle un valor en 
     * tipo String, el cual definirá el color que tendrá el mismo.
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devolverá información del objeto con el siguiente formato.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    /**
     * Devolverá el valor del área del Circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}
