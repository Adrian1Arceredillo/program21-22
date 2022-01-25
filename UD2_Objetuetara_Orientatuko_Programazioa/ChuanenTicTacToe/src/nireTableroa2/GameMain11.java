/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nireTableroa2;

/*import console.oop.GameState;
import console.oop.Seed;*/
import console.oop.*;
import static nireTableroa2.Board.ROWS;
import static nireTableroa2.Board.COLS;
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class GameMain11 {

    private Board board;            // the game board
    private GameState currentState; // the current state of the game (of enum GameState)
    private Seed currentPlayer;     // the current player (of enum Seed)

    private static Scanner in = new Scanner(System.in);  // input Scanner

    /**
     * Constructor to setup the game
     */
    public GameMain11() {

        Scanner in = new Scanner(System.in);
        System.out.print("Filas del tablero: ");
        int filas1 = in.nextInt();
        System.out.print("Columnas del tablero: ");
        int columnas1 = in.nextInt();

        ROWS = filas1;
        COLS = columnas1;

        board = new Board();  // allocate game-board

        // Initialize the game-board and current status
        initGame();
        board.paint();        

        // Play the game once. Players CROSS and NOUGHT move alternately.
        do {
            playerMove(currentPlayer); // update the content, currentRow and currentCol
            board.paint();             // ask the board to paint itself
            updateGame(currentPlayer); // update currentState
            // Print message if game-over
            if (currentState == GameState.CRUZ_GANA) {
                System.out.println("'X' won! Bye!");
            } else if (currentState == GameState.CIRCULO_GANA) {
                System.out.println("'O' won! Bye!");
            } else if (currentState == GameState.DRAW) {
                System.out.println("It's Draw! Bye!");
            }
            // Switch player
            currentPlayer = (currentPlayer == Seed.CRUZ) ? Seed.CIRCULO: Seed.CRUZ;
        } while (currentState == GameState.PLAYING);  // repeat until game-over
    }

    /**
     * Initialize the game-board contents and the current states
     */
    public void initGame() {
        board.init();  // clear the board contents
        currentPlayer = Seed.CRUZ;       // CROSS plays first
        currentState = GameState.PLAYING; // ready to play
    }

    /**
     * The player with "theSeed" makes one move, with input validation. Update
     * Cell's content, Board's currentRow and currentCol.
     */
    public void playerMove(Seed theSeed) {
        boolean validInput = false;  // for validating input
        do {
            if (theSeed == Seed.CRUZ) {
                System.out.print("Player 'X', enter your move (row[1-" + ROWS + "] column[1-" + COLS + "]): ");
            } else {
                System.out.print("Player 'O', enter your move (row[1-" + ROWS + "] column[1-" + COLS + "]): ");
            }
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
                    && board.cells[row][col].content == Seed.HUTSIK) {
                board.cells[row][col].content = theSeed;
                board.currentRow = row;
                board.currentCol = col;
                validInput = true; // input okay, exit loop
            } else {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                        + ") is not valid. Try again...");
            }
        } while (!validInput);   // repeat until input is valid
    }

    /**
     * Update the currentState after the player with "theSeed" has moved
     */
    public void updateGame(Seed theSeed) {
        if (board.finalJuego(theSeed)) {  // check for win
            currentState = (theSeed == Seed.CRUZ) ? GameState.CRUZ_GANA : GameState.CIRCULO_GANA;
        } else if (board.isDraw()) {  // check for draw
            currentState = GameState.DRAW;
        }
        // Otherwise, no change to current state (still GameState.PLAYING).
    }


    /**
     * The entry main() method
     */
    public static void main(String[] args) {
        new GameMain11();  // Let the constructor do the job
    }
}
