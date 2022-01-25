/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class exponent_HOME {

    public static void main(String[] args) {

        int base;
        int exp;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        base = in.nextInt();
        System.out.println("Enter the exponent number: ");
        exp = in.nextInt();
        
        in.close();
        
        System.out.println(base + "raised to the power of " + exp + " is: " + exponent(base, exp));

    }

    public static int exponent(int base, int exp) {

        int product = 1;

        for (; exp != 0; --exp) {

            product = product * base;
        }
        return product;

    }
}
