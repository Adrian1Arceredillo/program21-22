/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.ArrayList;
import java.util.Arrays;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class Test4 {
    public static void main(String[] args) {
        
        //crear 2 Puntua
        Puntua pA = new Puntua(1, 4);   //punto A
        Puntua pB = new Puntua(4, 5);   //punto B
        
        //crear 2 Laukizuzena
        Laukizuzena rec1 = new Laukizuzena(new Puntua(2,1),new Puntua(10,6));
        Laukizuzena rec2 = new Laukizuzena(3,3,12,16);
        
        //comprobar Puntua dentro de Laukizuzena
        //pA in Rec1 - pB in Rec1
        System.out.println("Punto A dentro de Rec 1: " + rec1.isInside(pA));
        System.out.println("Punto B dentro de Rec 1: " + rec1.isInside(pB));
        System.out.println("----------------");
        //pA in Rec2 - pB in Rec2
        System.out.println("Punto A dentro de Rec 2: " + rec2.isInside(pA));
        System.out.println("Punto B dentro de Rec 2: " + rec2.isInside(pB));
        System.out.println("----------------");
        
        //getErtzenLuzera()
        Kutxa k0 = new Kutxa(new Puntua(2,7),new Puntua(5,12),5);
        System.out.println(Arrays.toString(k0.getErtzenLuzera()));
        System.out.println("----------------");
        
        //handiena()
        ArrayList<Kutxa> kutxenSorta = new ArrayList<>();
        
        Kutxa k1 = new Kutxa(new Puntua(2,6),new Puntua(5,7),5);    //crear unas cuantas Kutxa
        Kutxa k2 = new Kutxa(new Puntua(1,4),new Puntua(5,6),12);
        Kutxa k3 = new Kutxa(new Puntua(4,6),new Puntua(7,8),3);
        Kutxa k4 = new Kutxa(new Puntua(3,2),new Puntua(4,9),2);
        Kutxa k5 = new Kutxa(new Puntua(1,1),new Puntua(3,4),6);
        
        kutxenSorta.add(k1);    //añadirlas al arrayList
        kutxenSorta.add(k2);
        kutxenSorta.add(k3);
        kutxenSorta.add(k4);
        kutxenSorta.add(k5);
        
        kutxenSorta.add(k1);
        kutxenSorta.add(k2);
        
        System.out.println("Kutxa handiena: " + Kutxa.handiena(kutxenSorta) + 
                " -> Kutxaren altuera: " + Kutxa.handiena(kutxenSorta).getAltuera());
        System.out.println("----------------");
        
    }
}
