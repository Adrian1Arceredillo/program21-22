/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nireTableroa2;

import nireTableroa2.Board;
import nireTableroa2.Cell;
import console.oop.*;
import java.util.Scanner;



/**
 *
 * @author arceredillo.adrian
 */
public class Board {
    
    public static int ROWS;
    public static int COLS;

    
    Cell[][] cells;  
    public int currentRow, currentCol;  // fila y columna del jugador actual

    /**
     * Constructor que inicializa el board
     */
    public Board() {
        cells = new Cell[ROWS][COLS];  // allocate the array
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                cells[row][col] = new Cell(row, col); // allocate los elementos del array
            }
        }
    }
    
    /** Initialize (or re-initialize) the contents of the game board */
   public void init() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            cells[row][col].clear();  // clear the cell content
         }
      }
   }
   
   
   /** Return true if it is a draw (i.e., no more EMPTY cell) */
   public boolean isDraw() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            if (cells[row][col].content == Seed.HUTSIK) {
               return false; // an empty seed found, not a draw, exit
            }
         }
      }
      return true; // no empty cell, it's a draw
   }
   
   /** Return true if the player with "theSeed" has won after placing at
       (currentRow, currentCol) */
   public boolean finalJuego(Seed theSeed) {
      for (int i = 0; i < ROWS; ++i) {
          for (int j = 0; j < COLS; ++j) {
              if (cells[i][j].content == Seed.HUTSIK) {
                  return false;
              }
          }
      }
        return true;
   }
 
   /** Paint itself */
   public void paint() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            cells[row][col].paint();   // each cell paints itself
            if (col < COLS - 1) System.out.print("|");
         }
         System.out.println();
         if (row < ROWS - 1) {
             for (int c = 0; c < COLS; ++c) {
                 System.out.print("----");
             }
             System.out.println("");
            
         }
      }
   }
   
   
    
    
}
