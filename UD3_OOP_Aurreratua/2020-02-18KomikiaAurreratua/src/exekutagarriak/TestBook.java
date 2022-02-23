/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;
import static model.Book.getArgitaratutakoLiburuak;

/**
 *
 * @author AdriAlex
 */
public class TestBook {
    public static void main(String[] args) {
        
        //crear un Author
        Author javier = new Author("Javier", 'm');
        javier.setBirthday("2019-03-15");
        
        //crear un Book (especificando un autor (Author))
        Book libro1 = new Book("El Agua Helada", javier, 35, 201);
        
        System.out.println(libro1);
        System.out.println(libro1.getNolakoa());
        System.out.println("");
        //asignarle un idioma al objeto "libro1"
        libro1.setHizkuntza(Hizkuntza.ES);
        libro1.argitaratu();
        System.out.println("----------------");
        
        //crear un Book (creando también el autor en el construcor)
        Book libro2 = new Book("La Historia Interminable", new Author("Isabelle", 'f'), 20, 75);
        System.out.println(libro2);
        System.out.println(libro2.getNolakoa());
        System.out.println("");
        libro2.setHizkuntza(Hizkuntza.EU);
        libro2.argitaratu();
        System.out.println("----------------");
        
        //crear un Komikia (especificando un author (Author))
        Book kom1 = new Komikia(true, "Iron Man", javier, 4, 30);
        System.out.println(kom1.toString());
        System.out.println(kom1.getNolakoa());
        System.out.println("");
        kom1.setHizkuntza(Hizkuntza.EN);
        kom1.argitaratu();
        System.out.println("----------------");
        
        //System.out.println(getArgitaratutakoLiburuak());
        System.out.println("\nNúmero de libros publicados: " + Book.getArgitaratutakoLiburuak() + "\n");
        System.out.println("----------------");
        
        /*
        Crear un nuevo libro para hacer la comparación entre libros.
        */
        Book libro3 = new Book("El Agua Helada", javier, 35, 201);  //mismo nombre/título y genero que libro1
        
        if (libro1.equals(libro3)) {
            System.out.println("Los 2 libros son IGUALES. ");
        } else {
            System.out.println("Son DIFERENTES libros! ");
        }
        
    }
}
