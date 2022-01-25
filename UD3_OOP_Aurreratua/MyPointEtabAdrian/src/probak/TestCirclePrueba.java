package probak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import model.*;

/**
 *
 * @author AdriAlex
 */
public class TestCirclePrueba {
    public static void main(String[] args) {
        
                
        //testear los constructores y el método toString()
        System.out.println("Probando constructores: \n");
        MyCircle c0 = new MyCircle();
        System.out.println(c0);
        MyCircle c1 = new MyCircle(2,1,5);
        System.out.println(c1);
        System.out.println("------------");
        System.out.println("------------");
        
        //testear los getters y setters
        System.out.println("Getters: \n");
        c0.setCenter(new MyPoint(3, 3));
        c0.setRadius(2);
        System.out.println(c0); //toString de MyCircle
        System.out.println("El centro es: " + c0.getCenter());
        System.out.println("El radio es: " + c0.getRadius());
        System.out.println("------------");
        System.out.println("------------");
        
        System.out.println("Setters: \n");
        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1); //toString() de MyCircle
        System.out.println("El centro en X es: " + c1.getCenterX());
        System.out.println("El centro en Y es: " + c1.getCenterY());
        System.out.println("");
        
        c1.setCenterXY(31, 32);
        System.out.println(c1); //toString() de MyCircle
        System.out.println("El centro en X es: " + c1.getCenterXY()[0]);
        System.out.println("El centro en Y es: " + c1.getCenterXY()[1]);
        System.out.println("------------");
        System.out.println("------------");
        
        //testear los métodos getArea() y getCircumference()
        System.out.println("Area: \n");
        System.out.printf("El area es: %.2f%n", c1.getArea());
        System.out.printf("La circunferencia es: %.2f%n", c1.getCircumference());
        
        
        
    }
}
