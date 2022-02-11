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
public class ErosketaKudeatu {
    
    private static ArrayList<Bezeroa> kontaktuak = new ArrayList<>();
    private static ArrayList<Produktua> produktuKatalogoa = new ArrayList<>();
    private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList<>();
        
    public static void main(String[] args) {
        
        initialize();
        int aukera;
        
        
        
    }
    
    
    
    public static void initialize() {
    
        //pdf-ko Erosketak sortu
        
        //array de eMails de contactos - Bezero de tipo Empresa
        String[] eMailakEmpresa = new String[100];
        eMailakEmpresa[0] = "idazkaria@uni.eus";
        eMailakEmpresa[1] = "zuzendaria@uni.eus";
        
        //crear los clientes
        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua "+ "z/g ZARAUTZ ", "kargi@zarautz.eus");
        Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA. ", "mbera@donostia.eus");
        Bezeroa uni = new Empresa(3, "IES Uni BHI", "Uni Eibar-Ermua","Otaola Hiribidea 29 Eibar ", eMailakEmpresa);
        
        kontaktuak.add(karlos);
        kontaktuak.add(martin);
        kontaktuak.add(uni);
        
        
        //crear catálogo de productos
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        Produktua hp = new Produktua("C02", "HP Pavilion", 600);
        Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
        Produktua iPhone = new Produktua("T02", "iPhone XX", 1300);
        
        produktuKatalogoa.add(toshiba);
        produktuKatalogoa.add(hp);
        produktuKatalogoa.add(samsung);
        produktuKatalogoa.add(iPhone);
        
        //productos que hay en cada compra / unidades de cada producto
        ArrayList<Produktua> productosMartin = new ArrayList<>();
            //poner sus productos
        ArrayList<Integer> unidadesMartin = new ArrayList<>();
            //poner las unidades de cada uno de los productos de su compra
            
        //crear las compras & guardarlas en el arrayList que recoge todas las compras
        
        //Erosketa compra1 = new Erosketa("E18-01", "2018-09-25", martin,    );
        
    }
    
}
