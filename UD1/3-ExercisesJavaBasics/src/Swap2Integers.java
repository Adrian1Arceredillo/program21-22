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
public class Swap2Integers {
    public static void main(String[] args) {
        
        int tempx, tempy;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first integer: "); //determina por teclado el valor del primer número
        tempx = in.nextInt();
        System.out.print("Enter the second integer: "); //determina por teclado el valor del segundo número
        tempy = in.nextInt();
        
        int endx = tempy;
        int endy = tempx;
        
        System.out.println("After the swap, first integer is: " + endx + ", and second integer is: " + endy);
        
    }
    
}
