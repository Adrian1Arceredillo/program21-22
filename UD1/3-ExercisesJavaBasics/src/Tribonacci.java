/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Tribonacci {
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        int n4 = 0;
        int i;
        int nMax = 19;
        double sum = n1 + n2 + n3;
        
        double average;
        
        System.out.print(n2 + " " + n3);
        
        i = 2;
        
        while (i <= nMax) {
            ++i;
            n4 = n1 + n2 + n3;
            sum = sum + n4;
            
            System.out.print(" " + n4);
            
            n1 = n2;
            n2 = n3;
            n3 = n4;
            
        }
        System.out.println(" ");
        average = sum / nMax;
        
        System.out.println("The sum of the first 20 numbers is " + sum);
        System.out.println("The result of the average is " + average);
        
    }
}
