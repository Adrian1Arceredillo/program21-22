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
public class TriangularPatternC {

    public static void main(String[] args) {

        int SIZE;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        SIZE = in.nextInt();

        for (int row = 1; row <= SIZE; ++row) {
            for (int col = 1; col <= SIZE; ++col) {
                if (row <= col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
