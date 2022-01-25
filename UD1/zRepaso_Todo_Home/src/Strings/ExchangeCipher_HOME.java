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
public class ExchangeCipher_HOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        char inChar;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        mistr = mistr.toUpperCase();
        
        
        String ciphertext = "";
        
        for (int i = mistrLen - 1; i >= 0 ; --i) {
            inChar = mistr.charAt(i);
            ciphertext = ciphertext + inChar;            
        }
        System.out.println("The ciphertext string is: " + ciphertext);
    }
   
}
