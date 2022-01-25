
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class SumProductMinMax3 {
    public static void main(String[] args) {
        
        int number1, number2, number3, sum, product, min, max;
        
        //number1 = 2;
        //number2 = 3;
        //number3 = 4;        
        
        System.out.print("Primer número íntegro: ");
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        number1 = in.nextInt(); //define valor del primer numero
        
        System.out.print("Segundo número íntegro: ");
        number2 = in.nextInt(); //define valor del segundo numero
        
        System.out.print("Segundo número íntegro: ");
        number3 = in.nextInt(); //define valor del tercer numero
        
        in.close();
        
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        
        System.out.println("La suma es: " + sum);
        System.out.println("El producto es: " + product);
        
        //conocer cuál es el número más pequeño
        min = number1;
        if (min > number2) {
            min = number2;
        }
        
        if (min > number3){
            min = number3;
        }
        //conocer cuál es el número más grande
        max = number1;
        if (max < number2) {
            max = number2;
        }
        
        if (max < number3){
            max = number3;
        }
        
        System.out.println("EL número más pequeño es: " + min);
        System.out.println("EL número más grande es: " + max);
        
    }
}
