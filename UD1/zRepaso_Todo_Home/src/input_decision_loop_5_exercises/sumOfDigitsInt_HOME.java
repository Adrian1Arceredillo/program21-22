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
public class sumOfDigitsInt_HOME {
    public static void main(String[] args) {
        
        int zenbakia;
        int digit;
        int suma_digit = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        zenbakia = in.nextInt();
        
        int number = zenbakia;
        
        while (number > 0) {
            digit = number % 10;
            System.out.print(digit);
            
            suma_digit = suma_digit + digit;
            number = number / 10;
        }
        System.out.println("");
        System.out.println("The sum of all digits is: " + suma_digit);
    }
}
