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
public class caesarCodeHOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        int salto;
        char alfabeto;
        String ciphertext = "";
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        System.out.println("Cuanto sumar a cada letra? ");
        salto = in.nextInt();
        
        mistr = mistr.toUpperCase();
        
        for (int idx = 0; idx <= mistrLen - 1; ++idx) {
            alfabeto =  mistr.charAt(idx);
            
            if (alfabeto >= 'A' && alfabeto <= 'Z') {
                alfabeto = (char) (mistr.charAt(idx) + salto);
                
            }
            
            if (alfabeto > 'Z') {
                alfabeto = (char) (alfabeto + 'a' - 'z' - 1);
                
            }
            
            ciphertext = ciphertext + alfabeto;
        }
        System.out.println(ciphertext);
        
    }
}
