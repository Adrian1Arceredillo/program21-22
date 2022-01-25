/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class hasEight_HOME {
    public static void main(String[] args) {
        
        int number;
        int key;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        number = in.nextInt();
        System.out.println("Enter a number to search: ");
        key = in.nextInt();
        
        
        if (hasEight(number, key) == true) {
            System.out.println("The entered int contains " + key);
        } else {
            System.out.println("The entered int doesnt contains " + key);
        }
        
    }
    
    public static boolean hasEight(int number, int key) {
        
        
        int digit;
        
        while (number > 0) {
            digit = number % 10;
            
            if (digit == key) {
                return true;
            }
            
            number = number / 10;
        }
        return false;
    }
}
