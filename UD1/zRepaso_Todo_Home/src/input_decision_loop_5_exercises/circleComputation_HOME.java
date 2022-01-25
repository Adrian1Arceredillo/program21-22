/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_decision_loop_5_exercises;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class circleComputation_HOME {
    public static void main(String[] args) {
        
        double diameter, circunference, area;
        double radius;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        radius = in.nextDouble();
        
        diameter = 2.0 * radius;
        area = (radius * radius) * Math.PI;
        circunference = 2.0 * Math.PI * radius;
        
        System.out.println("The diameter is: " + diameter);
        System.out.printf("The area is: %.2f \n", area);
        System.out.printf("The circunference is: %.2f \n", circunference);
        
    }
}
