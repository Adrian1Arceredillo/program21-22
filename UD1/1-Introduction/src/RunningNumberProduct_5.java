/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class RunningNumberProduct_5 {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
       
       final int hasiera = 1;
       final int bukaera = 10;
       
       
       int product = 1;
       int number = hasiera;
       
       while (number <=10) {
           
           product = product * number;
           ++number;
           
       }
      
       System.out.println("La multiplicación de todos los números del  " + hasiera + " al " + bukaera + " es: " + product);
       
   }
}



//RunningNumberProduct_5