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
public class HillPatternD {

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

        // for first half portion (top to bottom)
        
        for (int row = 1; row <= numRows; ++row) {
            for (int col = 1; col <= numRows; ++col) {

                if ((row + col <= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("a ");
                } else {
                    System.out.print("  ");
                }
            }
            
            for (int col = 2; col <= numRows; ++col) {
                if (row <= col) {
                    System.out.print("f ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }  
        
        
        //Beheko triangelua
        for (int row = 1; row <= numRows; ++row) {
            for (int col = 1; col <= numRows; ++col) { // increasing
                if (row >= col) {
                    System.out.print("c ");
                } else {
                    System.out.print("  ");
                }
                //System.out.print("* ");               
            }

            for (int col = 1; col < numRows; ++col) {
                if (row + col < numRows) {
                    System.out.print("  ");
                } else {
                    System.out.print("d ");
                }

            }
            System.out.println();
        }

    }
}
/*
        for (int row = 1; row <= numRows; ++row) {
            //System.out.println("Empieza línea " + row);
            for (int col = numRows - row + 1; col >= 1; --col) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int row = 1; row <= numRows; ++row) {
            for (int col = 2; col <= numRows; ++col) {
                if (row <= col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
 */

 /*
(row <= col - numRows + 1)
 */
