/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class RunningNumberMod7Sum_3 {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
       
       final int hasiera = 1;
       final int bukaera = 1000;
       
       int sum = 0;
       
       int number = hasiera + 6;
       
       while (number <= bukaera) {
           sum = sum + number;
           number = number + 7;
       }
       
       System.out.println("La suma de números divisibles entre 7 desde " + hasiera + " hasta " + bukaera + " es: " + sum);
       
   }
}