/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class Menua {

    private static int LAUKI_KOP = 3;
    private static int sortutakoak = 0;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];

    public static void main(String[] args) {
        int chooseUser;
        //Laukia[] rectangulos = new Laukia[10];
        do {
            System.out.println("");
            System.out.println("#######################");
            System.out.println("1. Lauki berria sortu");
            System.out.println("2. Laukien taula ikusi");
            System.out.println("3. Lauki bat marraztu");
            System.out.println("4. Lauki handiena bilatu");
            System.out.println("5. Irten");
            System.out.println("6. Random Create");
            System.out.println("7. Ordenatu (txikienetik handienera)");
            System.out.println();

            //System.out.println(cuadrado);
            System.out.println(Arrays.toString(laukiak));
            System.out.println();
            
            Scanner in = new Scanner(System.in);

            //repetir bucle hasta que se introduzca el número 5
            System.out.print("Aukeratu zenbaki bat:");
            chooseUser = in.nextInt();

            switch (chooseUser) {
                case 1:
                    sortu();
                    break;
                case 2:
                    imprimatu();
                    break;
                case 3:
                    System.out.print("Zenbatgarren laukia nahi duzu marraztu? ");
                    int zenbatgarrenLaukia = in.nextInt();
                    System.out.print("Beteta ala hutsik (B/H)? ");
                    String betetaHutsik = in.next();
                    marraztu(zenbatgarrenLaukia - 1, betetaHutsik);
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                    break;
                case 6:
                    arrayaBete();
                    break;
                case 7:
                    orden();
                    break;

            }
        } while (chooseUser != 5);
        /*{

            if (chooseUser == 1) {
                sortu();
                //System.out.println(Arrays.toString(laukiak));
            }

            if (chooseUser == 2) {
                imprimatu();
            }

            if (chooseUser == 3) {
                System.out.print("Zenbatgarren laukia nahi duzu marraztu? ");
                int zenbatgarrenLaukia = in.nextInt();
                System.out.print("Beteta ala hutsik (B/H)? ");
                String betetaHutsik = in.next();
                marraztu(zenbatgarrenLaukia - 1, betetaHutsik);
            }

            if (chooseUser == 4) {
                handiena();
            }

            if (chooseUser == 6) {
                arrayaBete();
            }

            if (chooseUser == 7) {
                orden();
            }

            System.out.print("Aukeratu zenbaki bat:");
            chooseUser = in.nextInt();
        }*/

    }

    //System.out.println(laukiak[].toString6
    //System.out.println(Arrays.toString(laukiak));
    public static void sortu() {

        if (sortutakoak <= LAUKI_KOP - 1 && laukiak[sortutakoak] == null) {
            laukiak[sortutakoak] = new Laukia();

            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("LAUKI BERRIA SORTZEN...");
            System.out.print("\tSartu zabalera: "); //introducir la ANCHURA que queramos
            laukiak[sortutakoak].setZabalera(in.nextInt());
            System.out.print("\tSartu altuera: ");
            laukiak[sortutakoak].setAltuera(in.nextInt());
            ++sortutakoak;

            //System.out.println(sortutakoak);
        } else if (sortutakoak == LAUKI_KOP) {
            System.out.println("---> Ezin dituzu lauki gehiago sortu.");
        }

        //++sortutakoak;
        System.out.println(Arrays.toString(laukiak));
        System.out.println("");
    }

    public static void imprimatu() {
        
        System.out.println("");
        System.out.printf("%-8s %8s %8s %8s %8s %8s \n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("==================================================================");
        for (int i = 0; i < sortutakoak; ++i) {
            int numCuadrado = i;
            System.out.printf("\t%d \t%d \t%d \t%d \t%d \t%s \n", (numCuadrado + 1), laukiak[numCuadrado].getZabalera(), laukiak[numCuadrado].getAltuera(), laukiak[numCuadrado].getAzalera(), laukiak[numCuadrado].getPerimetroa(), laukiak[numCuadrado].getMota());
            System.out.println("");
        }

    }

    public static void marraztu(int zerLaukia, String beteHutsik) {
        //String marrazkia = in.next().toUpperCase();
        if ("B".equals(beteHutsik)) {
            laukiak[zerLaukia].marraztuBeteta();
        } else if ("H".equals(beteHutsik)) {
            laukiak[zerLaukia].marraztuHutsik();
        }

    }

    public static void handiena() {

        for (int i = 0; i < sortutakoak; ++i) {
            Laukia.getTheBiggest(laukiak);
            break;

            //return laukiHandiena;
        }
    }

    public static void arrayaBete() {

        for (int i = 0; i <= LAUKI_KOP - 1; ++i) {
            if (sortutakoak <= LAUKI_KOP - 1 && laukiak[sortutakoak] == null) {
                laukiak[sortutakoak] = new Laukia();

                Scanner in = new Scanner(System.in);
                System.out.println();
                System.out.println("LAUKI BERRIA SORTZEN...");
                System.out.print("\tSartu zabalera: "); //introducir la ANCHURA que queramos
                laukiak[sortutakoak].setZabalera((int) (Math.random() * 8 + 1));
                System.out.print("\tSartu altuera: ");
                laukiak[sortutakoak].setAltuera((int) (Math.random() * 8 + 1));
                ++sortutakoak;

                //System.out.println(sortutakoak);
            } else if (sortutakoak == LAUKI_KOP) {
                System.out.println("---> Ezin dituzu lauki gehiago sortu.");
            }

            //++sortutakoak;
        }
        System.out.println();
        System.out.println(Arrays.toString(laukiak));
    }

    public static void orden() {
        //Laukia.ordenatu(laukiak); --> forma 1 (Idoia)
        laukiak[2].ordenatu(laukiak);
        /*
        for (int i = 0; i < sortutakoak; ++i) {
            laukiak[i].ordenatu(laukiak);
            break;
        }
        */
        System.out.println(Arrays.toString(laukiak));
    }
}

