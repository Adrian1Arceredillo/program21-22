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
public class reverseInt_HOME {
    public static void main(String[] args) {
        
        int zenbakia;
        int digit;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        zenbakia = in.nextInt();
        
        int number = zenbakia;
        
        while (number > 0) {
            digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
            
        }
        
    }

