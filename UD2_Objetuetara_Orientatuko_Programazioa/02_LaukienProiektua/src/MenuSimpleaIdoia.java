/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class MenuSimpleaIdoia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aukera = 0;

        System.out.println();
        System.out.println("MENUA");
        System.out.println("====================================");
        System.out.println("1.- Lehen aukera");
        System.out.println("2.- Bigarren aukera");
        System.out.println("3.- Hirugarren aukera");
        System.out.println("4.- Laugarren aukera");
        System.out.println("5.- Irten");
        System.out.println("");

        do {
            
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            
            switch (aukera) {
                case 1:
                    System.out.println("Lehen aukera aukeratu duzu.");
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);
    }
}
