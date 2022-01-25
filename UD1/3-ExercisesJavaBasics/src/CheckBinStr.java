
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
public class CheckBinStr {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        char inChar;
        boolean isValid;

        isValid = true;

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un string binario: ");
        mistr = in.next();
        mistrLen = mistr.length();

        for (int inCharIdx = 0; inCharIdx <= mistrLen - 1; ++inCharIdx) {
            inChar = mistr.charAt(inCharIdx);
            //System.out.print(mistr.charAt(inCharIdx));

            if (!(inChar == '0' || inChar == '1')) {
                isValid = false;
                // System.out.println("Error. El string no es binario.");
                break;
            }
        }

        if (isValid) {
            System.out.println("El string es binario. ");
        } else {
            System.out.println("El string no es binario. ");
        }
        System.out.println();
        //System.out.println("\"" + mistr + "\" is " + (isValid ? "" : "NOT ") + "a binary string");
    }
}
