/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Product1ToN_longnum {
    public static void main(String[] args) {
        
        //final int hasiera, bukaera;
        final int hasiera = 1;          //primer valor del rango
        final int bukaera = 14;         //último valor del rango
        //int numero = 0;
                
        int intproduct = 1;
        long longproduct = Long.valueOf(intproduct);  //coge el valor de intproduct y permite que el dato sea más largo.
        int number = hasiera;
        
        while (number <= bukaera ) {
            longproduct = longproduct * number;
            ++number;
        }
        
        System.out.println(longproduct);
        
    }
}
