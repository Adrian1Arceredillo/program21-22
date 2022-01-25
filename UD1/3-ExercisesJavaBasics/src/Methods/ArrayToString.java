package Methods;
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class ArrayToString {

    public static void main(String[] args) {

        //mirar --> arrays - Arrays_to_String
        int[] intabc = {6, 1, 3, 4, 5};        //allocate via initialization

        System.out.print(arrayToString(intabc));
    }

    public static String arrayToString(int[] elArrayDeInts) {

        String strChurro = "";
        System.out.println(Arrays.toString(elArrayDeInts));

        for (int idx = 0; idx <= elArrayDeInts.length - 1; ++idx) {
            if (idx == elArrayDeInts[0]) {
                strChurro = "[" + elArrayDeInts[0] + ", " + elArrayDeInts[idx] + "]";;
            }
        }
        
        return strChurro;

    }
}
