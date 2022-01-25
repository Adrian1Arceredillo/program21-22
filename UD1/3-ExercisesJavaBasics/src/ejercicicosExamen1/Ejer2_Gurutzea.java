/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExamen1;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class Ejer2_Gurutzea {

    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Zein neurritako gurutzea marraztu nahi duzu (zenbaki bakoitia sartu)?");
        size = in.nextInt();

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {

                if ((row == (size + 1)/2) || (col == (size + 1)/2)) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }
}
