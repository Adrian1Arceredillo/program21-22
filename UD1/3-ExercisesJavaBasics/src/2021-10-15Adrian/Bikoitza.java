
import java.util.Arrays;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Bikoitza {

    public static void main(String[] args) {

        int[] intArray1;
        final int TAMAINA = 5;
        int[] intArray2_biko;

        intArray1 = new int[TAMAINA];  //asignar el array (allocate the array)

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu itzazu " + TAMAINA + " zenbaki espazioz bananduta: ");
        for (int i = 0; i <= intArray1.length - 1; ++i) {
            intArray1[i] = in.nextInt();
        }

        System.out.print("[");
        for (int idx = 0; idx <= intArray1.length - 1; ++idx) {
            if (idx == 0) {
                //imprimir el primer elemento sin poner comas iniciales
                System.out.print(intArray1[0]);
            } else {
                //imprimir los siguientes elementos con una coma por delante
                System.out.print(", " + intArray1[idx]);
            }
        }
        System.out.println("]");
       
        
        //System.out.println(Arrays.toString(intArray1));
        print(intArray1);
    }

    /*public static int[] arrayToString(int[] elArrayDeInts) { //metodo para imprimir un segundo array, cuyos elementos son el doble de lso delprimer array

        int[] array2 = new int[elArrayDeInts.length];
        System.out.println(Arrays.toString(elArrayDeInts));

        for (int i = 0; i <= elArrayDeInts.length - 1; ++i) {
            array2[i] = elArrayDeInts[i] * 2;
        }
        return array2;

    }*/
    
    public static void print(int[] intArray) {

        //final int num_items;
        //System.out.println(Arrays.toString(intArray));
        System.out.print("[");

        for (int i = 0; i <= intArray.length - 1; ++i) {
            if (i == 0) {
                System.out.print(intArray[0] * 2);
            } else {
                System.out.print(", " + (intArray[i] * 2));
            }
        }
        System.out.println("]");
    }
}
