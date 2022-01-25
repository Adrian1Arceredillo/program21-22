package Strings;
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
public class DecipherCaesarCode2 {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        int salto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un string: ");
        mistr = sc.next();
        mistrLen = mistr.length();
        System.out.println("Cuánto quieres saltar? ");
        salto = sc.nextInt();

        char alfabeto;
        String resultado = "";

        mistr = mistr.toUpperCase();

        for (int idx = 0; idx <= mistrLen - 1; ++idx) {

            alfabeto = mistr.charAt(idx);

            if (alfabeto >= 'A' && alfabeto <= 'Z') {

                alfabeto = (char) (alfabeto - salto);
                if (alfabeto < 'A') {
                    alfabeto = (char) (alfabeto + 'z' - 'a' + 1);
                }

                resultado = resultado + alfabeto;
            }
        }
        System.out.println(resultado);
    }

}
