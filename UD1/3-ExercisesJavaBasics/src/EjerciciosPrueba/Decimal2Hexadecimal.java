package EjerciciosPrueba;
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
public class Decimal2Hexadecimal {

    public static void main(String[] args) {

        int num_dec;
        String hexstr = "";
        int hexstLen;
        int radix = 16;
        char hexStr = 0;
        final char[] HEX_CHARS //// Use this array as lookup table for converting 0-15 to 0-9A-F
                = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        num_dec = in.nextInt();

        while (num_dec > 0) {

            int hexChar = num_dec % radix;
            hexstr = HEX_CHARS[hexChar] + hexstr;

            num_dec = num_dec / radix;

        }
        System.out.println(hexstr);
    }
}
