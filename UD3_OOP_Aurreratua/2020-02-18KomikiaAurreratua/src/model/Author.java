/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Objects;


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

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     * Este método lo vamos a utilizar para comparar dos autores. En caso 
     * de que todos los atributos de ambos autores sean iguales, diremos 
     * que los autores son iguales. 
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
        final Author other = (Author) obj;
        if (this.genero != other.genero) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        return true;
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