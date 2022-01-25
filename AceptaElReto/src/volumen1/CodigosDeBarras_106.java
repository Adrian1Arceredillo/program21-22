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
 * @author arceredillo.adrian
 */
public class CodigosDeBarras_106 {

    public static void main(String[] args) {

        int[] numCodBarras;
        final int num_items = 1;
        int digitsEAN8 = 8, digitsEAN13 = 13;
        //int numCifras = 0;
        //int sumarCero = '0';

        numCodBarras = new int[num_items];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= numCodBarras.length - 1; ++i) {
            System.out.print("Enter a number: ");
            numCodBarras[i] = in.nextInt();

            if (numCodBarras[i] == 0) {
                break;
            }

            int casoCod = numCodBarras[i];
            int numCifras = 0;

            while (casoCod != 0) {
                casoCod = casoCod / 10;
                ++numCifras;
            }

            if (numCifras <= digitsEAN8) {

                String cerosEAN8 = "";
                //long l=Long.parseLong(cerosEAN8);  
                int cuantosCerosEAN8 = digitsEAN8 - numCifras;
                if (cuantosCerosEAN8 >= 1) {
                    for (int ponerCeros = 0; ponerCeros <= cuantosCerosEAN8 - 1; ++ponerCeros) {
                        cerosEAN8 = cerosEAN8 + "0";
                    }
                    //System.out.println(cerosEAN8);
                }
                String numNewEAN8 = (cerosEAN8 + numCodBarras[i]);
                System.out.println(numNewEAN8);
                //System.out.println(numCodBarras[i] + " tiene 8 cifras. ");
            } else if ((numCifras >= digitsEAN8) && (numCifras < digitsEAN13)) {

                String cerosEAN13 = "";

                int cuantosCerosEAN13 = digitsEAN13 - numCifras;
                if (cuantosCerosEAN13 >= 1) {
                    for (int ponerCeros = 0; ponerCeros <= cuantosCerosEAN13 - 1; ++ponerCeros) {
                        cerosEAN13 = cerosEAN13 + "0";
                    }

                    System.out.println(cerosEAN13);
                }
                String numNewEAN8 = (cerosEAN13 + numCodBarras[i]);
                //long l = Long.parseLong(cerosEAN13);
                System.out.println(numNewEAN8);
                System.out.println(numCodBarras[i] + " tiene 13 cifras. ");
                
            } else {
                
            }
        }
        //System.out.println(numCifras);
        /*
        System.out.println(Arrays.toString(numCodBarras));

        for (int idx = 0; idx <= numCodBarras.length - 1; ++idx) {
            String comprobarDigits = " " + numCodBarras[idx];

            System.out.println(comprobarDigits + " a");
        }
        */
    }

    public static String agregarCeros(String string, int largo) {
        String ceros = "";

        int cantidad = largo - string.length();

        if (cantidad >= 1) {
            for (int i = 0; i < cantidad; i++) {
                ceros += "0";
            }

            return (ceros + string);
        } else {
            return string;
        }
    }
}

/*
http://puntocomnoesunlenguaje.blogspot.com/2012/06/java-ejercicios-resueltos-1.html
https://www.lawebdelprogramador.com/foros/Java/679076-RELLENAR-CON-CEROS-A-LA-IZQUIERDA.html
 */
