/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class TestCylinder {

    public static void main(String[] args) {
        
        //Constructor que utiliza valor por defecto
        Cylinder cy1 = new Cylinder();
        //Constructed a Cylinder with Cylinder()
        System.out.println("Cilindro con valores por defecto (+ ver datos) ");
        System.out.println("");
        System.out.println("Radio = " + cy1.getRadius());
        System.out.println("Color = " + cy1.getColor());
        System.out.println("Area de la base = " + cy1.getArea());
        System.out.println("Volumen = " + cy1.getVolume());
        System.out.println("--------------------");
        
        
        //constructor con los valores ALTURA y RADIO como entrada, respectivamente
        //construir un Circle con Circle(radius)
        //construir un Cylinder con Cylinder(height, radius)
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Cilindro pasando ALTURA y RADIO (+ ver datos)");
        System.out.println("");
        System.out.println("Radio = " + cy2.getRadius());
        System.out.println("Color = " + cy2.getColor());
        System.out.println("Area = " + cy2.getArea());
        System.out.println("Volumen = " + cy2.getVolume());
        
        //Radius is 2.0, Height is 5.0, Color is red,
        //Base area is 12.566370614359172, Volume is 62.83185307179586
    }
}
