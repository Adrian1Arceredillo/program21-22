package Methods;
import java.util.Arrays;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class CopyOf_NewLength {

    public static void main(String[] args) {

        int[] intArray;
        int num_items;
        int newLength;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        num_items = in.nextInt();

        intArray = new int[num_items];

        for (int i = 0; i <= intArray.length - 1; ++i) {
            System.out.print("Enter the value of item " + (i + 1) + ": ");
            intArray[i] = in.nextInt();
        }

        System.out.print("Enter the new length: ");
        newLength = in.nextInt();

        copyOf(intArray, newLength);

    }

    public static int[] copyOf(int[] arrayNumeros, int nuevaLength) {

        int[] copy_Array = Arrays.copyOf(arrayNumeros, nuevaLength);

        System.out.println(Arrays.toString(copy_Array));
        return copy_Array;
    }
}

/*
https://www.softwaretestinghelp.com/java-copy-array/
 */
