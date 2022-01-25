/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class proba_12_todos {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
       
       final int hasiera, bukaera;
       hasiera = 999;
       bukaera = 2010;
       
       int count = 0;
       
       int number = hasiera;
       
       while (number <= bukaera) {
           if ((number %4 == 0) && (number %100 != 0) || (number %400 == 0)) {
               
               count = count + 1;
                ++number;
           } else {
               ++number;
           }
       }
       
       System.out.println("El número de años bisiestos que hay entre esas dos fechas es de: " + count);
   }
}


//RunningNumberSquareSum