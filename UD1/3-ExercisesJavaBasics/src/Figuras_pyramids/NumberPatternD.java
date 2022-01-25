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
public class NumberPatternD {

    public static void main(String[] args) {

        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                
                if (row + col <= size + 1) {
                    int numero = (size + 2) - col - row;
                    System.out.print(numero + " ");
                    
                } else {
                    System.out.print("  ");
                    //++numero;
                }
                
                //System.out.print("* ");
            }
            System.out.println();
        }

    }

}
