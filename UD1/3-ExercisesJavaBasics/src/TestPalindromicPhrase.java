
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
public class TestPalindromicPhrase {

    public static void main(String[] args) {

        String mistr; //input String
        int mistrLen;   //length of the input string

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una palabra palíndroma: ");
        mistr = in.nextLine();
        mistrLen = mistr.length();

        String fstr = mistr;
        String rev = "";

        in.close();

        for (int inCharIdx = mistrLen - 1; inCharIdx >= 0; --inCharIdx) {
            rev = rev + mistr.charAt(inCharIdx);

        }
        System.out.println(rev);

        if (fstr.equals(rev)) {
            System.out.println("Es una frase palíndroma.");
        } else {
            System.out.println("No es una frase palíndroma.");
        }

        System.out.println();
    }
}
