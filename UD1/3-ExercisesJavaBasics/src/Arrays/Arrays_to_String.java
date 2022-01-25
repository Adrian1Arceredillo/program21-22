package Arrays;
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
public class Arrays_to_String {

    public static void main(String[] args) {

        int[] a1 = {6, 1, 3, 4, 5};        //allocate via initialization
        int[] a2 = new int[3];             //empy array with length = 0
        double[] a3 = new double[1];      // one-element array, init to 0.0

        System.out.println(Arrays.toString(a1));    //[6, 1, 3, 4, 5]
        System.out.println(Arrays.toString(a2));    //[0, 0, 0]
        System.out.println(Arrays.toString(a3));    //[0.0]
        
        //al array a3, introducir un valor en el elemento 0
        a3[0] = 2.2;
        System.out.println(Arrays.toString(a3));    //[2.2]

    }
}
