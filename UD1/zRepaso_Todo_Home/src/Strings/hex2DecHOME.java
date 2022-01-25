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
public class hex2DecHOME {

    public static void main(String[] args) {

        String hexstr;
        int hexstrLen;
        int dec = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string hexadecimal: ");
        hexstr = in.next();
        hexstrLen = hexstr.length();
        in.close();

        for (int charIdx = 0; charIdx < hexstrLen; ++charIdx) {
            char hexChar = hexstr.charAt(charIdx);
            int expFactor = (int) Math.pow(16, hexstrLen - 1 - charIdx);
            if (hexChar == '0') {
                // Valid but do nothing
            } else if (hexChar >= '1' && hexChar <= '9') {
                dec += (hexChar - '0') * expFactor;   // Convert char '0'-'9' to int 0-9
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                dec += (hexChar - 'a' + 10) * expFactor;  // Convert char 'a'-'f' to int 10-15
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                dec += (hexChar - 'A' + 10) * expFactor;  // Convert char 'A'-'F' to int 10-15
            } else {
                System.out.println("error: invalid hex string \"" + hexstr + "\"");
                return;   // or System.exit(1);
            }
        }
        System.out.println("Lo equivalente a " + hexstr + " en decimal es: " + dec);

    }
}
