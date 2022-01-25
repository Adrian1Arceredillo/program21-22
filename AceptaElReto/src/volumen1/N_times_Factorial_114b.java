package volumen1;


import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class N_times_Factorial_114b {

    public static void main(String[] args) {

        int number;
        int numCasos;
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat: ");
        numCasos = in.nextInt();

        for (int i = 1; i <= numCasos; ++i) {
            casoDePrueba();
        }
    }

    public static int faktoriala(int number) {

        int faktoriala = 1;

        for (int i = number; i > 1; --i) {
            faktoriala = faktoriala * i;
        }
        return faktoriala;

    }

    public static void casoDePrueba() {
        int number;

        Scanner in = new Scanner(System.in);

        number = in.nextInt();
        System.out.println(faktoriala(number));

        /*for (int idx = 0; idx <= number; ++idx) {
            faktoriala = faktoriala * idx;
        }*/
    }

}

/*
https://www.aceptaelreto.com/problem/statement.php?id=114
*/

