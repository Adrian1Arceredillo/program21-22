package Strings;
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
public class PhoneKeyPad2 {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        mistr = mistr.toUpperCase();
        
        switch (mistr) {
            
            case "A": case "B": case "C":
                System.out.println(1);
                break;
            case "D": case "E": case "F":
                System.out.println(2);
                break;
            case "G": case "H": case "I":
                System.out.println(3);
                break;
            case "J": case "K": case "L":
                System.out.println(4);
                break;
            case "M": case "N": case "Ñ":
                System.out.println(5);
                break;
            case "O": case "P": case "Q":
                System.out.println(6);
                break;
            case "R": case "S": case "T":
                System.out.println(7);
                break;
            case "U": case "V": case "W":
                System.out.println(8);
                break;
            case "X": case "Y": case "Z":
                System.out.println(9);
                break;
            default:
                System.out.println("ALgo ha ido mal. Try again...");
                break;
        }
    }
}
