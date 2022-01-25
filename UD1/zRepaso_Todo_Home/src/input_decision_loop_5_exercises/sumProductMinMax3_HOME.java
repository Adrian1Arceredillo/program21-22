/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_decision_loop_5_exercises;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class sumProductMinMax3_HOME {

    public static void main(String[] args) {

        int num1, num2, num3;
        int batuketa, producto;
        int min_num = 0, max_num = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        num3 = in.nextInt();

        batuketa = num1 + num2 + num3;
        producto = num1 * num2 * num3;

        

        min_num = num1;
        if (min_num > num2) {
            min_num = num2;
        }
        if (min_num > num3) {
            min_num = num3;
        }

        max_num = num1;
        if (max_num < num2) {
            max_num = num2;
        }
        if (max_num < num3) {
            max_num = num3;
        }
        
        System.out.println("The sum is: " + batuketa);
        System.out.println("The product is: " + producto);
        
        System.out.println("The min is: " + min_num);
        System.out.println("The max is: " + max_num);
    }
}
