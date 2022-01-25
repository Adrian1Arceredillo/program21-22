/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class dec2HexHOME {

    public static void main(String[] args) {

        int dec_number;
        String hexstr = "";
        int radix = 16;
        final char[] HEX_CHARS //// Use this array as lookup table for converting 0-15 to 0-9A-F
                = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        dec_number = in.nextInt();
        
        int num = dec_number; //variable definida para no modificar la inicial.

        while (num > 0) {
            int hexdigit = num % radix; //recoge el resto de la división.
            hexstr = HEX_CHARS[hexdigit] + hexstr;      //busca la posicion correspondiente al resto, y lo pone a la izquiera.
            
            num = num / radix;
        }
        System.out.println("El equivalente string hexadecimal de " + dec_number + " es " + hexstr);

    }
}
