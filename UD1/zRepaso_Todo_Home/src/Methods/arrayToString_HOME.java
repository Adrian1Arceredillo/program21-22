/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class arrayToString_HOME {
    public static void main(String[] args) {

        //mirar --> arrays - Arrays_to_String
        int[] intabc = {6, 1, 3, 4, 5};        //allocate via initialization

        System.out.print(arrayToString(intabc));
    }

    public static String arrayToString(int[] intabc) {

        String strChurro = "";
        System.out.println(Arrays.toString(intabc));

        for (int idx = 0; idx <= intabc.length - 1; ++idx) {
            if (idx == intabc[0]) {
                strChurro = "[" + intabc[0] + ", " + intabc[idx] + "]";;
            }
        }
        
        return strChurro;

    }
}
