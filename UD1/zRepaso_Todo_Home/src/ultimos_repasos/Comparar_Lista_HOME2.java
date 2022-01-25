/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimos_repasos;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class Comparar_Lista_HOME2 {

    public static void main(String[] args) {

        String[] names = {"Jon", "Jone", "June", "Julian", "Julen"};
        boolean isValid;
        isValid = false;
        int pos = 0;

        String bilatutakostr = "";
        int bilatutakostrLen = bilatutakostr.length();

        Scanner in = new Scanner(System.in);
        System.out.print("Noren bila zabiltza? ");
        bilatutakostr = in.nextLine();

        
        System.out.println(names[inList(names, bilatutakostr)] + " zerrendako " + (inList(names, bilatutakostr) + 1) + ".a da. ");
        System.out.println(bilatutakostr + " ez dago zerrendan. ");
        

    }

    public static int inList(String[] lista, String wantedName) {

        int posicion = 0;

        for (int idx = 0; idx <= lista.length - 1; ++idx) {

            if (lista[idx].equals(wantedName)) {
                posicion = idx;
            }

        }
        return posicion;
    }
    
    public static int noInList(String[] lista, String wantedName) {

        int posicion = 0;

        for (int idx = 0; idx <= lista.length - 1; ++idx) {

            if (lista[idx].equals(wantedName)) {
                posicion = idx;
            }

        }
        return posicion;
    }
}
