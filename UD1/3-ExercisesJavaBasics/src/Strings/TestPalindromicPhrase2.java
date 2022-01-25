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
public class TestPalindromicPhrase2 {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string: ");
        mistr = in.nextLine();
        mistrLen = mistr.length();

        String forwardstr = mistr;
        String reversestr = "";

        for (int Idx = mistrLen - 1; Idx >= 0; --Idx) {
            reversestr = reversestr + mistr.charAt(Idx);

        }
        
        if (forwardstr.equals(reversestr)) {
            System.out.println("La palabra " + mistr + "·es palíndroma. ");
        } else {
            System.out.println("La palabra " + mistr + " NO es palíndroma. ");
        }
        
        System.out.println();
    }
}
