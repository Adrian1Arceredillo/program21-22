package Conceptos_teoria;


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
public class ej_IntArrayMethodsTest {

    public static void main(String[] args) {

        //int[] intArray = new int[] {1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        final int num_items = in.nextInt();
        int[] intArray = new int[num_items];

        //System.out.print("Enter the value of each item: ");
        for (int i = 0; i <= num_items - 1; ++i) {
            System.out.print("Enter the value of item number " + (i + 1) + ": ");
            intArray[i] = in.nextInt();
        }

        print(intArray);
        System.out.println("The min is: " + min(intArray));
        System.out.println("The max is: " + max(intArray));
        System.out.println("The sum is: " + sum(intArray));
        System.out.printf("The average (rounded to 2 decimals) is: %.2f \n", average(intArray));
    }

    public static void print(int[] intArray) {

        //final int num_items;
        //System.out.println(Arrays.toString(intArray));
        System.out.print("The content of the array is: [");

        for (int i = 0; i <= intArray.length - 1; ++i) {
            if (i == 0) {
                System.out.print(intArray[0]);
            } else {
                System.out.print(", " + intArray[i]);
            }
        }
        System.out.println("]");
    }

    public static int min(int[] intArray) {

        int min_item = intArray[0];
        for (int i = 0; i <= intArray.length - 1; ++i) {

            if (intArray[i] < min_item) {
                min_item = intArray[i];
            }

        }
        return min_item;
    }
    
    public static int max(int[] intArray) {

        int max_item = intArray[0];
        for (int i = 0; i <= intArray.length - 1; ++i) {

            if (intArray[i] > max_item) {
                max_item = intArray[i];
            }

        }
        return max_item;
    }
    
    public static int sum(int[] intArray) {

        int sum = 0;
        for (int i = 0; i <= intArray.length - 1; ++i) {

            sum = sum + intArray[i];

        }
        return sum;
    }
    
        
    public static double average(int[] intArray) {
      return (double)(sum(intArray)) / intArray.length;
   }
    
}

/*
public static double average(int[] intArray) {

        double average_media;
        average_media = (double) (sum(intArray) / intArray.length);
        //System.out.println("The ave");
        
        return average_media;
    }
*/