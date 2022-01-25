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
public class Ventas_105 {

    public static void main(String[] args) {

        double[] ventas;
        final int num_dias = 6; //7
        //int eguna = 0;      //determinará en qué día de la semana se encuentra el valor que deseamos
        //int max_ganancias = 0;
        //int min_ganancias = 0;
        //String[] astea = {"martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        ventas = new double[num_dias];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= num_dias - 1; ++i) {   //<=num_dias
            System.out.print("Introduce las ganancias del dia " + (i + 1) + ": ");
            ventas[i] = in.nextDouble();
            
            /*
            if (ventas[i] == -1) {
                break;
            }
            */
            
        }

        System.out.println(Arrays.toString(ventas));
        System.out.print(maxVenta(ventas) + " ");
        System.out.print(minVenta(ventas) + " ");
        //la siguiente expresión/estructura significa lo mismo que el if comentado al final del programa. En este caso lo he utilizado para saber si el método boolean es True o no.
        System.out.println(domingoMasQueMediaSemanal(ventas) ? "SI" : "No");
        //System.out.printf("Suma %.2f\n", sumaSemanaGanancias(ventas));
        //System.out.printf("Media %.2f\n", mediaSemanaGanancias(ventas));

    }

    public static String maxVenta(double[] ganancias) {
        //objetivo del método:
        //buscar en el array "astea", el dato que está en la misma posición que el dato máximo en el array "ventas".
        //devolverá el día de la semana correspondiente a esa posición

        int max_venta = 0;
        String[] astea = {"martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        String pos = "";

        for (int i = 0; i <= ganancias.length - 1; ++i) {
            if (ganancias[i] > max_venta) {
                max_venta = (int) (double) ganancias[i];
                pos = astea[i].toUpperCase();
            }
        }
        return pos;

    }

    public static String minVenta(double[] ganancias) {
        //objetivo del método:
        //buscar en el array "astea", el dato que está en la misma posición que el dato mínimo en el array "ventas".
        //devolverá el día de la semana correspondiente a esa posición

        int min_venta = (int) ganancias[0];
        String[] astea = {"martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        String pos2 = "";

        for (int i = 0; i <= ganancias.length - 1; ++i) {
            if (ganancias[i] < min_venta) {
                min_venta = (int) (double) ganancias[i];
                pos2 = astea[i].toUpperCase();
            }
        }
        return pos2;

    }

    public static double sumaSemanaGanancias(double[] ganancias) {
        //objetivo del método:
        //hacer la suma de todos los elementos del array "ventas", para poder calcular la media más adelante.

        double totalSemana = 0;
        for (int i = 0; i <= ganancias.length - 1; ++i) {
            totalSemana = (double) (totalSemana) + ganancias[i];
        }
        return totalSemana;
    }

    public static double mediaSemanaGanancias(double[] ganancias) {
        //objetivo del método:
        //calcular la media de todos los elementos introducidos en el array "ventas".

        double mediaSemana = (double) (sumaSemanaGanancias(ganancias)) / ganancias.length;
        return mediaSemana;

    }

    public static boolean domingoMasQueMediaSemanal(double[] ganancias) {

        return ganancias[5] > mediaSemanaGanancias(ganancias);
    }
}

/*
Enunciado:
https://www.aceptaelreto.com/problem/statement.php?id=105
 */

 /*
        if (domingoMasQueMediaSemanal(ventas) == true) {
            System.out.println("SI.");
        } else {
            System.out.println("NO.");
        }
 */
