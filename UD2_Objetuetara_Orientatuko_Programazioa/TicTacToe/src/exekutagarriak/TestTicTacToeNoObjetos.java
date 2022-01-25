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
public class TestTicTacToeNoObjetos {

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
    public static final int FILAS = 3, COLUMNAS = 3;  //número de filas y de columnas
    public static int[][] tablero = new int[FILAS][COLUMNAS];   //tablero de juego en 2D array
    //containing (EMPTY, CROSS, NOUGHT)

    public static int estadoActual; //estado actual del juego
    // (PLAYING, DRAW, CRUZ_GANA, CIRCULO_GANA)

    public static int jugadorActual;    //jugador actual (CRUZ o CIRCULO)
    public static int actualFila, actualColumna;    //fila y columna actual de la semilla

    public static Scanner in = new Scanner(System.in); //input scanner

    public static void main(String[] args) {

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
                System.out.println("'X' won! Bye! ");
            } else if (estadoActual == CIRCULO_GANA) {
                System.out.println("'O' won! Bye! ");
            } else if (estadoActual == DRAW) {
                System.out.println("Its a Draw! Bye! ");
            }
            
            //cambiar de jugador
            jugadorActual = (jugadorActual == CRUZ) ? CIRCULO : CRUZ;   //mirar abajo
        } while (estadoActual == PLAYING);  //repetir si no se ha terminado el juego

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
        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                //System.out.println("a");
                imprimirCelda(tablero[row][col]);   //imprimir cada celda
                if (col < COLUMNAS - 1) {
                    System.out.print("|");
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
        switch (contenido) {
            case HUTSIK:
                System.out.print("   ");
                break;
            case CRUZ:
                System.out.print(" X ");
                break;
            case CIRCULO:
                System.out.print(" O ");
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
                System.out.println("Player 'X', enter your move (row[1-3] column[1-3])");
            } else {
                System.out.println("Player 'O', enter your move (row[1-3] column[1-3])");
            }
            System.out.print("Which row? ");    //pedir al jugador la FILA deseada
            int row = in.nextInt() - 1;
            System.out.print("Which column? "); //pedir al jugador la COLUMNA deseada
            int col = in.nextInt() - 1;

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
     * Devolverá true si el jugador con theSeed ha ganado después de 
     * colocar en filaAct, columnaAct
     * @param theSeed
     * @param filaAct
     * @param columnaAct
     * @return 
     */
    public static boolean haGanado(int theSeed, int filaAct, int columnaAct) {
        return (tablero[filaAct][0] == theSeed          //3 en una fila
                    && tablero[filaAct][1] == theSeed
                    && tablero[filaAct][2] == theSeed
                || tablero[0][columnaAct] == theSeed    //3 en una columna
                    && tablero[1][columnaAct] == theSeed
                    && tablero[2][columnaAct] == theSeed
                || filaAct == columnaAct                //3 en la diagonal normal
                    && tablero[0][0] == theSeed
                    && tablero[1][1] == theSeed
                    && tablero[2][2] == theSeed
                || filaAct + columnaAct == 2            //3 en la diagonal inversa
                    && tablero[0][2] == theSeed
                    && tablero[1][1] == theSeed
                    && tablero[2][0] == theSeed                
                );
    }
    
    /**
     * Actualizar "estadoActual" después de que el jugador con theSeed 
     * haya colocado en filaAct, columnaAct
     * @param theSeed
     * @param filaAct
     * @param columnaAct 
     */
    public static void actualizarJuego(int theSeed, int filaAct, int columnaAct) {
        if (haGanado(theSeed, filaAct, columnaAct)) {   //comprobar si es el movimiento que da la victoria
            estadoActual = (theSeed == CRUZ) ? CRUZ_GANA : CIRCULO_GANA;
        } else if (isDraw()) {  //comprobar si es EMPATE -> no ha ganado ninguno, y no quedan celdas libres
            estadoActual = DRAW;
        }
        //de lo contrario, no se harán cambios en "estadoActual" (still PLAYING)
    }
    
    
    /**
     * Devolver/return true si es un dibujo (no hay más celdas libres)
     * @return 
     */
    public static boolean isDraw() {
        for (int row = 0; row < FILAS; ++row) {
            for (int col = 0; col < COLUMNAS; ++col) {
                if(tablero[row][col] == HUTSIK) {
                    return false;   //se ha encontrado una casilla libre, 
                }
            }
        }
        return true;    //casilla no vacía; es un dibujo
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
 */
