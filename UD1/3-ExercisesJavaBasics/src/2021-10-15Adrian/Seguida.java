
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Seguida {

    public static void main(String[] args) {

        int zenb_kopurua;   //establece el numero maximo
        int multzo_kant;    //establece la cantidad que ira en cada grupo

        Scanner in = new Scanner(System.in);
        System.out.print("Zein da inprimatu nahi duzun azken zenbakia? ");
        zenb_kopurua = in.nextInt();

        System.out.print("Zenbat zenbakiko multzoak nahi dituzu? ");
        multzo_kant = in.nextInt();

        in.close();

        for (int row = 1; row <= zenb_kopurua; ++row) { //hace quew cada vez que se pongan los numeros que queremos en cada bloque, se pone una linea de otra caraceter; en este caso "=="
            System.out.printf("%2d\n", row);
            while (row == multzo_kant) {
                    System.out.println("==== ");
                    multzo_kant = multzo_kant + multzo_kant;
                } 
        }

    }
}
