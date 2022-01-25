/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class DiasQueFaltan {

    public static void main(String[] args) {

        int entradaDia;
        int entradaMes;

        int sumaDias = 0;
        final int num_meses = 12;

        int dias_meses[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner in = new Scanner(System.in);
        int veces = in.nextInt();

        for (int i = 0; i < veces; ++i) {

            entradaDia = in.nextInt();
            entradaMes = in.nextInt() - 1;
            //System.out.println(entradaDia + "/" + entradaMes);
            int faltan = 0;

            for (int m = entradaMes; m < dias_meses.length; ++m) {

                if (m == entradaMes) {
                    faltan = dias_meses[m] - entradaDia;

                } else {
                    faltan = faltan + dias_meses[m];
                }

            }
            System.out.println(faltan);
        }
    }

}

/*
https://es.stackoverflow.com/questions/50371/calcular-cuantos-d%C3%ADas-faltan-con-este-m%C3%A9todo/50381
https://www.it-swarm-es.com/es/java/como-iterar-traves-del-rango-de-fechas-en-java/970168864/
 */

 /*
for (int i = entradaMes; i < ultMes && entradaMes >= 0; --entradaMes, ++i) {
            //++mesesFaltan;
            if (entradaMes % 2 != 1) {
                sumaDias = sumaDias + diasMes1 + entradaDia;
            } else if (entradaMes % 2 == 0) {
                sumaDias = sumaDias + diasMes4 + entradaDia;
            } else if (entradaMes == 2) {
                sumaDias = sumaDias + diasMes2 + entradaDia;
            }
            System.out.println(entradaMes);
        }
 */
