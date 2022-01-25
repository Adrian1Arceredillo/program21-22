/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPrueba;

import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class OrdenarElementosArray {

    public static void main(String[] args) {

        int[] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
        Arrays.sort(numeros);

        for (int n : numeros) {
            System.out.println(n);
        }

    }
}
