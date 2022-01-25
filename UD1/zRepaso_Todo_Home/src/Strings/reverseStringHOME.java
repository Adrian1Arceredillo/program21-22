
package Strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class reverseStringHOME {
    public static void main(String[] args) {
        
        String mistr = "";
        int mistrLen;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        mistr = in.nextLine();
        mistrLen = mistr.length();
        
        for (int idx = mistrLen - 1; idx >= 0; --idx) {
            char inChar = mistr.charAt(idx);
            System.out.print(inChar);
        }
        
    }
}
