/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class HiruLaukiSortu {
    public static void main(String[] args) {
        
        System.out.println("Hiru lauki sortu dituzu: ");
        
        Laukia la1 = new Laukia(5, 1);
        Laukia la2 = new Laukia(6, 2);
        Laukia la3 = new Laukia(2, 2);
        
                
        System.out.println(la1.toString());
        System.out.println(la2.toString());
        System.out.println(la3.toString());
        
        //Ejer 3 - getMota() metodoarekin
        System.out.println(la1.getMota());
        System.out.println(la2.getMota());
        System.out.println(la3.getMota());
        
        /*
        if (la2.isBiggerThan(la3)) {
            System.out.println("b");
        } else {
            System.out.println("a");
        }
        */
    }
}
