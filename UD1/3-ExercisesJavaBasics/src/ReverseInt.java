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
public class ReverseInt {
    public static void main(String[] args) {
        
        int zifra;
        int digit;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        zifra = in.nextInt();
        
        int number = zifra;
        
        while (number > 0) {
            digit = number % 10;
            System.out.print(digit);
            
            number = number / 10;
            
        }
    }
    
}
