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
public class checkHexStrHOME {
    public static void main(String[] args) {
        
        String hexstr;
        int hexstrLen;
        char inChar;
        boolean isValid;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an hexadecimal string: ");
        hexstr = in.next();
        hexstrLen = hexstr.length();
        
        hexstr = hexstr.toUpperCase();
        isValid = true;
        
        for (int i = 0; i <= hexstrLen - 1; ++i) {
            inChar = hexstr.charAt(i);
            
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
                isValid = false;
            }
        }
        
        if (isValid == true) {
            System.out.println("The string " + hexstr + " IS a binary string. ");
        } else {
            System.out.println("The string " + hexstr + " IS NOT a binary string. ");
        }
        
    }
}
