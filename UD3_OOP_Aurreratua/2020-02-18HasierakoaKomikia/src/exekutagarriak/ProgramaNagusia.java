package exekutagarriak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {

    }
    
    public static void jaiotzeDataBete(){
     
    }

    public static void inprimatu(){
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b:liburutegia){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();
       
    }

}
