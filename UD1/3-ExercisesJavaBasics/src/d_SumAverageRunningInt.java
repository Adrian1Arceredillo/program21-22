/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class d_SumAverageRunningInt {
    public static void main(String[] args) {
        
        final int hasiera, bukaera;
        hasiera = 1;
        bukaera = 100;
        
        int sumodd = 0;     //suma de números impares
        int sumeven = 0;    //suma de números pares
        int difference = 0; //diferencia entre las dos sumas
        
        int number = hasiera;
        
        while (number <= bukaera) {
            if (number % 2 == 0) {
                sumeven = sumeven + number;    
            } else {
                sumodd = sumodd + number;  
            }
            ++number;
        }
        System.out.println("The sum of odd numbers is " + sumodd);
        System.out.println("The sum of even numbers is " + sumeven);
        
        if (sumodd > sumeven) {
            difference = sumodd - sumeven;
        } else {
            difference = sumeven - sumodd;
        }
        System.out.println("La diferencia entre las dos sumas es " + difference);
    }
}
