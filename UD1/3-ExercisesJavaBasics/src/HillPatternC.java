
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
public class HillPatternC {

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

        //Goiko triangelua
        for (int row = 1; row <= numRows; ++row) {
            for (int col = 1, numCols = 2 * numRows - 1; col <= numCols; ++col) {

                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }        
        
        //Beheko triangelua
        for (int row = 2; row <= numRows; ++row) {
            for (int col = 1; col <= numRows; ++col) { // increasing
                if (row <= col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                //System.out.print("* ");               
            }
            for (int col = row; col < numRows; ++col) { // decreasing
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//https://simplycoding.in/1-super-easy-star-reverse-hill-program/

/*
for (int row = 2; row <= numRows; ++row) {
            for (int col = 1; col <= numRows; ++col) { // increasing
                if (row <= col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                //System.out.print("* ");               
            }
            for (int col = row; col < numRows; ++col) { // decreasing
                System.out.print("* ");
            }

            System.out.println();
        }
*/