/*
for (int i = 0; i == 0; ++i) {
            laukiak[i] = new Laukia();

            //se puede poner en modo switch haciendo clic en la notificación de la línea inferior
            if (chooseUser == 1) {
                System.out.println("LAUKI BERRIA SORTZEN...");
                //crear un nuevo cuadrado si la posición deseada del array no contiene ya un cuadrado
                System.out.print("\tZabalera: "); //introducir la ANCHURA que queramos
                laukiak[i].setZabalera(in.nextInt());

                System.out.print("\tAltuera: ");
                laukiak[i].setAltuera(in.nextInt());   //introducir la ALTURA que queramos
            } else if (chooseUser == 2) {
                System.out.printf("%-8s %8s %8s %8s %8s %8s \n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
                System.out.println("==================================================================");
                System.out.printf("\t%d \t%d \t%d \t%d \t%d \t%s \n", (i + 1), laukiak[i].getZabalera(), laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
            } else if (chooseUser == 3) {
                System.out.print("Zenbatgarren laukia nahi duzu marraztu? ");
                int posLaukia = in.nextInt();
                System.out.print("Beteta ala hutsik (B/H) ?");
                String marrazkia = in.next().toUpperCase();
                if ("B".equals(marrazkia)) {
                    laukiak[posLaukia].marraztuBeteta();
                } else if ("H".equals(marrazkia)) {
                    laukiak[i].marraztuHutsik();
                }
            }
        }
 */

 /*
public static void handiena() {
        for (int i = 0; i <= laukiak.length - 1; ++i) {
            if (laukiak[i].isBiggerThan(laukiak[i + 1])) {
                System.out.println(laukiak[i].toString());
            } else {
                System.out.println(laukiak[i + 1].toString());
            }
            //return laukiHandiena;

        }
    }
 */
//Math.random()*6  --> Esto da valores de 0.0 a 6.0, excluido el 6.0
//Math.random()*6 + 1  --> Esto da valores entre 1.0 y 7.0 excluido el 7.0

/*Utilizando el scanner:
Random r = new Random();
int valorDado = r.nextInt(6)+1;  // Entre 0 y 5, más 1.
 */
