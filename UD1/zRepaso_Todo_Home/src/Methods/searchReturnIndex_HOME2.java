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
public class searchReturnIndex_HOME2 {
    public static void main(String[] args) {
        
        int [] intArray = {1, 92, 3, 4, 5};
        int num_items = intArray.length;
        int key;    //el numero que se va a buscar por el array
        
        Scanner in = new Scanner(System.in);
        System.out.print("Number to search: ");
        key = in.nextInt();
        
        System.out.println("El número está en la posición: " + search(intArray, key));
        
    }
    
    public static int search(int [] arrayNumeros, int digit) {
        
        int posicion = -1;
        
        for (int idx = 0; idx <= arrayNumeros.length - 1; ++idx) {
            
            while (arrayNumeros[idx] > 0) {
                int ult = arrayNumeros[idx] % 10;
                
                if (ult == digit) {
                    posicion = idx + 1;
                }
                arrayNumeros[idx] = arrayNumeros[idx] / 10;
            }
            
        }
        return posicion;
        
    }
}
