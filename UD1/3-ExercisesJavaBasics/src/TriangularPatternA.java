
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
public class TriangularPatternA {

    public static void main(String[] args) {

        int SIZE;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        SIZE = in.nextInt();

        //outer loop for rows  
        for (int row = 1; row <= SIZE; ++row) {
            //inner loop for columns  
            for (int col = 1; col <= row; ++col) {
                //prints stars   
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line  
            System.out.println();
        }
    }
}
