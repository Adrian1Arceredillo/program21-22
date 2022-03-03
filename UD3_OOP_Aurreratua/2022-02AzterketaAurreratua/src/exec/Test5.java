/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import model.*;

/**
 *
 * @author AdriAlex
 */
public class Test5 {
    
    private static ArrayList<Kutxa> kutxenSorta = new ArrayList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        /*Kutxa k0 = new Kutxa(new Puntua(2,7),new Puntua(5,12),5);
        kutxenSorta.add(k0);*/
        
        //imprimatu();
        
        System.out.println("Sartu 5 kutxen datuak: ");
        
        for (int i = 0; i < 5; ++i) {
            System.out.println("Kutxa " + (i + 1) + ": ");
            System.out.print("\tErpin bat-en X balioa: ");
            int xErpin1 = in.nextInt();
            System.out.print("\tErpin bat-en Y balioa: ");
            int yErpin1 = in.nextInt();
            System.out.println("");
            System.out.print("\tKontrako erpin-aren X balioa: ");
            int xKontrako1 = in.nextInt();
            System.out.print("\tKontrako erpin-aren Y balioa: ");
            int yKontrako1 = in.nextInt();
            System.out.println("");
            System.out.print("\tSaru kuxaren altuera: ");
            int altuera1 = in.nextInt();

            Kutxa k0 = new Kutxa(new Puntua(xErpin1, yErpin1), new Puntua(xKontrako1, yKontrako1), altuera1);
            kutxenSorta.add(k0);

        }

        //System.out.println(kutxenSorta.toString());
        System.out.println("----------------");
        System.out.println("Ver todos los datos: ");
        imprimatu();
    }
    
    public static void imprimatu() {
        System.out.println("");
        System.out.printf("%-10s %-40s %-20s %-20s %-4s\n","Kutxa", "Kutxaren puntuak", "Erpinen Luzera", "Bolumena", "Altuera");
        System.out.println("------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < kutxenSorta.size(); ++i) {
            System.out.printf("%-10s %-40s %-20s %-20d %-4d \n", i + 1,
                    kutxenSorta.get(i).toString(),
                    Arrays.toString(kutxenSorta.get(i).getErtzenLuzera()),
                    kutxenSorta.get(i).getBolumena(),
                    kutxenSorta.get(i).getAltuera());
        }
    }
}
