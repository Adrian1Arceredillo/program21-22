/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExamen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class Ejer4_Bikoitza {

    public static void main(String[] args) {

        int[] intArray1;
        final int TAMAINA = 5;
        int [] bikoArray2;

        intArray1 = new int[TAMAINA];
        bikoArray2 = new int [TAMAINA];

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu itzazu 5 zenbaki espazioz bananduta: ");
        for (int i = 0; i <= TAMAINA - 1; ++i) {

            intArray1[i] = in.nextInt();
        }
        
        
        for (int idx = 0; idx <= TAMAINA - 1; ++idx) {
            //Arrays.toString(bikoArray2);
            bikoArray2[idx] = intArray1[idx] * 2;
        }
        
        
        
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(bikoArray2));
        
    }
}
