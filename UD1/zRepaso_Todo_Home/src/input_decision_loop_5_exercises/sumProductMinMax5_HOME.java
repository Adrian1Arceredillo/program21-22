/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_decision_loop_5_exercises;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class sumProductMinMax5_HOME {

    public static void main(String[] args) {

        int num;
        int suma, producto;
        int min_num = 0, max_num = 0;

        final int cantidad_int = 5;

        int cont_numeros = 1;

        while (cont_numeros <= cantidad_int) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the value of number " + (cont_numeros) + ": ");
            num = in.nextInt();
            if (cont_numeros == 1) {
                min_num = num;
            }
            if (num > max_num) {
                max_num = num;
            }

            if (num < min_num) {
                min_num = num;
            }
            ++cont_numeros;
            

        }
        System.out.println("The max is: " + max_num);
        System.out.println("The min is: " + min_num);
    }
}
