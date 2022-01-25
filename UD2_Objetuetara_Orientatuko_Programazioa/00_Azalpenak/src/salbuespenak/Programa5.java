/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salbuespenak;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class Programa5 {
    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        Scanner sc = new Scanner(System.in);
        int zenbatgarren;
        boolean egina = false;
        
        do {
            try {

                System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
                zenbatgarren = sc.nextInt();
                System.out.println(zenbakiak[zenbatgarren]);
                egina = true;
            } catch (InputMismatchException ex) {
                System.out.println("Zenbaki bat sartu behar duzu.");
                sc.next(); //scannerrean geratu dan elementua hustuteko
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Zenbaki okerra sartu duzu.");
            } catch (Exception ex) {
                System.out.println("Salbuespena gertatu da.");
                System.out.println(ex.getMessage());
            }

        } while (!egina);
        
    }
}

/*
Moodle:
Eta zer egin beharko genuke aurreko adibidean, erabiltzaileak datu 
egoki bat sartu arte programak galdetzen jarraitzea nahiko bagenu?
*/