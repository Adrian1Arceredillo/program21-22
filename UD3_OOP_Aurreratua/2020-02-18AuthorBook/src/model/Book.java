/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AdriAlex
 */
public class Book {
    
    private String titulo;
    private Author autor;
    private double precio;
    private int paginas;
    
    /**
     * Construcor de objetos de la clase Book, el cuál recibirá como 
     * parámetros de entrada, los valores correspondientes a los 
     * atributos definidos inicialmente. 
     * 
     * @param titulo
     * @param autor
     * @param precio
     * @param paginas 
     */
    public Book(String titulo, Author autor, double precio, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
    public String toString() {
        return "Titulo: " + this.getTitulo() + 
                ", Autor: " + this.getAutor().getNombre() + 
                ", Precio: " + this.getPrecio() + 
                ", Páginas: " + this.getPaginas();
    }
    
    /**
     * Método que devuelve el tipo de libro. Es decir, en función del 
     * número de páginas que este tenga, el programa nos dirá si es un 
     * libro pequeño, normal o grande. 
     * 
     * @return 
     */
    public String getNolakoa() {
        String nolakoa = "";
        if (this.getPaginas() <= 100) {
            nolakoa = "txikia";
        } else if (this.getPaginas() >= 101 && this.getPaginas() <= 400) {
            nolakoa = "normala";
        } else if (this.getPaginas() >= 401) {
            nolakoa = "handia";
        }
        
        return nolakoa;
    }
    
}
