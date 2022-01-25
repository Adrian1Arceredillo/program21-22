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
public class NumberPatternA {
    
    public static void main(String[] args) {
        
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        
        for (int row = 1; row <= size; ++row) {
            for (int col = 1, numero = 1; col <= size; ++col, ++numero) {
                
                if (row >= col) {
                    System.out.print(numero + " ");
                } else {
                    System.out.print("  ");
                }
                        
                //System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

/*
Enunciado: 

*/
