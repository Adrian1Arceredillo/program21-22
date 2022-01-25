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
public class ReverseString_HOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        char inChar; //stringaren karaktere bakoitza
        String reverse_str = "";
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        for (int i = mistrLen - 1; i >= 0; --i)  {
            inChar = mistr.charAt(i);
            reverse_str = reverse_str + inChar;
        }
        System.out.println("The reverse string is: " + reverse_str);
    }
}
