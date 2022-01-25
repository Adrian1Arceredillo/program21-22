package Arrays;
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
public class printArrayInStars {

public static void main(String[] args) {

        final int num_items;
        int[] items;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el número de elementos: ");
        num_items = in.nextInt();

        items = new int[num_items];

        if (items.length > 0) {
            System.out.println("Introduce el valor de cada elemento: ");
            for (int i = 0; i <= items.length - 1; ++i) {
                items[i] = in.nextInt();
            }
        }

        System.out.println("Los valores son: ");
        for (int idx = 0; idx <= items.length - 1; ++idx) {

            System.out.print(idx + ": ");
            for (int cant_stars = 1; cant_stars <= items[idx]; ++cant_stars) {
                System.out.print("*");

            }
            System.out.println("(" + items[idx] + ")");
        }
        System.out.println();
    }
}
