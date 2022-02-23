/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;

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
        System.out.println("----------------");
        
        //crear un Book (creando también el autor en el construcor)
        Book libro2 = new Book("La Historia Interminable", new Author("Isabelle", 'f'), 20, 75);
        System.out.println(libro2);
        System.out.println(libro2.getNolakoa());
        System.out.println("----------------");
        
        //crear un Komikia (especificando un author (Author))
        Book kom1 = new Komikia(true, "Iron Man", javier, 4, 30);
        System.out.println(kom1.toString());
        System.out.println(kom1.getNolakoa());
        
    }
}
