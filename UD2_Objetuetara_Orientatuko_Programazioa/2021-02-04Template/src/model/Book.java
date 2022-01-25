package model;

/*
 * The Book class models a book with one (and only one) author.
 */
public class Book {
   // The private instance variables
   private String izenburua;
   private Author egilea;
   private double prezioa;
   private int orriak; 
 
  public Book(String izenburua){
      this.izenburua = izenburua;
      
  }
   
   public Book(String izenburua, Author egilea, double prezioa, int orriak) {
      this.izenburua = izenburua;
      this.egilea = egilea;
      this.prezioa = prezioa;
      this.orriak = orriak;
   }

    public String getIzenburua() {
        return izenburua;
    }

    public Author getEgilea() {
        return egilea;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public int getOrriak() {
        return orriak;
    }
 
 
 
   // The toString() describes itself
   public String toString() {
      return String.format("%-35s%-30s%8.2f%8d",izenburua, egilea,prezioa,orriak);
   }
   
   
}