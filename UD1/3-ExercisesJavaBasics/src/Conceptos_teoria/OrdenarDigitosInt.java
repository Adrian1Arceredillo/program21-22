/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos_teoria;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class OrdenarDigitosInt {

    public static void main(String[] args) {

        int number = 5986;
        int sorted = 0;
        int digits = 10;
        int sortedDigits = 1;
        boolean first = true;

        while (number > 0) {
            int digit = number % 10;

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit >= tmpDigit) {
                        sorted = sorted / toDivide * toDivide * 10 + digit * toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits - 1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }

            first = false;
            number = number / 10;
        }
        System.out.println(sorted);

    }
}
/*
https://www.it-swarm-es.com/es/java/como-ordenar-los-digitos-enteros-en-orden-ascendente-sin-cadenas-o-matrices/1056116276/
*/
