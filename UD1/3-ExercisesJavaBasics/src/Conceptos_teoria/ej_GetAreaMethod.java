/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos_teoria;
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class ej_GetAreaMethod {
    public static void main(String[] args) {
        
        double r = 1.1;
        double area, area2;
        //llamar al método getArea() y return
        area = getArea(r);
        System.out.printf("The first area is: %.2f\n", area);
        //llamar de nuevo al método getArea() y return
        area2 = getArea(2.2);
        System.out.printf("The second area is: %.2f\n", area2);
        //llamar una vez más al método getArea() y return
        System.out.printf("The third area is: %.2f\n", getArea(3.3));
        
        
    }
    
    public static double getArea(double radius) {
        
        double resultado_area;
        resultado_area = Math.PI * (radius * radius);
        
        return resultado_area;
        
    }
}
