
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Zatigarritasuna {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int zenbaki1, zenbaki2;

        System.out.println("Zein zenbakiren arteko zatigarritasuna nahi duzu egiaztatu?");
        zenbaki1 = in.nextInt();
        zenbaki2 = in.nextInt();

        if (zatigarriaDa(zenbaki1, zenbaki2)){
             System.out.println(zenbaki1 + " zenbakia " + zenbaki2 + " zenbakiarekin zatigarria da");
        } else {
            System.out.println(zenbaki1 + " zenbakia ez da " + zenbaki2 + " zenbakiarekin zatigarria da");
        }

        

    }

    public static boolean zatigarriaDa(int handia, int txikia) {

        if (handia % txikia == 0) {
            return true;
        } 
        return false;
    }

    
    
}
