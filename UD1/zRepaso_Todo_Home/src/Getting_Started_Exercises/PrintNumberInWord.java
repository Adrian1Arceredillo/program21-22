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
public class PrintNumberInWord {
    public static void main(String[] args) {
        
        int number = 5;
        
        switch(number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            default:
                System.out.println("Try again...");
                System.out.println("No se ha encontrado el número indicado.");
                break;
        }
    }
}

/* Utilizando la sentencia IF-ELSE
if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        }
        System.out.println();
*/