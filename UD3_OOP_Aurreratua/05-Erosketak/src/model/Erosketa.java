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
    protected LocalDate data = LocalDate.now();;
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
    
    
    public Erosketa(String kodea, String dataUser,Bezeroa eroslea, 
            ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak/*, 
            double guztira*/) {
        
        //código de la compra
        this.kodea = new char[kodea.length()];
        for (int i = 0; i < kodea.length(); ++i) {
            this.kodea[i] = kodea.charAt(i);
        }
        
        /*
        if(dataUser == null) {  //si el parámetro de entrada de la fecha es nulo, se pondrá la fecha de hoy por defecto
            this.data = LocalDate.now();
        }
        */
        
        LocalDate fechaCompra = LocalDate.parse(dataUser);  //fecha de la compra
        this.data = fechaCompra;
        this.bezeroa = eroslea; //comprador
        this.produktuak = produktuak;   //productos de la compra
        this.unitateak = unitateak; //unidades de cada producto de la compra
        
        //this.guztira = guztira;
        this.guztira = getGuztira();
        
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
        
        double totalPrecioProdMismoTipo = 0;
        for (int i = 0; i < produktuak.size(); ++i) {
            totalPrecioProdMismoTipo = totalPrecioProdMismoTipo + 
                    (produktuak.get(i).getPrezioa() * unitateak.get(i));
        }
        //this.guztira = totalCompra;
        //return guztira;
        return totalPrecioProdMismoTipo;
        
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }
    
    
    public double calcularZenbatekoa() {
        ArrayList<Double> preciosAgrupadosCompra = new ArrayList<>();
        preciosAgrupadosCompra.add(getGuztira());
        /*for (int i = 0; i < produktuak.size(); ++i) {
            preciosAgrupadosCompra.add(produktuak.get(i).getPrezioa() * 
                    unitateak.get(i));
        }*/
        
        
        return 0;
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
    
    
    public String getStrProduktuak() {
        String cadaProducto = "";
        String listaTodosLosProductos = "";
        
        for (int i = 0; i < produktuak.size(); ++i) {
            cadaProducto = (i + 1) + ". produktua: " + produktuak.get(i).getStrKodea() + ", " + 
                    produktuak.get(i).getIzena() +", " + 
                    unitateak.get(i).toString() + ", " + 
                    produktuak.get(i).getPrezioa() + ", \n\t\t\t\tZenbatekoa: " + 
                    produktuak.get(i).getPrezioa() * unitateak.get(i) + "\n";
                    /*produktuak.get(i).getPrezioa() + ", \n\t\t\t\tGuztira: " + */
                    /*produktuak.get(i).getPrezioa() * unitateak.get(i) + "\n";*/
                    
            //cadaProducto = produktuak.get(i).toString();
            listaTodosLosProductos = listaTodosLosProductos + cadaProducto + "\n";
            //"Kodea \tProduktua \t\tUnitateak \tPrezioa \tZenbatekoa" + "\n" + 
        }
        return listaTodosLosProductos;
        
    }
    
    
    
    /**
     * Método que imprime de RESUMIDAMENTE los datos de la compra. 
     * @return 
     */
    public String toString() {
        return "\tKodea: " + this.getStrKodea() + "\tData: " + this.getData() + 
                "\n\tBezeroa: " + this.getBezeroa() + "\n" + guztira + "\n";
    }
    
    
    /**
     * Método que devuelve los datos de la compra, con el mismo formato 
     * que aparece en el PDF. 
     * @return 
     */
    public String toStringLuzea() {
        int numProd = 0;
        
        return "\tKodea: " + this.getStrKodea() + "\tData: " + this.getData() + 
                "\n\tBezeroa: " + this.getBezeroa().getKodea() + 
                "\n\tIzena: " + this.getBezeroa().getIzena() + "\t\t" + this.getBezeroa().getIzena() + 
                "\n\tHelbidea: " + this.getBezeroa().getHelbidea() + 
                "\n\teMail: " + this.getBezeroa().getEmaila() + "\n\nº" + 
                getStrProduktuak() +  
                "--------------------------------Guztira: " + guztira + "------\n";
        
    }
    
    
    public boolean guztiraEgiaztatu() {
        
        for (int i = 0; i < produktuak.size(); ++i) {
            
        }
        
        return false;
    }
    
}
