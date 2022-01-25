
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
public class FaktorizarInternet {

    public static void main(String[] args) {

        int zenbaki;        //número introducido por el usuario
        int i = 2;          //los números que se utilizarán para buscar los factores del número introducido. Se irá incrementando en uno, a medida que sea necesario.
        int j = 0;          //posición del array en la que se mostrarán los factores encontrados de dicho número.
        int[] factores = new int[50];

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat:");
        zenbaki = in.nextInt();

        while (zenbaki <= 0) {
            System.out.println("Mesedez, zenbaki POSITIBO bat sartu:");
            zenbaki = in.nextInt();
        }

        while (zenbaki > 1) {
            if (zenbaki % i == 0) {
                zenbaki = zenbaki / i;
                factores[j] = i;
                j++;
                i = 2;
            } else {
                i++;
            }
        }
        //imprimir los factores
        for (i = 0; i < j; i++) {
            System.out.printf("\nfactor %d = %d", i + 1, factores[i]);
        }

        

    }
}
