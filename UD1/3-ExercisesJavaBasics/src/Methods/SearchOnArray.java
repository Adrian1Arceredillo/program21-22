package Methods;
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
public class SearchOnArray {

    public static void main(String[] args) {

        int[] intArray;
        final int num_items = 5;
        int mdigit;

        intArray = new int[num_items];

        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i <= intArray.length - 1; ++i) {
            System.out.print("Enter the value of the item " + (i + 1) + ": ");
            intArray[i] = in.nextInt();
        }
        System.out.println("Enter the key to search through the array: ");
        mdigit = in.nextInt();

        System.out.println("El número está en la posición " + search(intArray, mdigit));

    }

    public static int search(int[] intArray, int mdigit) {

        int posicion = -1;

        for (int i = 0; i <= intArray.length - 1; ++i) {

            while (intArray[i] > 0) {
                int ult = intArray[i] % 10;
                
                if (ult == mdigit) {
                    posicion = i + 1;
                }
                intArray[i] = intArray[i] / 10;
            } 
        }

        return posicion;
    }
}

/*
else if (intArray[i] != mdigit) {
                int no_posicion = -1;
                return no_posicion;
            }
*/