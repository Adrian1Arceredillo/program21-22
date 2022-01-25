package exekutagarriak;

import java.util.Arrays;
import model.Liburua;
import java.util.Scanner;

public class ProgramaNagusia {

    private static Liburua[] liburuak;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuSorta();
        System.out.println(Arrays.toString(liburuak));

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }
    
    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        System.out.println("");
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("==================");

        for (int i = 0; i < liburuak.length; ++i) {
            if (liburuak[i] != null) {
                System.out.printf("%s (%s) \n", liburuak[i].getIzenburua(), liburuak[i].getEgilea());
                //System.out.println(liburuak[i].getIzenburua() + "(" + liburuak[i].getEgilea() + ")");
            }
        }
    }

    public static void liburuenDatuGuztiakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        // ...
        int cantidad = 0;
        int orrienBatura = 0;
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");

        }

        System.out.println("");
        for (int i = 0; (i < liburuak.length); ++i) {
            if (liburuak[i] != null) {
                System.out.printf("%-3d %-30s %-20s %4d %4d %-11s %1c %-6.2f %-15s\n", i + 1,
                        liburuak[i].getIzenburua(),
                        liburuak[i].getEgilea(),
                        liburuak[i].getOrriKopurua(),
                        liburuak[i].getUrtea(),
                        liburuak[i].getGaia(),
                        liburuak[i].getHizkuntza(),
                        liburuak[i].getPrezioa(),
                        liburuak[i].getKodea());
                orrienBatura = orrienBatura + liburuak[i].getOrriKopurua();
                ++cantidad;
            }
        }
        double batazBestekoOrriak;
        batazBestekoOrriak = (double) orrienBatura / cantidad;
        System.out.println("---------------------------------------------------------------");
        System.out.printf("            Liburuen batez besteko orri kopurua: %.2f", batazBestekoOrriak);
        //...
    }

    public static void liburuenPrezioaIrudikatu() {
        //METODO HAU OSATU BEHAR DUZU
        for (int i = 0; i < liburuak.length; ++i) {
            if (liburuak[i] != null) {
                //ez dakit marginaren balioa, beraz, %25s -koa jarri dut.
                System.out.printf("%25s : %s\n", liburuak[i].getIzenburua(), liburuak[i].getPrezioaIzartxotan());
            }
        }
    }

    public static void zaharrenaBilatu() {
        //METODO HAU OSATU BEHAR DUZU
        int masViejo = 0;
        int posLibroMasViejo = -1;

        for (int i = 0; i < liburuak.length; ++i) {
            if (liburuak[i] != null) {
                if (i == 0) {
                    masViejo = liburuak[i].getUrtea();
                }
                if (liburuak[i].getUrtea() < masViejo) {
                    masViejo = liburuak[i].getUrtea();
                    posLibroMasViejo = i;
                }
            }
        }
        if (posLibroMasViejo == -1) {
            System.out.println("El array está vacío. ");
        } else {
            System.out.println("Libururik zaharrena, " + liburuak[posLibroMasViejo].getUrtea() + " urtean argitaratu zen: " + liburuak[posLibroMasViejo].getIzenburua() + " (" + liburuak[posLibroMasViejo].getEgilea() + ")");
        }
    }

}
