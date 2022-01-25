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
public class TriangularPatternB {

    public static void main(String[] args) {

        int SIZE;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        SIZE = in.nextInt();
        
        for (int row = 1; row <= SIZE; ++row) {
            //System.out.println("Empieza línea " + row);
            for (int col = SIZE - row + 1; col >= 1; --col) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}