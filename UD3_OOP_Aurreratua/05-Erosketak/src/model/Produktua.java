/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.*;
import java.util.*;

/**
 *
 * @author arceredillo.adrian
 */
public class Produktua {
    
    private char[] kodea;
    private String izena;
    private double prezioa;

    /**
     * Constructor PRINCIPAL (diagrama).
     * @param kodea
     * @param izena
     * @param prezioa 
     */
    public Produktua(char[] kodea, String izena, double prezioa) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
    }
    
    /**
     * Constructor alternativo (para hacer pruebas)
     * @param kodea
     * @param izena
     * @param prezioa 
     */
    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = new char[kodea.length()];
        for (int i = 0; i < kodea.length(); ++i) {
            this.kodea[i] = kodea.charAt(i);
        }
        
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return this.kodea;
    }
    
    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }
    
    
    /**
     * Método para devolver en formato String, el char[] que guarda los 
     * valroes del kodea. Es decir, mediante el constructor se le pasa 
     * un String, y el mismo constructor se encarga de guardar dicho String 
     * en char[] kodea.
     * 
     * Con este método, buscamos imprimir el contenido del char[] como si 
     * fuese un String. 
     * 
     * @return 
     */
    public String getStrKodea() {
        String kodeaString = "";
        for (int i = 0; i < this.kodea.length; ++i) {
            kodeaString = kodeaString + kodea[i];
        }
        
        return kodeaString;
    }
    
    public String toString() {
        return "Kodea: " + this.getStrKodea() /*this.getKodea()*/ + 
                "   Produktua: " + this.getIzena() + 
                "   Prezioa: " + this.getPrezioa() + "\n";
    }
    
}
