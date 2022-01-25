
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
public class BubleSort {

    public static void main(String[] args) {

        int[] numerosArray1 = {5, 8, 6, 1, 7, 3, 4, 9, 10, 2};
        int[] numerosArray2 = {4, 2, 3, 1, 5};

        //System.out.println(Arrays.toString(numerosArray2));
        System.out.println("Hasieran: " + Arrays.toString(numerosArray1));
        System.out.print("Ordenatu ostean: ");
        ordenatu(numerosArray1);

    }

    public static void ordenatu(int[] arrayInts) {
        for (int j = 0; j < arrayInts.length; ++j) {
            for (int i = 0; i < arrayInts.length - 1; ++i) {

                if (arrayInts[i] > arrayInts[i + 1]) {
                    int temporal = arrayInts[i];
                    arrayInts[i] = arrayInts[i + 1];
                    arrayInts[i + 1] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(arrayInts));
    }
}
