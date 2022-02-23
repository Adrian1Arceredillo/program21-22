/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.*;
import model.*;

/**
 *
 * @author AdriAlex
 */
public class ProgramaNagusia {

    private static Author[] escritores = new Author[100];
    private static ArrayList<Book> biblioteca = new ArrayList<>();

    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        imprimatu();
    }

    /**
     * Método que creará y guardará (según se ejecute el programa) los datos que
     * nosotros le digamos. En este caso, los libros (Book/Komikia) y los
     * autores (Author) que creemos.
     *
     */
    public static void initialize() {
        Author rowling = new Author("J.K.Rowling", 'f');
        escritores[0] = rowling;
        biblioteca.add(new Book("Harry Potter", rowling, 99.99, 2850));

        Author cris = new Author("Agatha Christie", 'f');
        escritores[1] = cris;
        biblioteca.add(new Book("Asesinato en el Oriente Express", cris, 9.95, 275));
        biblioteca.add(new Book("Muerte en el Nilo", cris, 9.95, 300));
        biblioteca.add(new Book("10 negritos", cris, 9.95, 325));

        Author ibanez = new Author("Francisco Ibañez", 'm');
        escritores[2] = ibanez;
        biblioteca.add(new Komikia(true, "Mortadelo y Filemon", ibanez, 19.95, 75));

        Author atwood = new Author("Margaret Atwood", 'f');
        escritores[3] = atwood;

        biblioteca.add(new Book("El cuento de la criada", atwood, 24.95, 410));
        biblioteca.add(new Book("Cat's eye", atwood, 6.95, 78));

        Author satrapi = new Author("Marjane Satrapi", 'f');
        escritores[4] = satrapi;

        biblioteca.add(new Komikia(true, " Persepolis", satrapi, 19.95, 75));

        Author landa = new Author("Mariasun Landa", 'f');
        escritores[5] = landa;

        biblioteca.add(new Book("Azken Balada", landa, 10.95, 225));

        Author lee = new Author("Harper Lee", 'f');
        escritores[6] = lee;

        biblioteca.add(new Book("Matar a un ruiseñor", lee, 15.95, 450));

        Author mary = new Author("Mary Shelley", 'f');
        escritores[7] = mary;

        biblioteca.add(new Book("Frankesnstein", mary, 19.95, 300));

    }
    
    /**
     * Método para buscar un Author que elija el usuario, y establecerle un 
     * valor para su atributo "birthday". 
     * 
     */
    public static void jaiotzeDataBete() {
        System.out.println("Todos los escritores: \n[");
        for (int i = 0; i < escritores.length; ++i) {
            if (escritores[i] != null) {
                System.out.println(escritores[i]);                
            }
        }
        System.out.println("]");
        
        try {

            System.out.print("\nA qué escritor le quieres poner una fecha de nacimiento (introduce la posición): ");
            Scanner in = new Scanner(System.in);
            int pos = in.nextInt() - 1;
            System.out.print("Sartu " + escritores[pos].getNombre() + " idazlearen jaiotze data (yyyy-mm-dd): ");

            escritores[pos].setBirthday(in.next());
            System.out.println("\nLa fecha se ha guardado correctamente. ");
        } catch (Exception ex) {
            System.out.println("Data okerra.");
            System.out.println("Otra vez será. ");

        }

        System.out.println("");
    }
    
    public static void imprimatu() {
        for (int i = 0; i < biblioteca.size(); ++i) {
            System.out.println(biblioteca.get(i));
        }
    }
}
