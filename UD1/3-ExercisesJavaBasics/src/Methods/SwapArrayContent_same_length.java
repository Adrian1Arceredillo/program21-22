package Methods;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class SwapArrayContent_same_length {

    public static void main(String[] args) {

        int[] intArray1;
        int num_items1;
        int[] intArray2;
        int num_items2;

        Scanner in = new Scanner(System.in);
        
        //create the first array
        System.out.println("Enter the number of items of the first array: ");
        num_items1 = in.nextInt();

        intArray1 = new int[num_items1];

        for (int i = 0; i <= intArray1.length - 1; ++i) {
            System.out.print("Enter the values of items: ");
            intArray1[i] = in.nextInt();
        }
        
        
        //create the second array
        System.out.println("Enter the number of items of the second array: ");
        num_items2 = in.nextInt();

        intArray2 = new int[num_items2];

        for (int i = 0; i <= intArray2.length - 1; ++i) {
            System.out.print("Enter the values of items: ");
            intArray2[i] = in.nextInt();
        }

        //imprimir el segundo array mediante el metodo printArray2
        //printArray(intArray1);
        //printArray(intArray2);


        if (swap(intArray1, intArray2) == true) {
            System.out.print("After the swap...The first array is: [");
            printArray(intArray1);
            System.out.print("]");
            
            System.out.print(" and The second array is: [");
            printArray(intArray2);
            System.out.println("]");
        } else {
            System.out.println("Try again...");
        }
    }

    public static void printArray(int[] intArray) {

        //System.out.print("The first array is: [");
        for (int idx = 0; idx <= intArray.length - 1; ++idx) {
            if (idx == 0) {
                System.out.print(intArray[0]);
            } else {
                System.out.print(", " + intArray[idx]);
            }

        }
        //System.out.println("]");

    }

    
    public static boolean swap(int[] intArray1, int[] intArray2) {

        int temp;

        if (intArray1.length == intArray2.length) {
            for (int idx = 0; idx <= intArray1.length - 1; ++idx) {
                temp = intArray1[idx];
                intArray1[idx] = intArray2[idx];
                intArray2[idx] = temp;
                
            }
            return true;
        }
        return false;
    }

}

/*




 */
