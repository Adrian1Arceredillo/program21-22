package probak;

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
        
        System.out.println("Probak: ");   //crear puntos
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 6);
        MyPoint p3 = new MyPoint(9, 9);
        
        //ver los datos de los puntos p1 y p2
        System.out.println("------------");
        System.out.println("Ver puntos creados: ");
        System.out.println("");
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("------------");
        
        //cambiar los valores de X e Y en (p3) con los setters correspondientes
        System.out.println("Cambiar valores en p3: ");
        System.out.println("");
        p3.setX(2); p3.setY(0);
        System.out.println(p3);
        System.out.println("------------");
        
        //cambiar los valores de X e Y en (p3) de una sola vez
        System.out.println("Cambiar X e Y en p3 de UNA sola vez: ");
        System.out.println("");
        System.out.println("Antes: " + p3);
        p3.setXY(89, 89);
        System.out.println("Despues: " + p3);
        System.out.println("------------");
        
        //ver/obtener los valores de X e Y con los getters correspondientes
        System.out.println("Ver datos de p3: ");
        System.out.println("");
        System.out.println("X en p3 es: " + p3.getX());
        System.out.println("Y en p3 es: " + p3.getY());
        System.out.println("------------");
        
        //Obtener X y Y de p1 con el método getXY()[] -> REVISAR
        System.out.println("Usando (en p1) el metodo getXY()[]: ");
        System.out.println("");
        System.out.println("\t* Normal print" + p1 + "\n");
        System.out.println("\t*X (usando getXY()[]) = " + p1.getXY()[0]);
        System.out.println("\t*Y (usando getXY()[]) = " + p1.getXY()[1]);
        System.out.println("------------");
        
        //obtener la distancia que hay entre un punto y los valores especificados
        System.out.println("Distancia entre un punto (p1) y valores especificados: ");
        System.out.println("");
        System.out.printf("%.4f\n", p1.distance(7, 8));
        System.out.println("------------");
        
        //obtener la distancia entre dos puntos ya creados/existentes
        System.out.println("Distancia entre 2 puntos YA CREADOS: ");
        System.out.println("\tPuntos: " + p1 + " y " + p2);
        System.out.println("");
        System.out.printf("%.4f\n", p1.distance(p2));   //p.e.: limitado a 4 decimales
        System.out.println("------------");
        
        //obtener la distancia que desde este punto hasta (0, 0)
        System.out.println("Distancia entre un punto (p1) y la posicion 0,0 ");
        System.out.println("");
        System.out.println(p1.distance());
        System.out.println("------------");
        
        
        
    }
}

/*
https://personal.ntu.edu.sg/ehchua/programming/java/J3f_OOPExercises.html#ExerciseComposition
*/
