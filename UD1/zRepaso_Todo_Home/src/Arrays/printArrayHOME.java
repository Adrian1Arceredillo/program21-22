/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class printArrayHOME {

    public static void main(String[] args) {

        int[] items;
        final int num_items;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter num. of elements: ");
        num_items = in.nextInt();

        items = new int[num_items];

        if (items.length > 0) {
            System.out.println("Enter the values of the items (separated by spaces): ");
            for (int i = 0; i <= items.length - 1; ++i) {
                items[i] = in.nextInt();
            }
        }
        in.close();
        
        
        System.out.print("The values are: [");
        for (int idx = 0; idx <= items.length - 1; ++idx) {
            
            if (idx == 0) {
                System.out.print(items[0]);
            } else {
                System.out.print(", " + items[idx]);
            }
        }
        System.out.println("]");
    }
}
