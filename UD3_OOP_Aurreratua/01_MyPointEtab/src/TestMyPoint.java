/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import model.*;

/**
 *
 * @author AdriAlex
 */
public class TestMyPoint {
    public static void main(String[] args) {
        
        //2 - a) Hiru puntu sortu:        
        System.out.println("Moodle - Ariketa 2 - a):");
        MyPoint p0 = new MyPoint(0, 0); System.out.println(p0);
        MyPoint p1 = new MyPoint(2, 1); System.out.println(p1);
        MyPoint p2 = new MyPoint(4, 0); System.out.println(p2);
        System.out.println("------------");
        
        //2 - b) Distantziak koordenatu-jatorriarekiko:
        System.out.println("Moodle - Ariketa 2 - b):");
        System.out.println(p0.distance());
        System.out.println(p1.distance());
        System.out.println(p2.distance());
        System.out.println("------------");
        
        //2- c) Distantziak euren artean:
        System.out.println("Moodle - Ariketa 2 - c):");
        System.out.printf("p0tik p1ra -> %.2f\n", p0.distance(p1));
        System.out.printf("p0tik p2ra -> %.2f\n", p0.distance(p2));
        System.out.printf("p1tik p2ra -> %.2f\n", p1.distance(p2));
        System.out.println("------------");        
        
        /*d) Sortu 10 puntuko array bat. Eta automatikoki bete:
        puntuenArraya => [(1,1), (2,2), (3,3), (4,4), (5,5), (6,6), (7,7), (8,8), (9,9), (10,10)]*/
        MyPoint[] puntuenArraya = new MyPoint[10];
        for (int i = 0; i < puntuenArraya.length; ++i) {
            puntuenArraya[i] = new MyPoint(i + 1, i + 1);
        }
        
        System.out.println(Arrays.toString(puntuenArraya));
        System.out.println("------------");        
        
        //e) Sortu 100 puntuko arrayLista:
        ArrayList<MyPoint> puntuenArrayLista = new ArrayList<MyPoint>(100); //poner 100 entre paréntesis no es necesario
        for (int i = 0; i < 100; ++i) {
            puntuenArrayLista.add(new MyPoint(i + 1, i + 1));
            System.out.println(puntuenArrayLista.get(i));
        }
        
        //verContenidoArrayList(puntuenArrayLista);
        System.out.println("------------"); 
        
        //f) Sortu ausazko 5 puntuko sorta (0-9 tartean). java.util.Random klasearen .nextInt() metodoa erabili dezakezu.
        MyPoint[] ausazkoPuntuSorta = new MyPoint[5];
        for (int i = 0; i < ausazkoPuntuSorta.length; ++i) {
            Random ran = new Random();
            int xAusazkoa = ran.nextInt(10);  //crear un valor aleatorio (0-9) para X
            int yAusazkoa = ran.nextInt(10);  //crear un valor aleatorio (0-9) para Y
            ausazkoPuntuSorta[i] = new MyPoint(xAusazkoa, yAusazkoa);
        }
        System.out.println(Arrays.toString(ausazkoPuntuSorta));
        System.out.println("------------"); 
    }
    
    
    public static void verContenidoArrayList (ArrayList nombreArrayList) {
        for (int i = 0; i < nombreArrayList.size(); ++i) {
            System.out.println(nombreArrayList.get(i));
            
        }
        System.out.println("");
    }
    
}

