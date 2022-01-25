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
public class PrintNumerosAnteriores {

    public static void main(String[] args) {

        int zenbakia;
        int max;
        int min = 9;

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número entre 0-10: ");
        zenbakia = in.nextInt();

        int number = zenbakia;
        //int cont = 1;
        
        for (int cont = 1; cont <= zenbakia; ++cont, --number) {
            int digit = number;
            
            
            
            System.out.print(digit);
            
            //number = number / 10;
        }
        

    }
}

/*
while (number != 0) {
            int digit = number;
            
            
            
            System.out.print(digit);
            --number;
            //number = number / 10;
        }
*/

/*
ingresar 5 números por teclado (12345) y que me imprima en pantalla el mismo orden y no el orden inverso (54321).
 */
