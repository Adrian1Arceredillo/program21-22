/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class PruebaBucleTryCatch {

    public static void main(String[] args) {

        int elementos = 0;
        int antes = 10;
        int contNegativos = 0;
        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.print("Sartu igoeraren balioa: ");
                elementos = in.nextInt();
                if (elementos < 0) {
                    ++contNegativos;
                }
                System.out.println(elementos);
            } catch (Exception e) {
                System.out.println("Datua txarto dago.");
                --antes;
                System.out.println(antes);
                in.nextLine();
                System.out.println(antes);
            }
            
        } while (elementos < 1);
        System.out.println(contNegativos);
        int suma = antes + elementos;

        System.out.println(suma);
    }
}
