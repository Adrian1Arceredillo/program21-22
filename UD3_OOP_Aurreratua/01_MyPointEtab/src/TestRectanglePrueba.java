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
public class TestRectanglePrueba {
    public static void main(String[] args) {
        
        MyPoint p1 = new MyPoint(-2, 6);
        MyPoint p2 = new MyPoint(4, 3);
        
        //obtener datos generales del rectángulo -> toString()
        MyRectangle r1 = new MyRectangle(p1, p2);
        
        
        //obtener la anchura y la altura del rectángulo
        System.out.println("Anchura = " + r1.getAnchura());
        System.out.println("Altura =  " + r1.getAltura());
        
        //obtener el área y el perímetro del rectángulo
        System.out.println("Area = " + r1.getAzalera());
        System.out.println("Perimetro = " + r1.getPerimetroa());
        
        //obtener la distancia entre puntos
        System.out.println("------------");
        System.out.println("Puntos INICIALES:");
        System.out.println("A" + r1.getTopLeft() + " , C" + r1.getBottomRight());
        System.out.println("");
        System.out.println("Resto de puntos CALCULADOS/OBTENIDOS:");
        System.out.println("D" + r1.getBottomLeft() + " , B" + r1.getTopRight());
        System.out.println("------------");
        
        //distancia de diagonales
        System.out.println("Diagonales: ");
        System.out.println("AC = " + r1.getTopLeft().distance(r1.getBottomRight()));
        System.out.println("DB = " + r1.getBottomLeft().distance(r1.getTopRight()));
        System.out.println("------------");
        
        //resumen del rectángulo
        System.out.println("Datos generales del rectangulo: ");
        System.out.println(r1);
        
        //cambiar los valores de topLeft
        r1.setTopLeft(new MyPoint(1, 4));
        System.out.println("AC = " + r1.getTopLeft().distance(r1.getBottomRight()));
        System.out.println(r1);
        
        
    }
}
