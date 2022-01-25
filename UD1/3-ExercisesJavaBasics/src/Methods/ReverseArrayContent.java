package Methods;
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
public class ReverseArrayContent {

    public static void main(String[] args) {

        int[] intArray;
        int num_items;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        num_items = in.nextInt();

        intArray = new int[num_items];

        for (int i = 0; i <= num_items - 1; ++i) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            intArray[i] = in.nextInt();
        }

        reverse(intArray);

    }

    public static void reverse(int[] arrayNumeros) {

        System.out.print("The reverse string is: [");
        for (int i = arrayNumeros.length - 1; i >= 0; --i) {

            if (i == arrayNumeros.length - 1) {
                System.out.print(arrayNumeros[arrayNumeros.length - 1]);
            } else {
                System.out.print(", " + arrayNumeros[i]);
            }

        }
        System.out.println("]");
    }
}
