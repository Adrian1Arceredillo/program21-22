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
public class bin2DecHOME {

    public static void main(String[] args) {

        String binstr;
        int binstrLen;
        int karakterea;
        int dec_resultado = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a binary string: ");
        binstr = in.next();
        binstrLen = binstr.length();

        for (int i = 0; i <= binstrLen - 1; ++i) {
            karakterea = binstr.charAt(binstrLen - 1 - i);

            if (karakterea == '1') {
                dec_resultado = dec_resultado + (int) Math.pow(2, i);
                //System.out.println("hola");
            } else if (karakterea == '0') {
            } else {
                System.out.println("error: invalid binary string ");
                return;
            }
        }
        System.out.println(dec_resultado);
    }
}
