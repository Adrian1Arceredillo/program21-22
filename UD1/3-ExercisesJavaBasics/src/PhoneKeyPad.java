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
public class PhoneKeyPad {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        in.close();
        
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
