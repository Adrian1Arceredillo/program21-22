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
public class Erosketa {
    
    
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;
    
    
    
    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        
        this.kodea = new char[kodea.length()];
        
        for (int i = 0; i < kodea.length(); ++i) {
            this.kodea[i] = kodea.charAt(i);
        }
        
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }
    
    
    public Erosketa(String kodea, String data,Bezeroa eroslea, 
            ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, 
            double guztira) {
        
        //código de la compra
        this.kodea = new char[kodea.length()];
        for (int i = 0; i < kodea.length(); ++i) {
            this.kodea[i] = kodea.charAt(i);
        }
        
        LocalDate fechaCompra = LocalDate.parse(data);  //fecha de la compra
        this.data = fechaCompra;
        this.bezeroa = eroslea; //comprador
        this.produktuak = produktuak;   //productos de la compra
        this.unitateak = unitateak; //unidades de cada producto de la compra
        this.guztira = guztira;
        
    }

    public char[] getKodea() {
        return kodea;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public void setProduktuak(ArrayList<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public void setUnitateak(ArrayList<Integer> unitateak) {
        this.unitateak = unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }
    
    
    
    
    /**
     * Método que imprime de RESUMIDAMENTE los datos de la compra. 
     * @return 
     */
    public String toString() {
        return "Kodea: " + this.getKodea() + "\tData: " + this.getData() + 
                "\nBezeroa: " + this.getBezeroa() + "\tProduktuak: " + this.getProduktuak() + 
                "\tUnitateak: " + this.getUnitateak() + "\nGuztira: " + this.getGuztira();
    }
    
    
    /**
     * Método que devuelve los datos de la compra, con el mismo formato 
     * que aparece en el PDF. 
     * @return 
     */
    public String toStringLuzea() {
        return "a";
    }
    
}
