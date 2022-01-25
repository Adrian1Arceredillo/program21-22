/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos_teoria;

/**
 *
 * @author arceredillo.adrian
 */
public class ej_MethodGetArea {
    //the entry main method
    public static void main(String[] args) {
        double r = 1.1;
        double area, area2;
        
        // call (invoke) method getArea() and return
        area = getArea(r);
        System.out.println("Area is: " + area);
        
        //call method getArea() again and return
        area2 = getArea(2.2);
        System.out.println("Second area is: " + area2);
        
        //call method getArea() one more time and return
        System.out.println("Third area is: " + getArea(3.3));
        
        
        
    }
    
    public static double getArea(double radius) {
        return radius * radius * Math.PI;
    }
    
}
