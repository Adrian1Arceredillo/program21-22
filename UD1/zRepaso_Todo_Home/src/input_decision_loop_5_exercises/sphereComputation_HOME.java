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
public class sphereComputation_HOME {
    public static void main(String[] args) {
        
        float radius;
        double surfaceArea, volume;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        radius = in.nextFloat();
        
        surfaceArea = 4 * Math.PI * (radius * radius);
        volume = 4 / 3 * (Math.PI * radius * radius * radius);
        
        System.out.printf("The surface area is: %.2f \n", surfaceArea);
        System.out.printf("The volume is: %.2f \n", volume);
    }
}
