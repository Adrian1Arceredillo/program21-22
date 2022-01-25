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
public class ZenbakiaSailkatu_HOME {

    public static void main(String[] args) {

        int zenbakia;
        int zen_handia;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbaki oso positibo bat: ");
        zenbakia = in.nextInt();

        

        while (zenbakia <= 0) {
            System.out.println("Zenbakia ezegokia. ");
            System.out.println("Sartu zenbaki oso positibo bat: ");
            zenbakia = in.nextInt();
        }
        
        System.out.println("Sartu handia edo txikia den jakiteko limitea: ");
        zen_handia = in.nextInt();

        if (zenbakia > zen_handia) {
            if (zenbakia % 2 == 0) {
                System.out.println("Sartu duzun zenbaki handia BIKOITIA da. ");
            } else {
                System.out.println("Sartu duzun zenbaki handia BAKOITIA da. ");
            }
        } else {
            if (zenbakia % 2 == 0) {
                System.out.println("Sartu duzun zenbaki txikia BIKOITIA da. ");
            } else {
                System.out.println("Sartu duzun zenbaki txikia BAKOITIA da. ");
            }
        }

    }
}
