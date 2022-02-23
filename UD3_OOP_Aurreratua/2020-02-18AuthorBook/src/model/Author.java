/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;


/* 
 * The Author class model a book's author.
 */
public class Author {
    
    private String nombre;
    private char genero;    //'m' edo 'f'
    private LocalDate birthday;
    
    /**
     * Construcor de un objeto de tipo Author; que recibirá 
     * como parámetro de entrada los valores correspondientes 
     * a los atributos "nombre" y "genero". 
     * 
     * Es decir, inicialmente, no se especificará un valor 
     * para el atributo "birthday". 
     * @param nombre
     * @param genero 
     */
    public Author(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    /**
     * Setter que funciona recibiendo un String que se convertirá en 
     * un dato de tipo LocalDate. Para ello, se utilizará la función 
     * llamada: 
     * 
     * LocalDate.parse(String string)
     * 
     * @param birthday 
     */
    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday);
    }
    
    
    public String toString() {
        if (this.birthday != null) {
            return "Nombre: " + nombre + ", Genero: " + this.getGenero() + ", Nacimiento: " + this.getBirthday();
        } else {
            return "Nombre: " + this.getNombre() + ", Genero: " + this.getGenero();
        }
    }
    
    
}



/*
Link ejemplo Garapen Python:
https://www.cs.upc.edu/~nivela/python/geometria.py
*/