/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class TestBuscaMinas {

    public static final int FILAS = 5;
    public static final int COLUMNAS = 5;
    public static final int cellSize = 60;

    private static String[][] plantilla = {
        {"-", "-", "-", "x", "-"},
        {"-", "x", "-", "-", "-"},
        {"-", "-", "-", "-", "x"},
        {"x", "x", "-", "-", "M"},
        {"-", "-", "-", "x", "-"}
    };

    private static String[][] mapaSinResolver = {
        {"-", "-", "-", "-", "-"},
        {"-", "-", "-", "-", "-"},
        {"-", "-", "-", "-", "-"},
        {"-", "-", "-", "-", "-"},
        {"-", "-", "-", "-", "-"}
    };

    private static int[][] puzzle
            = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}};

    private static boolean[][] contenido
            = {
                {true, true, true, true, true},
                {true, false, false, false, false},
                {true, false, false, false, false},
                {true, false, false, false, false},
                {true, false, false, false, false}
            };

    public static void main(String[] args) {
        //el programa terminará cuando encontremos la mina comodín, o cuando nos quedemos sin intentos
        int numMaxIntentos = 3; //cada vez que muramos, se preguntará si queremos gastar otro intento.
        int contIntentos = 0;
        int sumaPuntosLogrados = 0; //cada vez que se introduzca una casilla que no contenga una mina, se sumará 1 punto. Si se encuentra el comodín, se sumarán 100 puntos.
        int sumaMinasEncontradas = 0;    //cada vez que se encuentre una mina, esta variable se incrementará en 1.
        boolean tocado = false; //que se repita la solicitud mientras que no se encuentre mina.
        boolean comodin = false;    //cuando se encuentre el comodín "M", el juego preguntará si queremos seguir con las vidas/intentos que tengamos en ese momento
        boolean minaComodin = true; //si se encuentra esta mina, tendrás la opción de desactivar todas las minas de golpe

        //mostrar DÓNDE HAY minas
        System.out.println("Tablero RESUELTO: ");
        for (int i = 0; i < plantilla.length; ++i) {
            System.out.println(Arrays.toString(plantilla[i]));
            /*for (int j = 0; j < plantilla[i].length; ++j) {
                System.out.println((plantilla[i][j]));
            }*/
        }

        //mostrar MAPA GENERAL (sin resolver)
        /*System.out.println("[");
        for (int i = 0; i < mapaSinResolver.length; ++i) {
            System.out.println(Arrays.toString(mapaSinResolver[i]));
            
        }
        System.out.println("]");*/

        //-------------------------------------------------------------
        System.out.println("---------------");

        //System.out.println(plantilla[1][1]);
        Scanner in = new Scanner(System.in);

        do {
            
            System.out.println("Tablero sin resolver: ");
            verTablero(mapaSinResolver);
            System.out.println();
            
            System.out.println("Vidas restantes = " + numMaxIntentos);
            System.out.println("");

            System.out.print("Zein filatan? (1-5): ");
            int numeroFila = in.nextInt();
            System.out.print("Zein zutabetan? (1-5): ");
            int numeroColumna = in.nextInt();
            System.out.println("");

            //---------------------------------------------
            for (int i = 0; i < plantilla.length; ++i) {
                for (int j = 0; j < plantilla[i].length; ++j) {
                    if (plantilla[numeroFila - 1][numeroColumna - 1].equals("-")) {
                        tocado = false;
                        mapaSinResolver[numeroFila - 1][numeroColumna - 1] = "1";

                        //System.out.println("Se encontró agua. ");
                    } else if (plantilla[numeroFila - 1][numeroColumna - 1].equals("x")) {
                        tocado = true;
                        mapaSinResolver[numeroFila - 1][numeroColumna - 1] = "x";   //cuando se encuentre una mina, pondremos una "x", queriendo decir que había una mina y se ha desactivado
                        
                    } else if (plantilla[numeroFila - 1][numeroColumna - 1].equals("M")) {
                        comodin = true;
                        mapaSinResolver[numeroFila - 1][numeroColumna - 1] = "2";
                    }
                }
            }

            if (tocado && !comodin) {
                System.out.println("BOOM!! Insert coin to restar. \n");
                sumaMinasEncontradas = sumaMinasEncontradas + 1;
                //preguntar al jugador si quiere realizar otro intento

                System.out.print("Quieres intentarlo de nuevo? s/n: ");
                String nuevoIntento = in.next().toLowerCase();
                if (nuevoIntento.equals("s")) {
                    --numMaxIntentos;
                    if (numMaxIntentos > 0) {
                        System.out.print("Wow! Pareces una persona valiente. Restando un intento... Ok. \n");
                        System.out.println("");
                        System.out.println("------------------------------------");
                        //--numMaxIntentos;

                    } else {
                        System.out.println("Vaya... Te has quedado sin intentos. :(");
                    }
                } else if (nuevoIntento.equals("n")) {
                    System.out.println("Abandonando el juego...");
                    numMaxIntentos = 0;
                }
            } else if (!tocado && !comodin) {
                System.out.println("Lugar seguro. Puedes continuar. \n");
                System.out.println("------------------------------------");
                sumaPuntosLogrados = sumaPuntosLogrados + 1;
            }

            if (comodin) {
                System.out.println("Enhorabuena!! Has encontrado la Mina Comodin. ");
                sumaPuntosLogrados = sumaPuntosLogrados + 100;
                comodin = false;
                System.out.print("Quieres intentarlo de nuevo? s/n: ");
                String nuevoIntento = in.next().toLowerCase();
                if (nuevoIntento.equals("s")) {
                    //--numMaxIntentos;
                    if (numMaxIntentos > 0) {
                        System.out.print("Wow! Pareces una persona valiente. Restando un intento... Ok. \n");
                        System.out.println("");
                        System.out.println("------------------------------------");
                        //--numMaxIntentos;

                    } else {
                        System.out.println("Vaya... Te has quedado sin intentos. :(");
                    }
                } else if (nuevoIntento.equals("n")) {
                    System.out.println("Abandonando el juego...");
                    numMaxIntentos = 0;
                }
            }

        } while (/*!tocado && */numMaxIntentos > 0);

        System.out.println("------------");
        System.out.println("Puntuacion lograda: " + sumaPuntosLogrados + " / Minas encontradas: " + sumaMinasEncontradas);

        System.out.println("-------------");
        for (int i = 0; i < mapaSinResolver.length; ++i) {
            System.out.println(Arrays.toString(mapaSinResolver[i]));
            /*for (int j = 0; j < plantilla[i].length; ++j) {
                System.out.println((plantilla[i][j]));
            }*/
        }
    }

    public static void verTablero(String[][] miTablero) {
        for (int i = 0; i < mapaSinResolver.length; ++i) {
            System.out.println(Arrays.toString(mapaSinResolver[i]));
            /*for (int j = 0; j < plantilla[i].length; ++j) {
                System.out.println((plantilla[i][j]));
            }*/
        }
    }

}

/*
ver el array "puzzle";
for (int i = 0; i < puzzle.length; ++i) {
            System.out.println(Arrays.toString(puzzle[i]));
            //for (int j = 0; j < puzzle[i].length; ++j) {
                //System.out.println((puzzle[i][j]));
            //}
        }
 */
