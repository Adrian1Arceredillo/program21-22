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
public class hillPatternD_HOME {

    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {

                if ((row + col <= size + 1) && (row >= col - size + 1)) {
                    System.out.print("a ");
                } else {
                    System.out.print("  ");
                }
            }
            
            for (int col = 2; col <= size; ++col) {
                if (row <= col) {
                    System.out.print("f ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }  
        
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                
                if (row == col || row >= col) {
                    System.out.print("e ");
                } else {
                    System.out.print("  ");
                }
                
            }
            for (int col = 2; col <= size; ++col) {
                if (row + col >= size + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
        

    }
}
