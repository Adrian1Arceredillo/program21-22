/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos_teoria;

/**
 *
 * @author arceredillo.adrian
 */
public class ej_NumMax {

    public static void main(String[] args) {

        int num_maximo = max(5, 8);
        System.out.println("El máximo es " + num_maximo);
        
    }

    public static int max(int num1, int num2) {
        //num1 = 54;
        //num2 = 68;
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
