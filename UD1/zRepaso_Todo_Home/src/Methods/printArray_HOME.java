/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class printArray_HOME {
    public static void main(String[] args) {
        
        int [] intArray;
        int num_elements;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int array: ");
        num_elements = in.nextInt();
        intArray = new int [num_elements];
        
        for (int i = 0; i <= num_elements - 1; ++i) {
            System.out.print("Enter the values of the items: ");
            intArray[i] = in.nextInt();
        }
        
        print(intArray);
        System.out.println("The max value is: " + max_nota(intArray));
        System.out.println("The min value is: " + min_nota(intArray));
        System.out.println("The sum of the values is: " + suma(intArray));
        System.out.println("The average is: " + average(intArray));
        
    }
    
    public static void print(int [] intArray) {
        
        System.out.print("The values are: [");
            for (int idx = 0; idx <= intArray.length - 1; ++idx) {
                if (idx == 0) {
                    System.out.print(intArray[0]);
                } else {
                    System.out.print(", " + intArray[idx]);
                }
            }
            System.out.println("]");
        
        
    }
    
    public static int max_nota(int[] intArray) {
        
        int max_item = intArray[0];
        for (int idx = 0; idx <= intArray.length - 1; ++idx) {
            if (intArray[idx] > max_item) {
                max_item = intArray[idx];
            }
        }
        return max_item;
        
    }
    
    public static int min_nota(int [] intArray) {
        int min_item = intArray[0];
        for (int idx = 0; idx <= intArray.length - 1; ++idx) {
            if (intArray[idx] < min_item) {
                min_item = intArray[idx];
            }
        }
        return min_item;
    }
    
    public static int suma(int [] intArray) {
        int sum = 0;
        for (int idx = 0; idx <= intArray.length - 1; ++idx) {
            sum = sum + intArray[idx];
        }
        return sum;
    }
    
    public static double average(int [] intArray) {
        double average = (double) suma(intArray) / intArray.length;
        return average;
    }
    
}
