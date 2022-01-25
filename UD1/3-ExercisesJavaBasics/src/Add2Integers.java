/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        
        int number1, number2, sum;
        
        
        System.out.print("Primer número íntegro: ");
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        number1 = in.nextInt();
        
        
        System.out.print("Segundo número íntegro: ");
        number2 = in.nextInt();
        
        in.close();
        
        sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
}
