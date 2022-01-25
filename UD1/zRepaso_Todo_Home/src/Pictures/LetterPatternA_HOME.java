/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pictures;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class LetterPatternA_HOME {

    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                char letra = 'a';
                if (row >= col) {
                    
                    System.out.print(letra + " ");
                    ++letra;
                }

            }
            System.out.println("");
        }

    }
}
