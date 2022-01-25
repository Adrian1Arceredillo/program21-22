/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_decision_loop_5_exercises;

/**
 *
 * @author AdriAlex
 */
public class product1ToN_factorial_HOME {
    public static void main(String[] args) {
        
        int product = 1;
        int hasiera = 1;
        int bukaera = 10;
        
        int number = hasiera;
        
        while (number <= 10) {
            product = product * (number);
            ++number;
        }
        
        System.out.println(product);
    }
}
