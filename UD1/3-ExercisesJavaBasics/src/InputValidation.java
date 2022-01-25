
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class InputValidation {

    public static void main(String[] args) {

        int zifra;
        boolean isValid;
        isValid = false;

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 0-10 or 90-100: ");
            zifra = in.nextInt();

            int number = zifra;

            if ((number >= 0) && (number <= 10) || (number >= 90) && (number <= 100)) {
                isValid = true;
                System.out.println("El número introducido es: " + number);
            } else {
                isValid = false;
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);
    }

}
