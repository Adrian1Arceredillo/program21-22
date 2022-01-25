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
public class UltimoDigitoFactorial_114 {

    public static void main(String[] args) {

        //int number;
        int numCasos;
        Scanner in = new Scanner(System.in);
        //System.out.println("Sartu zenbaki bat: ");
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

        if (number >= 5) {
            System.out.println("0");    //si el numero solicitadoe es mayor o igual que 5, se imprimira "0". ya que el factorial de 5 en adelante, es 0
        } else {
            System.out.println(faktoriala(number) % 10);   //si no es 0 se calculará el factorial del último dígito 

        }

    }

}
