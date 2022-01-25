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
public class palindromicWordHOME {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        char inChar;
        String reversestr = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a plalindromic word: ");
        mistr = in.next();
        mistrLen = mistr.length();

        for (int i = mistrLen - 1; i >= 0; --i) {
            inChar = mistr.charAt(i);
            reversestr = reversestr + inChar;
            
        }
        //System.out.println(reversestr);
        
        if (mistr.equals(reversestr)) {
            System.out.println(mistr + " IS a palindromic word. ");
        } else {
            System.out.println(mistr + " IS NOT a palindromic word. ");
        }
        
    }
}
