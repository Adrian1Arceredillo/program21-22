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
public class TestPalindromicWord_HOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        //mistr = mistr.toUpperCase();
        
        String reverse_str = "";
        
        for (int i = mistrLen - 1; i >= 0; --i) {
            char inChar = mistr.charAt(i);
            
            reverse_str = reverse_str + inChar;
        }
        System.out.println(reverse_str);
        
        if (mistr.equals(reverse_str)) {
            System.out.println("The string \"" + mistr + "\" is a palindromic word. ");
        } else {
            System.out.println("The string \"" + mistr + "\" is NOT palindromic word. ");
        }
        
    }
}
