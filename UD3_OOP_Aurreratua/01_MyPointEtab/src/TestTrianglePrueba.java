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
public class TestTrianglePrueba {
    public static void main(String[] args) {
        
        
        //crear 3 puntos que serán los vértices del triángulo
        System.out.println("Puntos: ");
        MyPoint p1 = new MyPoint(2,2);
        MyPoint p2 = new MyPoint(3,3);
        MyPoint p3 = new MyPoint(4,4);
        
        System.out.println(p1); System.out.println(p2); System.out.println(p3); //print los 3 puntos
        System.out.println("------------");
        
        //Triangulo (t1) pasando valores para CADA PUNTO
        System.out.println("Triangulo pasando TODOS los valores:");
        MyTriangle t1 = new MyTriangle(1,2,3,4,5,6);
        
        System.out.println(t1);
        System.out.printf("Perimetro = %.4f\n", t1.getPerimeter());
        System.out.println("Tipo: " + t1.getType());
        System.out.println("------------");
        
        
        //Triangulo (t2) pasando los PUNTOS YA CREADOS
        System.out.println("Triangulo pasandole PUNTOS YA CREADOS:");
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        
        System.out.println(t2);
        System.out.printf("Perimetro = %.4f\n", t2.getPerimeter());
        System.out.println("Tipo: " + t2.getType());
        System.out.println("------------");
        
        
        
    }
}
