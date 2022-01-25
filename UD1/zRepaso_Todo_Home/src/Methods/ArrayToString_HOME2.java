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
public class ArrayToString_HOME2 {

    public static void main(String[] args) {

        int[] intabc;
        int num_items;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        num_items = in.nextInt();

        intabc = new int[num_items];   //allocate the array

        for (int i = 0; i <= num_items - 1; ++i) {
            System.out.print("Enter the value of item " + (i + 1) + ": ");
            intabc[i] = in.nextInt();
        }

        System.out.println(arrayToString(intabc));

    }

    public static String arrayToString(int[] intArray) {

        String mistr = "";
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i <= intArray.length - 1; ++i) {
            if (i == intArray[0]) {
                mistr = "[" + intArray[0] + ", " + intArray[i] + "]";
            }
        }

        return mistr;

    }
}
