package Methods;
import java.util.Arrays;
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
public class CompareTwoArrays {

    public static void main(String[] args) {

        int[] array1;
        int[] array2;
        final int num_items = 5;

        array1 = new int[num_items];
        array2 = new int[num_items];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= array1.length - 1; ++i) {
            System.out.print("FIRST : ");
            array1[i] = in.nextInt();
        }
        
        for (int i = 0; i <= array2.length - 1; ++i) {
            System.out.print("Enter the values for the SECOND array: ");
            array2[i] = in.nextInt();
        }
        
        if (equals(array1, array2) == true) {
            System.out.println("Los arrays son iguales. ");
        } else {
            System.out.println("Los arrays NO son iguales. ");
        }
        
    }

    public static boolean equals(int[] array1, int[] array2) {

        if (Arrays.equals(array1, array2)) {
            return true;
        }
        return false;
        
    }
}
