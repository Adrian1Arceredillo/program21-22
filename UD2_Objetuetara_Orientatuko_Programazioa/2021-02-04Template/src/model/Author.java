package model;

import java.time.LocalDate;

/* 
 * The Author class model a book's author.
 */
public class Author {
    // The private instance variables

    private String izena;
    private String abizena;
    private LocalDate jaiotza;
    private LocalDate heriotza;

    public Author(String izena, String abizena,LocalDate jaiotzeUrtea) {
        this.izena = izena;
        this.abizena = abizena;
        this.jaiotza = jaiotzeUrtea;
    } 
    
    public Author(String izena, String abizena) {
        this.izena = izena;
        this.abizena = abizena;
    } 

    public String getIzena() {
        return izena;
    }
    
     
       public String getIzenOsoa() {
        return izena+" "+abizena;
    }

    public LocalDate getJaiotza() {
        return jaiotza;
    }

    public LocalDate getHeriotza() {
        return heriotza;
    }
    
    
    public void setJaiotzeUrtea(LocalDate jaiotzeUrtea) {
        this.jaiotza = jaiotzeUrtea;
    }

    public void setHeriotzaUrtea(LocalDate heriotzaUrtea) {
        this.heriotza = heriotzaUrtea;
    }
    
    public String toString() {
        return getIzenOsoa() + " (" + jaiotza+"-"+(heriotza!=null?heriotza:" ") + ") ";

    }
}
