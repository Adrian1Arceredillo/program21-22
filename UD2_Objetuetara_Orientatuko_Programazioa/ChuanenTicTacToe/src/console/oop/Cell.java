/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.oop;

/**
 *
 * @author arceredillo.adrian
 */
public class Cell {

    Seed content; // content of this cell of type Seed.
    // take a value of Seed.EMPTY, Seed.CROSS, or Seed.NOUGHT
    int row, col; // row and column of this cell, not used in this program

    /**
     * Constructor to initialize this cell
     */
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        clear();  // clear content
    }
    
    /** Clear the cell content to EMPTY */
   public void clear() {
      content = Seed.HUTSIK;
   }
 
   /** Paint itself */
   public void paint() {
      switch (content) {
         case CRUZ:
             System.out.print(" Ӽ ");
             break;
         case CIRCULO:
             System.out.print(" Ȱ ");
             break;
         case HUTSIK:
             System.out.print("   ");
             break;
      }
   }

}
