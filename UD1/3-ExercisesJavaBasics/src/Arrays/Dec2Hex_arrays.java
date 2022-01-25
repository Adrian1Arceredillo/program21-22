package Arrays;
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
public class Dec2Hex_arrays {

    public static void main(String[] args) {

        int dec_num;            //input numero decimal en "int"
        String hexstr = "";         //el string hexadecimal equivalente
        int radix = 16;
        final char[] HEX_CHARS      //// Use this array as lookup table for converting 0-15 to 0-9A-F
                = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero decimal: ");
        dec_num = in.nextInt();
        in.close();
        
        while (dec_num > 0) {
            int hexDigit = dec_num % radix;
            //System.out.println(hexDigit);
            hexstr = HEX_CHARS[hexDigit] + hexstr;
            dec_num = dec_num / radix;
        }
        System.out.println("El equivalente hexadecimal es " + hexstr);
        System.out.println();
    }
}
