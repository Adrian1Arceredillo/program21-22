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
public class CaesarCode_HOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        int salto;
        
        
        Scanner in = new Scanner(System.in);
        //enter the string
        System.out.print("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        mistr = mistr.toUpperCase();
        //enter the number to jump
        System.out.print("Enter a number to jump: ");
        salto = in.nextInt();
        
        
        char alphabet;
        String ciphertext = "";
        //ciphertext = ciphertext.toUpperCase();
        
        for (int i = 0; i <= mistrLen - 1; ++i) {
            alphabet = mistr.charAt(i);
            
            if (alphabet >= 'A' && alphabet <= 'z') {
                alphabet = (char) (alphabet + salto);
                
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println("The ciphertext string is: " + ciphertext);
    }
}
