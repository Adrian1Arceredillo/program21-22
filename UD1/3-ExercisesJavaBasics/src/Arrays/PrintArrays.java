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
public class PrintArrays {

    public static void main(String[] args) {

        //declarar variables
        //declarar nombre del array, para ser asignado después de conocer el numero de elementeos que tendrá. (num_items)
        final int num_items;
        int[] items;

        //solicitar un numero int no-negativo para especificar el número de elementos
        //leer el input como "int"
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        num_items = in.nextInt();

        //asignar el array
        items = new int[num_items];

        //solicitar y leer los elementos en el "int" array, solo si la longitud del array es > 0
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i <= items.length - 1; ++i) {
                items[i] = in.nextInt();
            }
        }

        in.close();

        //imprimir el contenido del array, el primer elemento se manejará diferente a los siguientes
        System.out.print("The values are: [");
        for (int idx = 0; idx <= items.length - 1; ++idx) {
            if (idx == 0) {
                //imprimir el primer elemento sin poner comas iniciales
                System.out.print(items[0]);
            } else {
                //imprimir los siguientes elementos con una coma por delante
                System.out.print(", " + items[idx]);
            }
        }
        System.out.println("]");
    }
}

/*
if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i <= items.length - 1; ++i) {
                items[i] = in.nextInt();
            }
        }
*/
