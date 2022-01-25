/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.non.oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Aldaketak: - Partida berriro hasteko galdetzea - Tableroa dotoreago inprimatu
 * (karaketere egokiak erabili) - isDraw() metodoa hobetu -> el programa
 * detectará que no puede haber un ganador y dirá que es un empate ANTES DE
 * LLENAR TODAS LAS CELDAS
 */
/**
 *
 * @author arceredillo.adrian
 */
public class TTTConsoleNonOO2P {

    //constantes de nombre para representar las semillas y el contenido de la celda
    public static final int HUTSIK = 0;
    public static final int CRUZ = 1;
    public static final int CIRCULO = 2;

    //constantes de nombre para representar los estados del juego
    public static final int PLAYING = 0;
    public static final int DRAW = 1;
    public static final int CRUZ_GANA = 2;
    public static final int CIRCULO_GANA = 3;

    //tablero de juego y el estado del juego
    public static final int FILAS = 4, COLUMNAS = 4;  //número de filas y de columnas
    public static int[][] tablero = new int[FILAS][COLUMNAS];   //tablero de juego en 2D array
    //containing (EMPTY, CROSS, NOUGHT)

    public static int estadoActual; //estado actual del juego
    // (PLAYING, DRAW, CRUZ_GANA, CIRCULO_GANA)

    public static int jugadorActual;    //jugador actual (CRUZ o CIRCULO)
    public static int actualFila, actualColumna;    //fila y columna actual de la semilla

    public static Scanner in = new Scanner(System.in); //input scanner

    public static void main(String[] args) {

        do {
            //iniciar y mostrar el tablero de juego y el estado actual
            iniciarJuego();
            imprimirTablero();

            //jugar UNA VEZ al juego
            do {
                movimientoJugador(jugadorActual);   //actualizar "actualFila" y "actualColumna"
                actualizarJuego(jugadorActual, actualFila, actualColumna);  //actualizar "estadoActual"
                imprimirTablero();

                //imprimir un mensaje si el juego se termina
                if (estadoActual == CRUZ_GANA) {
                    System.out.println("'Ӽ' irabazi du! Zorionak! ");
                } else if (estadoActual == CIRCULO_GANA) {
                    System.out.println("'Ȱ' irabazi du! Zorionak! ");
                } else if (estadoActual == DRAW) {
                    System.out.println("Its a Draw! Bye! ");
                }

                //cambiar de jugador
                jugadorActual = (jugadorActual == CRUZ) ? CIRCULO : CRUZ;   //mirar abajo

            } while (estadoActual == PLAYING);  //repetir si no se ha terminado el juego

            //preguntar al usuario si quiere jugar de nuevo
            System.out.print("Nahi duzu berriro jolastea? (s/n) ");
            char respuestaJugarDeNuevo = in.next().toLowerCase().charAt(0);
            if (respuestaJugarDeNuevo != 's') {
                System.out.println("-----------");
                System.out.println("Partida ixten ari da! Agur! ");
                System.out.println("");
                System.exit(0); //cerrar/terminar el programa 
            }

        } while (true); //repetir hasta que el usuario responda que NO quiere jugar de nuevo. 
    }

