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
public class inputValidation_boolean_HOME {

    public static void main(String[] args) {

        int zenbakia;
        boolean isValid;
        isValid = false;

        while (isValid == false) {
            
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number between 0-10 or 90-100: ");
            zenbakia = in.nextInt();

            int number = zenbakia;

            if ((number >= 0) && (number <= 10) || (number >= 90) && (number <= 100)) {
                isValid = true;
                System.out.println("El número introducido es: " + number);
            } else {
                isValid = false;
                System.out.println("Invalid input, try again...");
            }
        }

    }
}
