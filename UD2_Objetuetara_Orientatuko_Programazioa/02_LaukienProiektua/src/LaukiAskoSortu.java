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
public class LaukiAskoSortu {

    public static void main(String[] args) {

        int laukiKopurua;
        Scanner in = new Scanner(System.in);
        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        laukiKopurua = in.nextInt();

        //definir array de objetos
        Laukia laukiakArray[] = new Laukia[laukiKopurua];
        //System.out.println(Arrays.toString(laukiakArray));

        //crear los cuadrado a partir de los datos de entrada
        for (int i = 0; i < laukiKopurua; ++i) {
            System.out.println((i + 1) + ". LAUKIAREN DATUAK: ");
            laukiakArray[i] = new Laukia();

            System.out.print("\tZabalera: "); //introducir la ANCHURA que queramos
            laukiakArray[i].setZabalera(in.nextInt());
            System.out.print("\tAltuera: ");
            laukiakArray[i].setAltuera(in.nextInt());   //introducir la ALTURA que queramos

            System.out.println();

        }

        //presentar los datos en modo tabla/lista. Cada línea mostrará los datos de un cuadrado.
        System.out.printf("%-8s %8s %8s %8s %8s %8s \n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("==================================================================");
        for (int i = 0; i < laukiKopurua; ++i) {
            System.out.printf("\t%d \t%d \t%d \t%d \t%d \t%s \n", (i + 1), laukiakArray[i].getZabalera(), laukiakArray[i].getAltuera(), laukiakArray[i].getAzalera(), laukiakArray[i].getPerimetroa(), laukiakArray[i].getMota());
        }

        System.out.println();

    }
}


/*
for (i = 0; i < laukiKopurua; ++i) {
            System.out.println((i + 1) + ". LAUKIAREN DATUAK: ");

            //Laukia la5 = new Laukia();
            System.out.printf("     Zabalera: "); //ANCHURA nueva para cada vez que se pidan los datos del cuadrado que queremos
            la5.setZabalera(in.nextInt());

            System.out.print("      Altuera: "); //ALTURA nueva para cada vez que se pidan los datos del cuadrado que queremos
            la5.setAltuera(in.nextInt());

            System.out.printf("%-8s %8s %8s %8s %8s %8s \n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
            System.out.println("==========================================================");
            System.out.printf("\t%d \t%d \t%d \t%d \t%d \t%s \n", (i + 1), la5.getZabalera(), la5.getAltuera(), la5.getAzalera(), la5.getPerimetroa(), la5.getMota());
            System.out.println();
        }
 */
