/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.*;

/**
 *
 * @author arceredillo.adrian
 */
public class EpekakoErosketa extends Erosketa {
    
    private int epeak = 12;
    private boolean ordainketaBukatuta = false;
    private double kuota = 300;

    public EpekakoErosketa(String kodea, Bezeroa bezeroa, double guztira) {
        super(kodea, bezeroa, guztira);
    }
    
    
    public double gainetikOrdainduBeharrekoa() {
        return this.getGuztira() / (this.epeak * this.kuota);
    }
    
    
}
