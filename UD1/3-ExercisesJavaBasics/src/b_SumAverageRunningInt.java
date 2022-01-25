/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class b_SumAverageRunningInt {

    public static void main(String[] args) {
        
        final int hasiera, bukaera;
        hasiera = 111;
        bukaera = 8899;
        
        double average; //average variable
        
        
        double sum = 0;
        int count = 0; //contar cuántos números hay entre x rango.
        
        int number = hasiera;
                
        while (number <= bukaera) {
            
            sum = sum + number;
            count = count + 1;
            ++number;
        }
        average = sum / count;
         
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
        
        
    }
}
