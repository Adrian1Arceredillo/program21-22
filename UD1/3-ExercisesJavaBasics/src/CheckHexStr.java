
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
public class CheckHexStr {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        char inChar;
        boolean isValid;

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un string hexadecimal: ");
        mistr = in.next();
        mistrLen = mistr.length();

        isValid = true;

        for (int inCharIdx = 0; inCharIdx <= mistrLen - 1; ++inCharIdx) {
            //System.out.print(mistr.charAt(inCharIdx));
            inChar = mistr.charAt(inCharIdx);

            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'Z') || (inChar >= 'a' && inChar <= 'z'))) {
                isValid = false;
                //System.out.println("El string no es hexadecimal. ");
                break;

            }

        }

        if (isValid) {
            System.out.println("El string es hexadecimal. ");
        } else {
            System.out.println("El string NO es hexadecimal. ");
        }

        System.out.println();
    }
}
