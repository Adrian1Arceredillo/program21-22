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
        
            int n = 15423;
            int number = n;
            //int i = 0;
            int digit;
            
            
            while (number > 0) {
                //digit = n / 10;
                digit = number % 10;
                System.out.print(" " + digit);
                
                number = number / 10;
                
            }

    }
}
