package Methods;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Exponent {

    public static void main(String[] args) {

        int exp;    //exponente. Integer non-negative
        int base;   //base (integer)

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        base = in.nextInt();
        System.out.println("Enter the exponent number: ");
        exp = in.nextInt();

        in.close();

        System.out.println(base + " elevado a " + exp + " es: " + exponent(base, exp));

    }

    public static int exponent(int base, int exp) {

        int product = 1;
        for (; exp != 0; --exp) {
            product = product * base;
        }
        return product;
    }
}
