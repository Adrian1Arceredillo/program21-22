/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class PdfkoDatuakSortu {
    public static void main(String[] args) {
        
        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", 
                "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus");
        
        Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", 
                "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus");
        
        
        String[] emailak = {"idazkaria@uni.eus", "zuzendaria@uni.eus"};
        Bezeroa uni = new Empresa(3, "IES Uni BHI", 
                "Uni Eibar-Ermua","Otaola Hiribidea 29 Eibar", emailak);
        
        
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        Produktua hp = new Produktua("C02", "HP Pavilion", 600);
        Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
        Produktua iPhone = new Produktua("T02", "iPhone XX", 1300);
        
        
    }
}
