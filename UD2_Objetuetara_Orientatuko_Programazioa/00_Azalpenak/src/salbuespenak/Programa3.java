/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salbuespenak;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class Programa3 {
    public static void main(String[] args) {

        int[] zenbakiak = {1, 15, 2};
        Scanner in = new Scanner(System.in);
        int zenbatgarrenZenbakia;
        
        try {
            System.out.println("Zenbatgarren zenbakia ikusi nahi duzu? ");
            zenbatgarrenZenbakia = in.nextInt();
            System.out.println(zenbakiak[zenbatgarrenZenbakia]);
        } catch (Exception ex){
            System.out.println("Txarto! Sarturiko balioa ez da egokia. ");
        }
        
    }
}

/*
Moodle:
Suposatu, erabiltzaileari eskatzen diogula zenbatgarren zenbakia 
ikusi nahi duen:
*/