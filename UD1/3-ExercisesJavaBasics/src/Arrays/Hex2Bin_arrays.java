package Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class Hex2Bin_arrays {

    public static void main(String[] args) {

        String hexstr;      //input hexadecimal string
        int hexstrLen;      //the length of hexstr
        char hexChar;       //each char in the hexstr
        String binstr = "";     // The equivalent binary String, to accumulate from an empty String
        // Lookup table for the binary sub-string corresponding to Hex digit '0' (index 0) to 'F' (index 15)

        final String[] BIN_STRS
                = {"0000", "0001", "0010", "0011",
                    "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011",
                    "1100", "1101", "1110", "1111"};

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string Hexadecimal: ");
        hexstr = in.next();
        hexstrLen = hexstr.length();
        in.close();

        hexstr = hexstr.toLowerCase();

        for (int charIdx = 0; charIdx <= hexstrLen - 1; ++charIdx) {
            hexChar = hexstr.charAt(charIdx);

            if (hexChar >= '0' && hexChar <= '9') {
                binstr = binstr + BIN_STRS[hexChar - '0'] + " ";
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                binstr = binstr + BIN_STRS[hexChar - 'a' + 10] + " ";
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                binstr = binstr + BIN_STRS[hexChar - 'A' + 10] + " ";
            } else {
                System.err.println("error: invalid hex string \"" + hexstr + "\"");
                return;
            }
        }

        System.out.println("The equivalent binary for \"" + hexstr + "\" is \"" + binstr + "\"");
    }
}
