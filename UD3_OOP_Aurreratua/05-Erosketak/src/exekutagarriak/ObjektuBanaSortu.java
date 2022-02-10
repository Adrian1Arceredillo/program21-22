/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.*;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class ObjektuBanaSortu {
    public static void main(String[] args) {
        
        
        //Bezeroa - Pertsona
        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", 
                "Hondartza Pasialekua z/g ZARAUTZ", "kargi@uni.eus");
        
        System.out.println("karlos => " + karlos);
        System.out.println("----------------");
        
        //Produktua
        System.out.println("PRODUCTOS: \n");
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        Produktua headPhones = new Produktua("H06", "Samsung Galaxy", 50);
        
        System.out.print("toshiba => " + toshiba);
        System.out.println("headPhones => " + headPhones);
        System.out.println("----------------");
        
        //crear arrayList de Produktua y añadir el objeto "toshiba"
        ArrayList<Produktua> erosketaHonetakoProduktuak = new ArrayList<>();
        erosketaHonetakoProduktuak.add(toshiba);
        erosketaHonetakoProduktuak.add(headPhones);
        
        //crear arrayList de Unitateak para saber cuántas unidades compraremos
        ArrayList<Integer> erosketaHonetakoUnitateak = new ArrayList<>();
        erosketaHonetakoUnitateak.add(15);
        erosketaHonetakoUnitateak.add(1);
        
        
        //calcular el valor de Guztira
        double totalCompra = 0;
        for (int i = 0; i < erosketaHonetakoProduktuak.size(); ++i) {
            totalCompra = totalCompra + 
                    (erosketaHonetakoProduktuak.get(i).getPrezioa() * 
                    erosketaHonetakoUnitateak.get(i));
        }
        
        //Erosketa
        Erosketa gaurkoErosketa = new Erosketa("E18-02", "2018-10-24", karlos,
                    erosketaHonetakoProduktuak, erosketaHonetakoUnitateak, 
                    totalCompra);
        
        System.out.println("gaurkoErosketa => \n" + gaurkoErosketa.toString());
        System.out.println("----------------");
        System.out.println("Orain formatu luzean: \n");
        System.out.println("gaurkoErosketa => \n" + gaurkoErosketa.toStringLuzea());
        
        
    }
    
}
