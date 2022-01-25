/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimos_repasos;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class IzenakInput_HOME {

    public static void main(String[] args) {

        String[] names;
        int num_items;
        int pos = 0;
        String bilatutakostr = "";  //nombre (string) que buscaremos por el array
        int bilatutakostrLen = bilatutakostr.length();
        boolean isValid;    //variable que determinará si el nombre ESTÁ o NO ESTÁ
        isValid = false;

        Scanner in = new Scanner(System.in);
        //Scanner s = new Scanner(System.in);
        System.out.println("Enter the num of elements: ");  //determinar el número de elementos que tendrá nuestro array
        num_items = in.nextInt();

        names = new String[num_items];  //asignar el array (allocate the array)

        for (int i = 0; i <= names.length - 1; ++i) {   //introducir un valor para cada elemento del array
            Scanner in2 = new Scanner(System.in);
            System.out.print("Enter the name " + (i + 1) + ": ");
            names[i] = in2.nextLine();
        }

        Scanner in3 = new Scanner(System.in);
        System.out.println("Noren bila zabiltza? ");
        bilatutakostr = in3.nextLine();  //introducir el nombre que queremos buscar en el array

        for (int idx = 0; idx <= names.length - 1; ++idx) {
            if (bilatutakostr.equals(names[idx])) {
                pos = idx;
                isValid = true;
                //System.out.println("si");
            }
        }

        if (isValid == true) {
            System.out.println(names[pos] + "zerrendako " + (pos + 1) + ".a da. "); //imprimir el elemento del array en el valor que coincide (pos)
        } else {
            System.out.println(bilatutakostr + " ez dago zerrendan. ");
        }
    }
}
/*
Usar diferentes scanner: in, in2, in3...
*/
/*
import java.util.Scanner;
public class NameSorting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] array = new String[20];

        System.out.println("Please enter 20 names to sort");              
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < 0;){

            array[i] = s1.nextLine();


        }


        //Just to test
        System.out.println(array[0]);

    }

}
*/
