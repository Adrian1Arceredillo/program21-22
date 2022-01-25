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
public class ContainsInt_HOME2 {
    public static void main(String[] args) {
        
        int [] intArray;
        int num_items;
        //boolean isValid;
        //isValid = false;
        int key;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        num_items = in.nextInt();
        
        intArray = new int [num_items];
        
        for (int i = 0; i <= num_items - 1; ++i) {
            System.out.print("Enter the value of item " + (i + 1) + ": ");
            intArray[i] = in.nextInt();
        }
        
        System.out.print("Key int is: ");
        key = in.nextInt();
        
        if (contains(intArray, key) == true)  {
            System.out.println("The array contains the digit " + key);
        } else {
            System.out.println("The array doesnt contain the digit " + key);
        }
        
    }
    
    public static boolean contains(int [] arrayNumeros, int digit) {
        
        if (arrayNumeros.length > 0) {
            
            for (int i = 0; i <= arrayNumeros.length - 1; ++i) {
                
                while (arrayNumeros[i] > 0) {
                    int ult = arrayNumeros[i] % 10;
                        if (ult == digit) {
                            return true;
                        }
                    arrayNumeros[i] = arrayNumeros[i] /10;
                }
                
            }
        }
        return false;
        
    }
}
