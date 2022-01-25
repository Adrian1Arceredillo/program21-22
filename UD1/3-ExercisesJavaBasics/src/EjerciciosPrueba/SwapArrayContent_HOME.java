package EjerciciosPrueba;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class SwapArrayContent_HOME {

    public static void main(String[] args) {

        int[] firstArray = null;
        int num_items1;
        int[] secondArray;
        int num_items2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the first array: ");
        num_items1 = in.nextInt();

        firstArray = new int[num_items1];

        for (int i = 0; i <= firstArray.length - 1; ++i) {
            System.out.print("Enter the values of items: ");
            firstArray[i] = in.nextInt();
        }

        System.out.println("Enter the length of the second array: ");
        num_items2 = in.nextInt();

        secondArray = new int[num_items2];

        for (int i = 0; i <= secondArray.length - 1; ++i) {
            System.out.print("Enter the values of items: ");
            secondArray[i] = in.nextInt();
        }

        if (swap(firstArray, secondArray) == true) {
            System.out.print("After the swap...The first array is: [");
            print(firstArray);
            System.out.print("]");

            System.out.print(" and The second array is: [");
            print(secondArray);
            System.out.println("]");
        } else {
            System.out.println("Try again...the lengths of the arrays are not the same.");
        }

    }

    public static void print(int[] arrayNumeros) {

        for (int i = 0; i <= arrayNumeros.length - 1; ++i) {
            if (i == 0) {
                System.out.print(arrayNumeros[0]);
            } else {
                System.out.print(", " + arrayNumeros[i]);
            }

        }

    }

    public static boolean swap(int[] array1, int[] array2) {

        int temp;

        if (array1.length == array2.length) {
            for (int i = 0; i <= array1.length - 1; ++i) {
                temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
                

            }
            return true;
        }
        return false;

    }
}
