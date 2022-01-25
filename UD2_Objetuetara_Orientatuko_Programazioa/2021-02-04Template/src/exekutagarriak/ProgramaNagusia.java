/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.db.DbZubi;
import java.util.Scanner;
import model.Book;

public class ProgramaNagusia {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String aukera;
        do {
            System.out.println("MENUA");
            System.out.println("=====");
            System.out.println("1- Liburua txertatu");
            System.out.println("2- Liburuak inprimatu");
            System.out.println("3- Liburuaren egilea zehaztu");
            System.out.println("4- Liburua ezabatu");
            System.out.println("0- Irten");
            System.out.println("");
            System.out.print("Aukeratu eragiketa bat:  ");

            aukera = in.nextLine();
            switch (aukera) {
                case "1":
                    sortu();
                    break;
                case "2":
                    irakurri();
                    break;
                case "3":
                    aldatu();
                case "4":
 //                   ezabatu(); //metodo hau osatu erabiltzaileari liburu izenburu bat eskatuz,
                                 //izenburu bera daukaten liburu bat baino gehiago balego, 
                                 //abisua eman eta ez da hura ezabatuko. Bakarra bada, egiaztapena eskatu ondoren, ezabatu.
                                 //Proiektuko logikari jarraituz, DbZubi klasean metodo berriren bat sortu beharko duzu.
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
                    break;
            }
        } while (!aukera.equals("0"));

        System.out.println("Eskerrik asko programa erabiltzeagatik. ");
    }

    /**
     * Erabiltzaileari datuak eskatu, liburu objektua sortu eta datu-basean
     * txertatu.
     *
     */
    public static void sortu() {
        System.out.print("Zein izenburu dauka gehitu nahi duzun liburuak? ");
        String izenburua=in.nextLine();
        Book liburuBerria = new Book(izenburua);
        DbZubi.liburuaGehitu(liburuBerria);

    }


    public static void irakurri() {

        DbZubi.liburuenTaulaInprimatu();
        
    }

    public static void aldatu() {
        int liburuId;
        int egileId;
        System.out.print("Zein libururen egilea sartu nahi duzu? (liburuaren id-a) ");
        liburuId = in.nextInt();
        System.out.print("Zein egilek idatzi zuen? (egilearen id-a ");
        egileId = in.nextInt();

        DbZubi.egileaZehaztu(liburuId, egileId);
    }
}
