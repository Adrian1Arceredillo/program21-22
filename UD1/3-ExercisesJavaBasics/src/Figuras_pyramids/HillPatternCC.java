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
public class HillPatternCC {

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

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                System.out.print(" ");
            }
            --numRows;
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        numRows = 1;
         for (int row = 1; row <= numRows - 1; row++) 
        {
            for (int col = 1; col <= numRows; col++) 
            {
                System.out.print(" ");
            }
            ++numRows;
            for (int col = 1; col <= 2 * (numRows - row) - 1; col++) 
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

//https://simplycoding.in/1-super-easy-star-reverse-hill-program/

/*

 */
