/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class TestMyPointPrueba {
    public static void main(String[] args) {
        
        System.out.println("Probak: ");
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 6);
        MyPoint p3 = new MyPoint(9, 9);
        
        //ver los datos de los puntos p1 y p2
        System.out.println(p0);
        System.out.println(p1);
        System.out.println("----");
        
        //cambiar los valores de X e Y en (p3) con los setters correspondientes
        p3.setX(2); p3.setY(0);
        System.out.println(p3);
        System.out.println("----");
        
        //cambiar los valores de X e Y en (p3) de una sola vez
        System.out.println(p3);
        p3.setXY(89, 89);
        
        //obtener los valores de X e Y con los getters correspondientes
        System.out.println("X en p3 es: " + p3.getX());
        System.out.println("Y en p3 es: " + p3.getY());
        System.out.println("----");
        
        //testear el método getXY()[] -> REVISAR
        System.out.println(p1);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        
        //obtener la distancia que hay entre un punto y los valores especificados
        System.out.println(p1.distance(7, 7));
        System.out.println("----");
        
        //obtener la distancia entre dos puntos ya creados/existentes
        System.out.printf("%.4f\n", p1.distance(p2));   //p.e.: limitado a 4 decimales
        
        //obtener la distancia que desde este punto hasta (0, 0)
        System.out.println(p1.distance());
        
        
        
    }
}

/*
https://personal.ntu.edu.sg/ehchua/programming/java/J3f_OOPExercises.html#ExerciseComposition
*/
