/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class TestProduktua {
    public static void main(String[] args) {
        
        //crear un nuevo Produktua
        Produktua p1 = new Produktua("S01", "Pionner DJM", 650);
        
        System.out.println(p1.toString());
        
    }
}
