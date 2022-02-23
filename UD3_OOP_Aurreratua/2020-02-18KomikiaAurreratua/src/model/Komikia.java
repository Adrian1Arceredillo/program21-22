/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
//import static model.Book.getArgitaratutakoLiburuak;

/**
 *
 * @author AdriAlex
 */
public class Komikia extends Book implements Argitagarria {
    
    private boolean kolorea;
    //argitaratutakoLiburuak;
    
    /**
     * Constructor que nos permite crear un objeto de la clase Komikia, 
     * y que a su vez hereda los atributos y los métodos de la clase 
     * padre llamada Book. 
     * @param kolorea
     * @param titulo
     * @param autor
     * @param precio
     * @param paginas 
     */
    public Komikia(boolean kolorea, String titulo, Author autor, double precio, int paginas) {
        super(titulo, autor, precio, paginas);
        this.kolorea = kolorea;
    }
    
    
    public boolean isKolorea() {
        return kolorea;
    }
    
    
    /**
     * Método que, dependiendo si el atributo boolean "kolorea", es True 
     * o False, hará saber al usuario si un determinado libro tiene 
     * colores, o si es en blanco y negro. 
     * 
     * @return 
     */
    @Override
    public String getNolakoa() {
        String nolakoa = "";
        
        if (this.isKolorea()) {
            nolakoa = "koloretakoa";
        } else {
            nolakoa = "zuribeltza";
        }
        
        return nolakoa;
    }
    
    @Override
    public String toString() {
        return "Komikia {" + "kolorea= " + this.isKolorea() + "}" + super.getTitulo() + 
                ", autor= " + super.getAutor().getNombre() + 
                ", precio= " + super.getPrecio() + 
                ", páginas= " + super.getPaginas();
    }
    
    
    @Override
    public void argitaratu() {
        LocalDate gaurkoData = LocalDate.now();
        
        if (this.getHizkuntza() == Hizkuntza.EN) {
            System.out.println("Komik published in Eibar, on " + gaurkoData);
        } else if (this.getHizkuntza() == Hizkuntza.ES) {
            System.out.println("Komik publicado en Eibar, el día " + gaurkoData);
        } else if (this.getHizkuntza() == Hizkuntza.EU) {
            System.out.println("Eibarren argitaraturiko komikia, " + gaurkoData + " egunean. ");
        }
        
        System.out.println("Orain arte argitaratutako liburuak: " + (int) (Book.getArgitaratutakoLiburuak() + 1));
        Book.setArgitaratutakoLiburuak(Book.getArgitaratutakoLiburuak() + 1);
        
    }
    
}