    public static void iniciarJuego() {
        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                tablero[row][col] = HUTSIK; //todas las celdas vacías
            }
        }
        estadoActual = PLAYING; //listo para jugar
        jugadorActual = CRUZ;   //el PRIMERO en jugar es CRUZ
    }

    public static void imprimirTablero() {
        /*
        String codigoUnicodeTable = "01AA";
        int codInt = Integer.parseInt(codigoUnicodeTable, 16);
        char c[] = Character.toChars(codInt);   //implementación de símbolos de la tabla unicode
         */

        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                //System.out.println("a");
                imprimirCelda(tablero[row][col]);   //imprimir cada celda
                if (col < COLUMNAS - 1) {

                    System.out.print("ƪ");
                }
            }
            System.out.println("");
            if (row < FILAS - 1) {  //también se puede poner: -> if(row != FILAS - 1)
                System.out.println("-----------");
            }
        }
        System.out.println("");
    }

    public static void imprimirCelda(int contenido) {

        /*
        //unicode -> cruz
        String strUnicodeTableCruz = "04C1";
        int codIntCruz = Integer.parseInt(strUnicodeTableCruz, 16);
        char simCruz[] = Character.toChars(codIntCruz);   //implementación de símbolos de la tabla unicode
        
        //unicode -> círculo
        String strUnicodeTableCirculo = "0555";
        int codIntCirculo = Integer.parseInt(strUnicodeTableCirculo, 16);
        char simCirculo[] = Character.toChars(codIntCirculo);   //implementación de símbolos de la tabla unicode
         */
        switch (contenido) {
            case HUTSIK:
                System.out.print("   ");
                break;
            case CRUZ:
                System.out.print(" Ӽ ");
                break;
            case CIRCULO:
                System.out.print(" Ȱ ");
                break;
        }
    }

    /**
     * El jugador que posea "theSeed", hará un movimiento; con input validation.
     * Actualizar las variables globales "actualFila" y "actualColumna"
     *
     */
    public static void movimientoJugador(int theSeed) {

        boolean validInput = false;     //for input validation
        do {
            if (theSeed == CRUZ) {  //dependiendo de quién tenga theSeed, se mostrará un mensaje al jugador en cuestión
                System.out.println("Player 'Ӽ', sartu zure mugimendua (lerr.[1-3] zut.[1-3])");
            } else {
                System.out.println("Player 'Ȱ', sartu zure mugimendua (lerr.[1-3] zut.[1-3])");
            }
            System.out.print("Zein lerro? ");    //pedir al jugador la FILA deseada
            int row = in.nextInt() - 1;
            System.out.print("Zein zutabe? "); //pedir al jugador la COLUMNA deseada
            int col = in.nextInt() - 1;
            System.out.println();

            if (row >= 0 && row < FILAS && col >= 0 && col < COLUMNAS && tablero[row][col] == HUTSIK) {
                actualFila = row;
                actualColumna = col;
                tablero[row][col] = theSeed; //actualizar el contenido del tablero de juego
                validInput = true;  // input okay, salir del loop
            } else {
                System.out.println("");
                System.out.println("This move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Saiatu berriro... \n");
            }
        } while (!validInput);
    }

    /**
     * Devolverá true si el jugador con theSeed ha ganado después de colocar en
     * filaAct, columnaAct
     *
     * @param theSeed
     * @param filaAct
     * @param columnaAct
     * @return
     */
    public static boolean haGanado(int theSeed, int filaAct, int columnaAct) {
        return (tablero[filaAct][0] == theSeed //3 en una fila
                && tablero[filaAct][1] == theSeed
                && tablero[filaAct][2] == theSeed
                || tablero[0][columnaAct] == theSeed //3 en una columna
                && tablero[1][columnaAct] == theSeed
                && tablero[2][columnaAct] == theSeed
                || filaAct == columnaAct //3 en la diagonal normal
                && tablero[0][0] == theSeed
                && tablero[1][1] == theSeed
                && tablero[2][2] == theSeed
                || filaAct + columnaAct == 2 //3 en la diagonal inversa
                && tablero[0][2] == theSeed
                && tablero[1][1] == theSeed
                && tablero[2][0] == theSeed);
    }

    /**
     * Actualizar "estadoActual" después de que el jugador con theSeed haya
     * colocado en filaAct, columnaAct
     *
     * @param theSeed
     * @param filaAct
     * @param columnaAct
     */
    public static void actualizarJuego(int theSeed, int filaAct, int columnaAct) {
        if (haGanado(theSeed, filaAct, columnaAct)) {   //comprobar si es el movimiento que da la victoria
            estadoActual = (theSeed == CRUZ) ? CRUZ_GANA : CIRCULO_GANA;
        } else if (isDraw2()) {  //comprobar si es EMPATE -> no ha ganado ninguno, y no quedan celdas libres
            System.out.println("aaaa");
            estadoActual = DRAW;
        }
        //de lo contrario, no se harán cambios en "estadoActual" (still PLAYING)
    }

    /**
     * Devolver/return true si es un dibujo (no hay más celdas libres)
     *
     * @return
     */
    public static boolean isDraw() {
        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                if (tablero[row][col] == HUTSIK) {
                    return false;   //se ha encontrado una casilla libre, 
                }
            }
        }
        return true;    //casilla no vacía; es un empate
    }

    /**
     * Devolver/return true si es un dibujo (no hay más celdas libres) Mejorar
     * este método, de forma que cuando no pueda haber un ganador, el programa
     * lo indique SIN HABERSE LLENADOR TODAS LAS CELDAS
     *
     * @return
     */
    public static boolean isDraw2() {
        int contX;  //contador de fichas X en cada comprobación (comprobación = filas/columnas/diagonales)
        int contO;  //contador de fichas O en cada comprobación (comprobación = filas/columnas/diagonales)
        
        //sentido horizontal
        for (int rows = 0; rows < FILAS; rows++) {
            contX = 0;
            contO = 0;

            for (int cols = 0; cols < COLUMNAS; ++cols) {
                if (tablero[rows][cols] == CRUZ) {
                    ++contX;
                } else if (tablero[rows][cols] == CIRCULO) {
                    ++contO;
                }
            }
            //System.out.println(contX + " / " + contO);
            if ((contX == 0) || (contO == 0)) {
                //System.out.println("hori");
                return false; //no es empate si en la misma FILA solo hay un tipo de ficha, o si está toda la FILA VACÍA
            }
        }

        //sentido vertical
        for (int cols = 0; cols < COLUMNAS; cols++) {
            contX = 0;
            contO = 0;

            for (int rows = 0; rows < FILAS; ++rows) {
                if (tablero[rows][cols] == CRUZ) {
                    ++contX;
                } else if (tablero[rows][cols] == CIRCULO) {
                    ++contO;
                }
            }
            //System.out.println(contX + " / " + contO);
            if ((contX == 0) || (contO == 0)) {
                //ystem.out.println("vert");
                return false; //no es empate si en la misma COLUMNA solo hay un tipo de ficha, o si está toda la COLUMNA VACÍA
            }
        }

        //sentido diagonal NORMAL
        contX = 0;
        contO = 0;
        for (int i = 0; i < FILAS; ++i) {   //se puede poner tanto FILAS como COLUMNAS
            if (tablero[i][i] == CRUZ) {
                ++contX;
            } else if (tablero[i][i] == CIRCULO) {
                ++contO;
            }
        }
        //System.out.println(contX + " / " + contO);
        if ((contX == 0) || (contO == 0)) {
            //System.out.println("diaN");
            return false;   //no es empate si en la DIAGONAL NORMAL solo hay un tipo de ficha, o si está toda la DIAGONAL NORMAL VACÍA
        }

        //sentido diagonal INVERSA
        contX = 0;
        contO = 0;
        for (int i = 0; i < FILAS; ++i) {   //se puede poner tanto FILAS como COLUMNAS
            if (tablero[i][FILAS - i - 1] == CRUZ) {
                ++contX;
            } else if (tablero[i][FILAS - i - 1] == CIRCULO) {
                ++contO;
            }
        }
        //System.out.println(contX + " / " + contO);
        if ((contX == 0) || (contO == 0)) {
            //System.out.println("diaI");
            return false;   //no es empate si en la DIAGONAL INVERSA solo hay un tipo de ficha, o si está toda la DIAGONAL INVERSA VACÍA
        }
        
        
        

        return true;
        
    }

}

/*
Explicación bucle if:
jugadorActual = (jugadorActual == CRUZ) ? CIRCULO : CRUZ;

Este tipo de estructura if hace que, si se cumple lo que está entre 
paréntesis (condición), se llevará a cabo la SEGUNDA parte del if; en 
cambio, si no se cumple la condición, se realizará la TERCERA parte. 
Es decir:
--> (jugadorActual == CRUZ) -> PRIMERA parte o condición a cumplir
--> "?" -> quiere decir: "si se cumple..."
--> CIRCULO -> SEGUNDA parte o lo que se hará si SE CUMPLE la condición
--> ":" -> quiere decir: "si NO se cumple..." 
--> CRUZ -> TERCERA parte o lo que se hará si NO SE CUMPLE la condición 
 */
 /*
TicTacToe = 3 en raya
https://personal.ntu.edu.sg/ehchua/programming/java/JavaGame_TicTacToe.html#zz-2.
simbolos unicode table -> https://unicode-table.com/en/
 */
 /*
TTTConsoleNonOO2P
 */
