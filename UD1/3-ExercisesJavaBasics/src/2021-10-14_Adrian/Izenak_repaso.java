
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class Izenak_repaso {

    public static void main(String[] args) {

        String[] names = {"Jon", "Jone", "June", "Julian", "Julen"};
        int pos = 0;    //determina la posicion de los elementos en el array
        String bilatutakostr;   //el nombre que vamos a buscar en el array
        int bilatutakostrLen;
        boolean isValid;
        isValid = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Noren bila zabiltza? ");
        bilatutakostr = in.nextLine();
        bilatutakostrLen = bilatutakostr.length();

        //bilatutakostr = bilatutakostr.toLowerCase();
        for (int i = 0; i <= names.length - 1; ++i) {
            if (bilatutakostr.equals(names[i])) {

                pos = i;
                //System.out.println(bilatutakostr + " zerrendako " + ((i + 1) + ". da. "));
                isValid = true;
            }

        }

        if (isValid == true) {
            System.out.println(names[pos] + " zerrendako " + (pos + 1) + ". da. ");
        } else {
            System.out.println(bilatutakostr + " ez dago zerrendan. ");
        }

    }
}
