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
public class countVowelsHOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        int cVocales = 0, cNumeros = 0; //rounded to 2 decimals.
        double medVocales, medNumeros;
        int inChar;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        mistr = mistr.toLowerCase();
        
        for (int i = 0; i <= mistrLen - 1; ++i) {
            inChar = mistr.charAt(i);
            
            if (inChar == 'a' || inChar == 'e' || inChar == 'i' || inChar == 'o' || inChar == 'u') {
                ++cVocales;
            } else if (inChar >= '0' && inChar <= '9') {
                ++cNumeros;
            }
        }
        
        medVocales = (double) (cVocales * 100) / mistrLen;
        medNumeros = (double) (cNumeros * 100) / mistrLen;
        
        
        System.out.printf("El total de vocales es: %d (%.2f) \n", cVocales, medVocales);
        System.out.printf("El total de numeros es: %d (%.2f) \n", cNumeros, medNumeros);
        
        
        
    }
}
