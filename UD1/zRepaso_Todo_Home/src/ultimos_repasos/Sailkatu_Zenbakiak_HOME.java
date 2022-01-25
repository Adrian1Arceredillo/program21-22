/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimos_repasos;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class Sailkatu_Zenbakiak_HOME {

    public static void main(String[] args) {

        int zenbakia;   //tiene que ser un número entero positivo
        int zen_handia; //será el límite que determinará si zenbakia es handia o txikia

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbaki oso positibo bat: ");
        zenbakia = in.nextInt();

        while (zenbakia <= 0) {     //mientras que el input sea menor o igual que 0, volver a pedir input
            System.out.println("Zenbaki ezegokia. ");
            System.out.print("Sartu zenbaki oso positibo bat: ");
            zenbakia = in.nextInt();
        }

        System.out.println("Sartu handia edo txikia izateko limitea: ");  //establecer el límite para que sea grande o pequeño
        zen_handia = in.nextInt();

        if (zenbakia > zen_handia) {
            if (zenbakia % 2 == 0) {
                System.out.println("Sartu duzun zenbaki handia BIKOITIA da. ");
            } else {
                System.out.println("Sartu duzun zenbaki handia BAKOITIA da. ");
            }
        } else {
            if (zenbakia % 2 == 0) {
                System.out.println("Sartu duzun zenbaki txikia BIKOITIA da. ");
            } else {
                System.out.println("Sartu duzun zenbaki txikia BAKOITIA da. ");
            }
        }

    }
}
