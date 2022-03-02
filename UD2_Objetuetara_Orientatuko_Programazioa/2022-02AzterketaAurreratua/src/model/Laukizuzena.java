/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class Laukizuzena implements Marrazgarria {
    
    private Puntua erpinBat;
    private Puntua kontrakoErpina;
    
    
    public Laukizuzena(Puntua erpina, Puntua kontrakoErpina) {
        this.erpinBat = erpina;
        this.kontrakoErpina = kontrakoErpina;
        
    }
    
    public Laukizuzena(int x1, int y1, int x2, int y2) {
        erpinBat = new Puntua(x1, y1);
        kontrakoErpina = new Puntua(x2, y2);
        
    }
    
    public Puntua getErpinBat() {
        return erpinBat;
    }
    
    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }
    
    
    public Puntua[] getLauErpinenArraya() {
        Puntua[] lauErpinak = new Puntua[4];
        lauErpinak[0] = this.erpinBat;
        lauErpinak[1] = new Puntua(this.kontrakoErpina.getX(), this.erpinBat.getY());
        lauErpinak[2] = this.kontrakoErpina;
        lauErpinak[3] = new Puntua(this.erpinBat.getX(), this.kontrakoErpina.getY());
        
        return lauErpinak;
    }
    
    
    public ArrayList<Puntua> getLauErpinenArrayLista() {
        ArrayList<Puntua> erpinenLista = new ArrayList<>();
        erpinenLista.add(this.erpinBat);
        erpinenLista.add(new Puntua(this.kontrakoErpina.getX(), this.erpinBat.getY()));
        erpinenLista.add(this.kontrakoErpina);
        erpinenLista.add(new Puntua(this.erpinBat.getX(), this.kontrakoErpina.getY()));
        
        return erpinenLista;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(this.getLauErpinenArraya());
    }

    @Override
    public void marraztu() {
        
    }
    
    /**
     * Método ADICIONAL AL EXAMEN, que nos indica si un punto que 
     * nosotros especifiquemos, está o no dentro del rectángulo. 
     * 
     * Para saber si un punto está dentro del Laukizuzena, se 
     * comprobará si la X del punto está dentro de los valores 
     * de X del Laukizuzena; se hará lo mismo con la Y. 
     * 
     * @return 
     */
    public boolean isInside(Puntua bestePuntuBat) {
        if ((bestePuntuBat.getX() > this.erpinBat.getX() &&    //comprobar X
                bestePuntuBat.getX() < this.kontrakoErpina.getX())
                &&
                (bestePuntuBat.getY() > this.erpinBat.getY() && //comprobar Y 
                bestePuntuBat.getY() < this.kontrakoErpina.getY())) {
            return true;
        }
        return false;
    }
    
    
}
