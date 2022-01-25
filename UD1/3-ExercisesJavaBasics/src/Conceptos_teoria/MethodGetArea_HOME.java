/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos_teoria;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class MethodGetArea_HOME {
    public static void main(String[] args) {
        
        double r;
        double area, area2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of r: ");
        r = in.nextDouble();
        
        System.out.println("The area is: " + getArea(r));
    }
    
    public static double getArea(double radius) {
        
        double area_formula;
        area_formula = (double) Math.PI * (radius * radius);
        return area_formula;
    }
}
