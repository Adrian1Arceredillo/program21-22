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
public class add2Integer_input_HOME {
    public static void main(String[] args) {
        
        int num1, num2;
        int suma;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        
        suma = num1 + num2;
        System.out.println("The sum is: " + suma);
    }
}
