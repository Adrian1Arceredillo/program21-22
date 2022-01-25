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
public class ExchangeCipher2 {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        mistr = mistr.toUpperCase();

        for (int idx = mistrLen - 1; idx >= 0; --idx) {
            char caracter = mistr.charAt(idx);
            System.out.print(caracter);
        }

        System.out.println();
    }
}
