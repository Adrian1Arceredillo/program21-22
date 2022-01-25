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
public class Bin2Dec_2 {

    public static void main(String[] args) {

        String bin_str;
        int bin_strLen;
        int decimal = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string binario: ");
        bin_str = in.next();
        bin_strLen = bin_str.length();
        in.close();

        char binChar;

        for (int exp = 0; exp < bin_strLen; ++exp) {
            binChar = bin_str.charAt(bin_strLen - 1 - exp);
            //System.out.print(bin_str.charAt(exp));

            if (binChar == '1') {
                decimal = decimal + (int) Math.pow(2, exp);

            } else if (binChar == '0') {
            } else {
                System.out.println("error: invalid binary string ");
                return;
            }

        }
        System.out.println("The equivalent decimal number is " + decimal + " . ");
    }
}

/*
https://www.youtube.com/watch?v=Bxis3XwcOUo
*/
