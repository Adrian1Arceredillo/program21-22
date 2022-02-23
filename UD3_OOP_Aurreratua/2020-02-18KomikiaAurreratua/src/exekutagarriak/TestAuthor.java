/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;
import java.util.*;


/**
 *
 * @author AdriAlex
 */
public class TestAuthor {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //crear un autor y ver sus datos - (SIN birthday)
        Author autor1 = new Author("Jaime", 'm');
        autor1.setBirthday("2020-01-01");
        System.out.println(autor1.toString());
        System.out.println("----------------");
        
        //crear un autor (CON birthday)
        Author autor2 = new Author("Anne", 'f');
        System.out.println(autor2.toString());
        
        System.out.print("\nIntroduce la fecha de nacimiento del autor 2: (yyyy-mm-dd): ");
        String fechaAutorUser = in.next();
        
        autor2.setBirthday(fechaAutorUser);
        System.out.println("----------------");
        System.out.println("Nuevos Datos: ");
        System.out.println(autor2.toString());
        System.out.println("----------------");
        
        /*
        crear un tercer autor para hacer la comparación de autores mediante 
        el método "equals()"
        */
        Author autor3 = new Author("Jaime", 'm');   //mismo nombre y genero que autor1
        autor3.setBirthday("2020-01-01");   //asignarle birthday - igual que autor1
        System.out.println(autor3.toString());
        System.out.println("----------------");
        
        if (autor1.equals(autor3)) {
            System.out.println("Los 2 autores son iguales. ");
        } else {
            System.out.println("Son diferentes autores! ");
        }
        
    }
}
