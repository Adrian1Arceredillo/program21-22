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
public class Empresa implements Bezeroa {
    
    private int kodea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String helbidea;
    private static String[] kontaktoenEmailak;
    
    
    
    //ArrayList de tipo String creado por mí para guardar los diferentes 
    //eMails que pueda tener la empresa. 
    
    //public static ArrayList<String> kontaktoenEmailGuztiak = new ArrayList<>();
    
    /**
     * Constructor para crear un nuevo objeto de tipo Bezeroa, pero 
     * siendo también de la subclase EMPRESA. 
     * @param kodea
     * @param izena
     * @param helbidea
     * @param emaila 
     */
    public Empresa(int kodea, String izenJuridikoa, String izenKomertziala,  
            String helbidea, String[] kontaktoenEmailak) {
        
        this.kodea = kodea;
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.helbidea = helbidea;
        this.kontaktoenEmailak = kontaktoenEmailak;
        
    }
    
    public int getKodea() {
        return kodea;
    }
    
    public String getIzena() {
        return this.izenJuridikoa + " " + this.izenKomertziala; 
    }
    
    public String getHelbidea() {
        return this.helbidea;
    }
    
    public String getEmaila() {
        String stringContactosEmail = "";
        for (int i = 0; i < kontaktoenEmailak.length; ++i) {
            if (kontaktoenEmailak[i] != null) {
                stringContactosEmail = stringContactosEmail + kontaktoenEmailak[i] + ", ";
            }
        }
        
        return stringContactosEmail;
        //return Arrays.toString(this.kontaktoenEmailak);
    }
    
    
    public void setKodea(int kodea) {
        this.kodea = kodea;
    }

    public void setIzenJuridikoa(String izenJuridikoa) {
        this.izenJuridikoa = izenJuridikoa;
    }

    public void setIzenKomertziala(String izenKomertziala) {
        this.izenKomertziala = izenKomertziala;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public static void setKontaktoenEmailak(String[] kontaktoenEmailak) {
        Empresa.kontaktoenEmailak = kontaktoenEmailak;
    }
    
    
    public String getStrkontaktoenEmailak() {
        String stringContactosEmail = "";
        for (int i = 0; i < kontaktoenEmailak.length; ++i) {
            if (kontaktoenEmailak[i] != null) {
                stringContactosEmail = stringContactosEmail + kontaktoenEmailak[i] + ", ";
            }
        }
        
        return stringContactosEmail;
    }
    
    
    public String toString() {
        
        return this.kodea + 
                "\n\tIzena: " + this.getIzena() + 
                "\n\tHelbidea: " + this.helbidea + 
                "\n\teMail: " + this.getStrkontaktoenEmailak();
    }
    
}
