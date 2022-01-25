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
public class CountVowelsDigits_HOME {
    public static void main(String[] args) {
       
        String mistr;
        int mistrLen;
        int cVocales = 0;
        int cDigit = 0;
        double averageV = 0;
        double averageD = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        mistr = mistr.toUpperCase();
        
        for (int i = 0; i <= mistr.length() - 1; ++i) {
            char inChar = mistr.charAt(i);
            
            if (inChar == 'A' || inChar == 'E' || inChar == 'I' || inChar == 'O' || inChar == 'U') {
                ++cVocales;
            }
            
            if (inChar >= '0' && inChar <= '9') {
                ++cDigit;
            }
        }
        System.out.println("The number of vowels is: " + cVocales);
        System.out.println("The number of digit is: " + cDigit);
        
        averageV = (double) (cVocales * 100) / mistrLen;
        averageD = (double) (cDigit * 100) / mistrLen;
        
        System.out.printf("The average of vowels is: %.2f\n", averageV);
        System.out.printf("The average of digits is: %.2f\n", averageD);
        
    }
}
