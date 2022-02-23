/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;

/**
 *
 * @author AdriAlex
 */
public class TestFiguras {
    public static void main(String[] args) {
        
        //Punto2D
        Punto2D p2a = new Punto2D(1, 2);
        System.out.println(p2a);
        System.out.println("----------------");
        
        //Círculo
        Figura2D circ1 = new Circulo(p2a, 3);   //pasando un punto como origen
        System.out.println(circ1.toString());
        
        Circulo c1 = (Circulo) circ1;
        System.out.printf("Perimetro: %.2f\n", c1.getPerimetro());
        System.out.printf("Area: %.2f\n", c1.getArea());
        System.out.println("----------------");
        
        
        Figura2D circ2 = new Circulo(2, 3, 5);   //creando un punto de origen
        System.out.println(circ2.toString());
        
        Circulo c2 = (Circulo) circ2;
        System.out.printf("Perimetro: %.2f\n", c2.getPerimetro());
        System.out.printf("Area: %.2f\n", c2.getArea());
        System.out.println("----------------");
        
        
        //Rectángulo
        Figura2D rec1 = new Rectangulo(p2a, 4, 7);
        System.out.println(rec1.toString());
        
        Rectangulo r1 = (Rectangulo) rec1;
        System.out.printf("Perimetro: %.2f\n", r1.getPerimetro());
        System.out.printf("Area: %.2f\n", r1.getArea());
        System.out.println("----------------");
        
    }
}
