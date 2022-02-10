/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arceredillo.adrian
 */
public class Pertsona implements Bezeroa {
    
    private int kodea;
    private String izena;
    private String abizena;
    private String helbidea;
    private String emaila;
    
    
    /**
     * Constructor para crear un nuevo objeto de tipo Bezeroa, pero 
     * siendo también de la subclase PERTSONA. 
     * @param kodea
     * @param izena
     * @param helbidea
     * @param emaila 
     */
    public Pertsona(int kodea, String izena, String abizena, 
            String helbidea, String emaila) {
        
        this.kodea = kodea;
        this.izena = izena;
        this.abizena = abizena;
        this.helbidea = helbidea;
        this.emaila = emaila;
        
    }
    
    public int getKodea() {
        return kodea;
    }
    
    public String getIzena() {
        return this.izena;
    }
    
    public String getAbizena() {
        return abizena;
    }
    
    public String getHelbidea() {
        return this.helbidea;
    }
    
    public String getEmaila() {
        return this.emaila;
    }
    
    
    public void setKodea(int kodea) {
        this.kodea = kodea;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }
    
    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }
            
    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }
    
    
    
    public String toString() {
        return this.kodea + 
                "\n\tIzena: " + this.izena + "\t" + this.getAbizena() + 
                "\n\tHelbidea: " + this.helbidea + 
                "\n\teMail: " + this.emaila;
    }
    
}
