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
 * @author AdriAlex
 */
public class CopyOneArrayToNew {

    public static void main(String[] args) {

        int[] array1;
        //int[] array2;
        final int num_items = 5;

        array1 = new int[num_items];

        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i <= array1.length - 1; ++i) {
            System.out.print("Enter the values for the FIRST array: ");
            array1[i] = in.nextInt();
        }
        
        //System.out.println(copyOf(array1));
        System.out.println(Arrays.toString(array1));
        
        //System.out.println(copyOf(array1));
    }

    public static int[] copyOf(int[] array1) {

        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i <= array1.length - 1; ++i) {
            array2[i] = array1[i];
        }
        return array2;
    }
}


/*
https://www.tutorialspoint.com/Array-Copy-in-Java
https://www.geeksforgeeks.org/arrays-copyof-in-java-with-examples/
https://www.softwaretestinghelp.com/java-copy-array/
 */

/*
public static String copyOf(int[] array1) {

        String strCopia = "";
        System.out.println(Arrays.toString(array1));
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= array1.length - 1; ++i) {
            array1[i] = in.nextInt();
            
            if (i == array1[0]) {
                strCopia = "[" + array1[0] + ", " + array1[i] + "]";;
            }
            
        }
        return strCopia;
        
    }
*/
