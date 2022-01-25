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
public class swap2Integers_HOME {
    public static void main(String[] args) {
        
        int num1, num2;
        int num1_bukaera, num2_bukaera;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        
        num1_bukaera = num2;
        num2_bukaera = num1;
        
        System.out.println("After the swap, first integer is: " + num1_bukaera + ", and the second is: " + num2_bukaera);
        
    }
}
