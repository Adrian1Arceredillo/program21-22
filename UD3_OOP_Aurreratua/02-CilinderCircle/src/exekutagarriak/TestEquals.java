/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import model.*;
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class TestEquals {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(2, "beltza");
        Circle c2 = new Circle(2, "beltza");
        
        if(c1.equals(c2)) {
            System.out.println("Son iguales. ");
        }
        
        
    }
}
