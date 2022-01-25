/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Fibonacci {
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i;
        int nMax = 20;
        int sum = n1 + n2;
        
        double average;
        
        System.out.print(" " + n2);
        
        i = 2;
        
        while (i <= nMax) {
            ++i;
            n3 = n1 + n2;
            sum = sum + n3;
            
            System.out.print(" " + n3);
            
            n1 = n2;
            n2 = n3;
            
        }
        
        average = sum / (double)nMax;
        System.out.println(" ");
        System.out.println("The result of the average is " + average);
        
    }
}
