/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.*;
import java.util.*;

/**
 *
 * @author arceredillo.adrian
 */
public class Produktua extends Erosketa {
    
    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(String kodea, String data, Bezeroa eroslea, 
            ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira,
            String izena, double prezioa) {
        
        super(kodea, data, eroslea, produktuak, unitateak, guztira);
        
        this.izena = izena;
        this.prezioa = prezioa;
    }

    
    
    
}
