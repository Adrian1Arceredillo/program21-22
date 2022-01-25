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
public class hex2BinHOME {

    public static void main(String[] args) {

        String hexstr;
        int hexstrLen;
        char inChar;
        String binstr = "";

        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an hexadecimal string: ");
        hexstr = in.next();
        hexstrLen = hexstr.length();
        hexstr = hexstr.toUpperCase();
        
        
        for (int i = 0; i <= hexstrLen - 1; ++i) {
            inChar = hexstr.charAt(i);
            
            if (inChar >= '0' && inChar <= '9') {
                binstr = binstr + HEX_BITS[inChar - '0'] + " ";
            } else if (inChar >= 'A' && inChar <= 'F') {
                binstr = binstr + HEX_BITS[inChar - 'A' + 10] + " ";
            }
        }
        System.out.println(binstr);
    }
}
