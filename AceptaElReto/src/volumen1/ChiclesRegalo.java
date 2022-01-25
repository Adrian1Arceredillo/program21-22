/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class ChiclesRegalo {

    public static void main(String[] args) {

        int[] entrada;

        //[5, 1, 25] --> primer numero = envoltorios para otro chicle; segundo numero = entrada que nos darán con x (n1) envoltorios; tercer numero = entrada comprados inicialmente
        final int num_items = 3;
        entrada = new int[num_items];
        int regaloChicles;
        int sobran = 0;

        Scanner in = new Scanner(System.in);

        while (true) {
            //System.out.print("Enter the values: ");
            for (int i = 0; i <= entrada.length - 1; ++i) {
                entrada[i] = in.nextInt();
            }
            //System.out.println(Arrays.toString(entrada));

            if (entrada[0] == 0 && entrada[1] == 0 && entrada[2] == 0) {
                break;
            }

            int totalChicles = entrada[2];
            int envoltorios = entrada[2];

            int lote = entrada[0];
            int canje = entrada[1];

            if (lote <= canje) {
                System.out.println("RUINA");
            } else {
                while (envoltorios >= lote) {
                    regaloChicles = (envoltorios / lote) * canje;
                    sobran = envoltorios % lote;

                    envoltorios = sobran + regaloChicles;
                    //envoltorios = envoltorios % 2 + regaloChicles;

                    totalChicles = totalChicles + regaloChicles;

                }
                System.out.println(totalChicles + " " + envoltorios);

            }

        }
    }
}
