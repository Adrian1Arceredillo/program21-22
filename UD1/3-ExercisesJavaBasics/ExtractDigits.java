/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
    public class ExtractDigits {
        public static void main(String[] args) {
        
            int numero = 12;
            int digit;


            while (numero > 0) {
            digit = numero % 10;
            System.out.println(digit);
            }
    }
}
     
