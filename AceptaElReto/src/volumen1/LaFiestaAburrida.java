/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class LaFiestaAburrida {

    public static void main(String[] args) {

        int numPersonas;
        String[] nombres;
        //String nombres = "";
        String subString;

        Scanner in = new Scanner(System.in);
        //System.out.print("Cuantas personas? ");
        numPersonas = in.nextInt();

        nombres = new String[numPersonas];

        //Leer entrada y meterlos en el array
        for (int i = 0; i <= numPersonas - 1; ++i) {
            //System.out.print("Soy ");
            
            
            //System.out.println("sub");
            subString = in.next();
            nombres[i] = in.nextLine();
            int index = nombres[i].indexOf(subString);
            
            //System.out.print(index);
            
        }
        //System.out.println(Arrays.toString(nombres));
        

        for (int i = 0; i <= nombres.length - 1; ++i) {
            System.out.println("Hola," + nombres[i] + ".");
        }
    }
}

//nombres[i].substring(4);
//"Adrian".substring(2) --> "rian"
//"Adrian".indexOf('r') --> 2
