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
public class phoneKeyPadHOME {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        char inChar;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();

        mistr = mistr.toLowerCase();
        
        switch (mistr) {
                case "a": case "b": case "c":
                System.out.println(1);
                break;
            case "d": case "e": case "f":
                System.out.println(2);
                break;
            case "g": case "h": case "i":
                System.out.println(3);
                break;
            case "j": case "k": case "l":
                System.out.println(4);
                break;
            case "m": case "n": case "ñ":
                System.out.println(5);
                break;
            case "o": case "p": case "r":
                System.out.println(6);
                break;
            case "s": case "t": case "u":
                System.out.println(7);
                break;
            case "v": case "w": case "x":
                System.out.println(8);
                break;
            case "y": case "z":
                System.out.println(9);
                break;
            default:
                System.out.println("Has perdido.");
                break;
                
            }

        

            

        
    }
}

/*
if (inChar == 'A' || inChar == 'B' || inChar == 'C') {
                System.out.println("2");
                break;
            } else if (inChar == 'D' || inChar == 'E' || inChar == 'F') {
                System.out.println("3");
                break;
            } else if (inChar == 'G' || inChar == 'H' || inChar == 'I') {
                System.out.println("4");
                break;
            } else if (inChar == 'J' || inChar == 'K' || inChar == 'L') {
                System.out.println("5");
                break;
            } else if (inChar == 'M' || inChar == 'N' || inChar == 'Ñ') {
                System.out.println("6");
                break;
            } else if (inChar == 'O' || inChar == 'P' || inChar == 'Q') {
                System.out.println("7");
                break;
            } else if (inChar == 'R' || inChar == 'S' || inChar == 'T') {
                System.out.println("8");
                break;
            } else if (inChar == 'U' || inChar == 'V' || inChar == 'W') {
                System.out.println("9");
                break;
            } else if (inChar == 'X' || inChar == 'Y' || inChar == 'Z') {
                System.out.println("10");
                break;
            }
 */
