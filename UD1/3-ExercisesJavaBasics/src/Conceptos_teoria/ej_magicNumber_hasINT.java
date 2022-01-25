/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos_teoria;
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class ej_magicNumber_hasINT {
    public static void main(String[] args) {
        
        int zenbakia;
        int key;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        zenbakia = in.nextInt();
        System.out.println("Enter the key to search: ");
        key = in.nextInt();
        
        if (isMagic(zenbakia, key) == true) {
            System.out.println("The entered integer \"" + zenbakia + "\" contains the digit \"" + key + "\".");
        } else {
            System.out.println("The entered integer HAS NOT the digit \"" + key + "\".");
        }
        
        
    }
    
    public static boolean isMagic(int zenbakia, int key) {
        boolean isValid = false;
        //final int key = 8;
        
        while (zenbakia > 0) {
            int digit = zenbakia % 10;
            if (digit == key) {
                return true;
            }
            zenbakia = zenbakia / 10;
        }
        return false;
        
    }
}
