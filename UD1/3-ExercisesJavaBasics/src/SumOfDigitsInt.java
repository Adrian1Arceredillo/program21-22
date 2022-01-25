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
public class SumOfDigitsInt {
    public static void main(String[] args) {
        
        int zifra;
        int digit;
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        zifra = in.nextInt();
        
        int number = zifra;
        while (number > 0){
            digit = number % 10;
            System.out.print(digit);
            
            sum = sum + digit;
            
            number = number / 10;
            
        }
        System.out.println(" ");
        System.out.println("La suma de todos los dígitos es: " + sum);
        
    }
    
}
