package Methods;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class IntHasEight_converted_to_string {

    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        number = in.nextInt();

        
        in.close();

        if (hasEight(number) == true) {
            System.out.println("The number \"" + number + "\" contains the digit 8. ");
        } else {
            System.out.println("The number \"" + number + "\" doesnt contain the digit 8. ");
        }

    }

    public static boolean hasEight(int number) {
        int ult;
        final int midigit = 8;
        String str_number = Integer.toString(number);
        int str_numberLen = str_number.length();
        

        for (int i = 0; i <= str_number.length() - 1; ++i) {
            int espdigit = str_number.charAt(i);
            
            if (espdigit == '8') {
                return true;
            }
        }
        
        return false;

    }
}
