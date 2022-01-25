/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class PhoneKeyPad_HOME {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        mistr = mistr.toUpperCase();

        for (int i = 0; i <= mistrLen - 1; ++i) {
            char inChar = mistr.charAt(i);

            switch (inChar) {
                case 'A': case 'B': case 'C':
                    System.out.print("1");
                    break;
                case 'D': case 'E': case 'F':
                    System.out.print("2");
                    break;
                case 'G': case 'H': case 'I':
                    System.out.print("3");
                    break;
                case 'J': case 'K': case 'L':
                    System.out.print("4");
                    break;
                case 'M': case 'N': case 'Ñ':
                    System.out.print("5");
                    break;
                case 'O': case 'P': case 'Q':
                    System.out.print("6");
                    break;
                case 'R': case 'S': case 'T':
                    System.out.print("7");
                    break;
                case 'U': case 'V': case 'W':
                    System.out.print("8");
                    break;
                case 'X': case 'Y': case 'Z':
                    System.out.print("9");
                    break;
                default:
                    System.out.println("Error. Try again...");
                    break;
            }
        }
        System.out.println("");
    }
}
