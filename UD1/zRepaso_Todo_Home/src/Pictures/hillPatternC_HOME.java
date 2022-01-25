/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pictures;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class hillPatternC_HOME {

    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= 2 * size - 1; ++col) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
            
        }
        
        for (int row = 2; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {

                if (row <= col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            for (int col = row; col < size; col++) { // decreasing
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
