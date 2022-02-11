/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.*;
import java.util.ArrayList;

/**
 *
 * @author arceredillo.adrian
 */
public class EpekakoErosketa extends Erosketa {
    
    private int epeak = 12;
    private boolean ordainketaBukatuta = false;
    private double kuota = 300;
    
    
    public double gainetikOrdainduBeharrekoa() {
        double epeGuztienTotala = this.epeak * this.kuota; //el total de lo que se pagará al final de todos los plazos (epeak)
        
        return this.guztira - epeGuztienTotala;
    }
    
    
    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, 
            ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, 
            double guztira, double kuota) {
        
        super(kodea, data, eroslea, produktuak, unitateak/*, guztira*/);
        this.kuota = kuota;
    }
    
}
