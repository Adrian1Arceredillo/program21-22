package Strings;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class CheckBinStr2 {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        boolean isValid;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        isValid = true;
        
        for (int idx = 0; idx <= mistrLen - 1; ++idx) {
            char caracter = mistr.charAt(idx);
            
            if (!(caracter == '0' || caracter == '1')) {
                isValid = false;
                
                break;
            }
            
        }
        
        if (isValid) {
            System.out.println("El string es binario. ");
        } else {
            System.out.println("El string NO es binario. ");
        }
        System.out.println();
    }
}
