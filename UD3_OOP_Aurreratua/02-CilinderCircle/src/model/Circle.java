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
        System.out.println("Construced a Circle with Circle(radius)");  // for debugging
    }
    
    /**
     * Se creará un objeto de tipo Circle, pasándole tanto el valor del 
     * radio, como el color que tendrá.
     * @param radius 
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius, color)");  // for debugging
    }

    // public getters and setters for the private variables
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a self-descriptive String
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    /**
     * Returns the area of this Circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
