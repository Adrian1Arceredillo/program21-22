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
public class checkBinStrHOME {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        char inChar;
        boolean isValid;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        isValid = true;
        
        for (int i = 0; i <= mistrLen - 1; ++i) {
            inChar = mistr.charAt(i);
            
            if (!(inChar == '1' || inChar == '0')) {
                isValid = false;
                break;
            } 
        }
        
        if (isValid == true) {
            System.out.println(mistr + " IS a binary string. ");
        } else {
            System.out.println(mistr + " IS NOT a binary string. ");
        }
        
    }
}
