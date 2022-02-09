/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author arceredillo.adrian
 */
public class TestBezeroa {
    
    //array que guardará los diferentes eMails de los contactos de la empresa
    private static String[] kontaktoenEmailak = new String[50];
    
    public static void main(String[] args) {
        
        /*--------------Pertsona------------------*/
        Bezeroa bezP1 = new Pertsona(2, "Martin \tBerasategi", 
                    "Mirakontxa z/g. DONOSTIA.", "mbera@donostia.eus");
        
        System.out.println("Pertsona tipoko Bezero bat: ");
        System.out.println("---------------------------");
        System.out.println("DATUAK: \n");
        System.out.println(bezP1.toString());
        
        
        /*--------------Empresa------------------*/
        
        //guardar en el array "kontaktoenEmailak" los eMails de los contactos de la empresa
        kontaktoenEmailak[0] = "idazkaria@uni.eus"; 
        kontaktoenEmailak[1] = "zuzendaria@uni.eus";
        
        int numeroContactos = 0;
        for (int i = 0; i < kontaktoenEmailak.length; ++i) {
            if (kontaktoenEmailak[i] != null) {
                ++numeroContactos;
            }
        }
        String[] todosContactosEmpresa = new String[numeroContactos];
        
        for (int g = 0; g < kontaktoenEmailak.length; ++g) {
            if (kontaktoenEmailak[g] != null) {
                todosContactosEmpresa[g] = kontaktoenEmailak[g];
            }
        }
        
        //crear un bezero de tipo EMPRESA
        Bezeroa bezE1 = new Empresa(3, "Uni Eibar-Ermua", "Unibertsitatea", 
                "Otaola Etorbidea 29. EIBAR. ", todosContactosEmpresa);
        
        System.out.println("Empresa tipoko Bezero bat: ");
        System.out.println("---------------------------");
        System.out.println("DATUAK: \n");
        System.out.println(bezE1.toString());
        
    }
}
