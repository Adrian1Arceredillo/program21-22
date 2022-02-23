/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author AdriAlex
 */
public class Book implements Argitagarria {
    
    private String titulo;
    private Author autor;
    private double precio;
    private int paginas;
    
    private /*public*/ static int argitaratutakoLiburuak = 0;  //cada vez que se llame la método argitaratu(), se incrementará en 1
    
    private Hizkuntza hizkuntza;    //si ponemos "protected", se podrá acceder tanto desde la clase padre como de las subclases
    
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
    
    /**
     * Mediante este método podemos obtener el idioma del libro que 
     * nosotros indiquemos. 
     * @return 
     */
    public Hizkuntza getHizkuntza() {
        return hizkuntza;
    }
    
    /**
     * Este método se utilizará en el caso de que queramos cambiar el idioma de 
     * un libro. Solamente se podrán establecer como idiomas de los libros, los 
     * valores que hayamos guardado en el enumeración "Hizkuntza".
     * 
     * Es decir, ES, EN, EU
     * 
     * @param hizkuntza 
     */
    public void setHizkuntza(Hizkuntza hizkuntza) {
        this.hizkuntza = hizkuntza;
    }

    public static int getArgitaratutakoLiburuak() {
        return argitaratutakoLiburuak;
    }

    public static void setArgitaratutakoLiburuak(int argitaratutakoLiburuak) {
        Book.argitaratutakoLiburuak = argitaratutakoLiburuak;
        
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    /**
     * Este método lo utilizaremos para comparar dos libros. Diremos que dos 
     * libros son iguales cuando tengan el mismo nombre/título y el mismo 
     * autor. 
     * 
     * Si al hacer la compración, se da que son iguales, se imprimirá un 
     * mensaje (habrá otro mensaje diferente en caso de que sean diferentes)
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
    /**
     * Cada vez que se llame a este método, ocurrirá lo siguiente:
     * 
     * -> dependiendo del idioma que le pongamos al libro, aparecerá un 
     * mensaje u otro (cada mensaje estará en su correspondiente idioma). 
     * 
     * -> se incrementará en 1 el valor de "argitaratutakoLiburuak". Este 
     * atributo se ha creado para llevar la cuenta de los libros que se 
     * publican. 
     * 
     */
    @Override
    public void argitaratu() {
        LocalDate gaurkoData = LocalDate.now();
        
        if (this.getHizkuntza() == Hizkuntza.EN) {
            System.out.println("Published in Eibar, on " + gaurkoData);
        } else if (this.getHizkuntza() == Hizkuntza.ES) {
            System.out.println("Publicado en Eibar, el día " + gaurkoData);
        } else if (this.getHizkuntza() == Hizkuntza.EU) {
            System.out.println("Eibarren argitaratua " + gaurkoData + " egunean. ");
        }
        
        //System.out.println("Eibarren argitaratua " + gaurkoData + " egunean. ");
        ++argitaratutakoLiburuak;
        System.out.println("Orain arte argitaratutako liburuak: " + argitaratutakoLiburuak);
    }
    
}
