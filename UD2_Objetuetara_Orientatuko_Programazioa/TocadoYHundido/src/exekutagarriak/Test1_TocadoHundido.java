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
 * @author arceredillo.adrian
 */
public class Test1_TocadoHundido {

    public static final int FILAS = 5;  //filas tablero
    public static final int COLUMNAS = 5;   //columnas tablero
    public static final int CELL_SIZE = 60; //tamaño celda

    //constantes de nombre para representar las semillas y el contenido de la celda
    public static final int HUTSIK = 0;
    public static final int BARCO = 1;
    public static final int AGUA = 2;
    public static final int TROPA1 = 3; //jugador 1
    //public static final int TROPA2 = 4; //jugador 2
    
    //constantes de nombre para representar los estados del juego
    public static final int PLAYING = 0;
    public static final int DRAW = 1;

    public static int estadoActual; //estado actual del juego

    private static String[][] mapaSoluciones = {
        {"-", "-", "x", "x", "-"},
        {"-", "x", "x", "-", "-"},
        {"x", "-", "-", "x", "x"},
        {"x", "-", "x", "-", "x"},
        {"x", "-", "-", "-", "-"}
    };

    public static int[][] mapaSinResolver = new int[FILAS][COLUMNAS];
    /*mapaSinResolver = {
        "-"
    };*/

    public static int jugadorActual;    //tropa1 o tropa2
    public static int actualFila, actualColumna;    //fila y columna actual de la semilla

    public static Scanner in = new Scanner(System.in); //input scanner

    public static void main(String[] args) {

        int numMaxIntentos = 3; //cada vez que muramos, se preguntará si queremos gastar otro intento.
        int contIntentos = 0;
        int sumaPuntosLogrados = 0; //cada vez que se introduzca una casilla que no contenga una mina, se sumará 1 punto.
        boolean tocado = false; //que se repita la solicitud mientras que no se encuentre agua.
        boolean minaComodin = true; //si se encuentra esta mina, tendrás la opción de desactivar todas las minas de golpe

        //iniciar el juego e imprimir el tablero -> mapaSinResolver
        iniciarJuego();
        imprimirTableroSinResolver();
        //System.out.println(mapaSinResolver);
        //mostrar plantilla -> mapaSinResolver

        do {
            imprimirTableroSinResolver();
            imprimirTableroResuelto();
            movimientoJugador();

            //cambiar de jugador
            
        } while (estadoActual == PLAYING);  //repetir si no se ha terminado el juego

    }

    public static void iniciarJuego() {
        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                mapaSinResolver[row][col] = HUTSIK; //todas las celdas vacías
            }
        }
        estadoActual = PLAYING; //listo para jugar
    }

    public static void imprimirTableroSinResolver() {
        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                imprimirCelda(mapaSinResolver[row][col]);
                if (col < COLUMNAS - 1) {
                    System.out.print("|");
                }
            }
            System.out.println("");
            if (row < FILAS - 1) {  //también se puede poner: -> if(row != FILAS - 1)
                System.out.println("---w---w---w---w---");
            }
        }
        System.out.println("");
    }

    public static void imprimirCelda(int contenido) {
        switch (contenido) {
            case HUTSIK:
                System.out.print(" ? ");
                break;
            case BARCO:
                System.out.print(" X ");
                break;
            case AGUA:
                System.out.print(" a ");
                break;
        }
    }

    public static void imprimirTableroResuelto() {
        System.out.println("[");
        for (int i = 0; i < mapaSoluciones.length; ++i) {
            System.out.println(Arrays.toString(mapaSoluciones[i]));
            /*for (int j = 0; j < plantilla[i].length; ++j) {
                System.out.println((plantilla[i][j]));
            }*/
        }
        System.out.println("]");
        System.out.println("");
    }

    //seguir con el método movimientoUsuario()  -> 
    public static void movimientoJugador() {

        boolean validInput = false;     //for input validation
        do {
            System.out.println("Player 'X', enter your move (row[1-3] column[1-3])");
            System.out.print("Which row? ");    //pedir al jugador la FILA deseada
            int row = in.nextInt() - 1;
            System.out.print("Which column? "); //pedir al jugador la COLUMNA deseada
            int col = in.nextInt() - 1;

            if (row >= 0 && row < FILAS && col >= 0 && col < COLUMNAS && mapaSinResolver[row][col] == HUTSIK) {
                actualFila = row;
                actualColumna = col;
                mapaSinResolver[row][col] = BARCO; //actualizar el contenido del tablero de juego
                validInput = true;  // input okay, salir del loop
            } else {
                System.out.println("");
                System.out.println("This move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Saiatu berriro... \n");
            }
        } while (!validInput);
    }

}
