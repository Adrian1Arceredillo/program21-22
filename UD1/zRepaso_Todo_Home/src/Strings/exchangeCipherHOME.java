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
public class exchangeCipherHOME {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        char inChar;
        String ciphertext = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        mistr = mistr.toUpperCase();

        for (int idx = mistrLen - 1; idx >= 0; --idx) {
            inChar = mistr.charAt(idx);
            ciphertext = ciphertext + inChar;
        }
        System.out.println(ciphertext);

    }
}
