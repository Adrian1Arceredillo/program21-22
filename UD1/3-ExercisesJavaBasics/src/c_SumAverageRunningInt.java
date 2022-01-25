/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class c_SumAverageRunningInt {
    public static void main(String[] args) {
        
        final int hasiera, bukaera;
        hasiera = 1;
        bukaera = 100;
        
        int sum = 0;
        int number = hasiera;
        
        while (number <= bukaera) {
            sum = sum + (number * number);
            ++number;
            
        }
        System.out.println("La suma de todos los cuadrados es " + sum);
    }
}
