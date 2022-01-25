package Figuras_pyramids;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class TriangularPatternE {

    public static void main(String[] args) {

        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                if (row == col) {
                    System.out.print("D ");
                } else {
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
               
    }
}