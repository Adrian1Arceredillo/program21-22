/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class WordGuess_HOME {
    public static void main(String[] args) {
        
        String mistr = "testing";
        int mistrLen = mistr.length();
        String letra; //determina el caracter que se introducirá por teclado
        
        String hutsik = "_______";
        
        boolean isValid;
        isValid = false;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one character or your guess word: ");
        letra = in.next();
        
        for (int i = 0; i <= mistrLen - 1; ++i) {
            if (letra.equals(mistr.charAt(i))) {
                hutsik = letra;
            }
        }
        
        
        
        System.out.println(letra);
    }
    
    public static boolean equalsLength(String [] word, String [] karakterea) {
        
        int wordLen = word.length;
        int karaktereaLen = karakterea.length;
        if (karaktereaLen == wordLen) {
            return true;
        }
        return false;
    }
    
}
