
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
public class ReverseString {

    public static void main(String[] args) {

        String mistring; //input String
        int mistringLen;   //length of the input string

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        mistring = in.next();
        mistringLen = mistring.length();

        in.close();

        System.out.print("The reverse is: ");
        // Use a for-loop to extract each char in reverse order
        for (int inCharIdx = mistringLen - 1; inCharIdx >= 0; --inCharIdx) {
            System.out.print(mistring.charAt(inCharIdx));
        }
        System.out.println();
    }
}
