/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class RunningNumberSum_1 {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
       
       final int hasiera = 9;
       final int bukaera = 899;
       
       int sum =  0;
       
       int number = hasiera;
       
       while (number <= bukaera) {
           sum = sum + number;
           ++number;
       }
       
       System.out.println("La suma de números desde " + hasiera + " hasta " + bukaera + " es: " + sum);
   }
}
