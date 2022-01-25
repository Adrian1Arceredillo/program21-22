/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Getting_Started_Exercises;

/**
 *
 * @author AdriAlex
 */
public class CheckOddEven {
    public static void main(String[] args) {
        
        int number = 42;
        
        if (number %2 == 0) {
            System.out.println("The number is an EVEN one.");
        } else if (number %2 != 0) {
            System.out.println("The number is an ODD one.");
        }
        System.out.println();
    }
}
