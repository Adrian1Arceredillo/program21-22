package Figuras_pyramids;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class HillPatternA {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numRows;
        //int numCols;
        //definir el número de filas que queremos
        System.out.print("Enter the rows: ");
        numRows = in.nextInt();
        //definir el número de columnas que queremos
        //System.out.print("Enter the columns: ");
        //numCols = in.nextInt();
        
        for (int row = 1; row <= numRows; ++row) {
            for (int col = 1, numCols = 2 * numRows -1; col <= numCols; ++col) {
                
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            
            
            System.out.println();
        }
        
    }
    
}

/*
for (int row = 1; row <= numRows; ++row) {
            for (int col = 1, numCols = 2 * numRows -1; col <= numCols; ++col) {
                
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            
            
            System.out.println();
        }
for (int col = 2; col <= numRows; col++) {  // skip col = 1
            if (row >= col) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
         }
*/