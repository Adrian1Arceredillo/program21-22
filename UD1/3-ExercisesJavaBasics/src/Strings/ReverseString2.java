package Strings;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class ReverseString2 {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        in.close();
        
        System.out.print("The reverse of the string is: ");
        for (int incharIdx = mistrLen - 1; incharIdx >= 0; --incharIdx) {
            System.out.print(mistr.charAt(incharIdx));
        }
        System.out.println();
    }
}
