
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
public class TimeTable {

    public static void main(String[] args) {
        // Declare variables
        final int SIZE;   // size of table to be input

        // Prompt for size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        SIZE = in.nextInt();
        in.close();

        // Print header row
        System.out.print(" * |");
        for (int col = 1; col <= SIZE; ++col) {
            System.out.printf("%4d", col); //el %4d define un formato al output de print. En este caso, el output del print tendrá 4 carácteres máximo
        }
        System.out.println();

        // Print separator row
        System.out.print("----");
        for (int col = 1; col <= SIZE; ++col) {
            System.out.printf("%4s", "----");
        }
        System.out.println();

        // Print body using nested-loops
        for (int row = 1; row <= SIZE; ++row) {
            System.out.printf("%2d |", row);
            for (int col = 1; col <= SIZE; ++col) {
                System.out.printf("%4d", row*col);
            }

            System.out.println();
        }

    }
}
