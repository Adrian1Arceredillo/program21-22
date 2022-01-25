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
public class contains_HOME {
    public static void main(String[] args) {
        
        int[] intArray;        //define un array cuyos elementos serán valores int
        final int num_items = 5;
        int mdigit;

        intArray = new int[num_items];

        Scanner in = new Scanner(System.in);
        

        if (intArray.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i <= intArray.length - 1; ++i) {
                intArray[i] = in.nextInt();
            }
        }
        
        System.out.println("Enter the key to search: ");
        mdigit = in.nextInt();

        if (contains(intArray, mdigit) == true) {
            System.out.println("The array contains the digit " + mdigit);
        } else {
            System.out.println("El array NO contiene el dígito " + mdigit);
        }
    }
    
    public static boolean contains(int[] intArray, int mdigit) {
        if (intArray.length > 0) {
            
            for (int i = 0; i <= intArray.length - 1; ++i) {

                while (intArray[i] > 0) {
                    int ult = intArray[i] % 10;

                    if (ult == mdigit) {
                        //number = number / 10;  // esta línea no es 100% necesaria
                        return true;
                    }

                    intArray[i] = intArray[i] / 10;
                }
            }
        }
        return false;
    }
   
}
