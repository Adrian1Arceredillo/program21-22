/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author arceredillo.adrian
 */
public class Kutxa extends Laukizuzena implements Marrazgarria {
    
    private int altuera;
    
    
    public Kutxa(Puntua erpina, Puntua kontrakoErpina, int altuera) {
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
    }
    
    public int getAltuera() {
        return altuera;
    }
    
    public boolean isHandiagoa(Kutxa besteKutxaBat) {
        
        //calcular volumen del primer Kutxa ("this")
        int aT = this.getKontrakoErpina().getX() - super.getErpinBat().getX();
        int bT = super.getKontrakoErpina().getY() - super.getErpinBat().getY();
        int cT = this.getAltuera();
        
        int volumenThis = aT * bT * cT;
        
        //calcular volumen del OTRO Kutxa (besteKutxaBat)
        int aO = besteKutxaBat.getKontrakoErpina().getX() - besteKutxaBat.getErpinBat().getX();
        int bO = besteKutxaBat.getKontrakoErpina().getY() - besteKutxaBat.getErpinBat().getY();
        int cO = besteKutxaBat.getAltuera();
        
        int volumenBesteKutxa = aO * bO * cO;
        
        //comparar ambos volúmenes
        if (volumenThis > volumenBesteKutxa) {
            return true;
        }
        
        return false;
    }
    
    
    @Override
    public void marraztu() {
        System.out.println("Oinarria: " + Arrays.toString(this.getLauErpinenArraya()) + 
                " eta altuera: " + this.getAltuera() + 
                " dituen kutxa GUI baten marraztua izan da. ");
    }
    
    
    /**
     * Método creado para hacer pruebas con los interfaces gráficos. Es 
     * decir, ESTE MÉTODO NO FORMA PARTE DEL EXAMEN. 
     * 
     * Se trata de un método adicional. 
     * @param g 
     */
    public void marraztu(Graphics g) {
        g.setColor(Color.black);
        //Laukia inferior
        g.drawLine(super.getErpinBat().getX(), super.getErpinBat().getY(), super.getKontrakoErpina().getX(), super.getErpinBat().getY());
        g.drawLine(super.getKontrakoErpina().getX(), super.getErpinBat().getY(), super.getKontrakoErpina().getX()+15, super.getKontrakoErpina().getY());
        g.drawLine(super.getKontrakoErpina().getX()+15, super.getKontrakoErpina().getY(), super.getErpinBat().getX()+15, super.getKontrakoErpina().getY());
        g.drawLine(super.getErpinBat().getX()+15, super.getKontrakoErpina().getY(), super.getErpinBat().getX(), super.getErpinBat().getY());
        //Altura
        g.drawLine(super.getErpinBat().getX(), super.getErpinBat().getY(),super.getErpinBat().getX(),super.getErpinBat().getY()-(altuera*10));
        g.drawLine(super.getKontrakoErpina().getX(), super.getErpinBat().getY(),super.getKontrakoErpina().getX(),super.getErpinBat().getY()-(altuera*10));
        g.drawLine(super.getKontrakoErpina().getX()+15, super.getKontrakoErpina().getY(),super.getKontrakoErpina().getX()+15,super.getKontrakoErpina().getY()-(altuera*10));
        g.drawLine(super.getErpinBat().getX()+15, super.getKontrakoErpina().getY(),super.getErpinBat().getX()+15,super.getKontrakoErpina().getY()-(altuera*10));
        //Laukia superior
        g.drawLine(super.getErpinBat().getX(), super.getErpinBat().getY()-(altuera*10), super.getKontrakoErpina().getX(), super.getErpinBat().getY()-(altuera*10));
        g.drawLine(super.getKontrakoErpina().getX(), super.getErpinBat().getY()-(altuera*10), super.getKontrakoErpina().getX()+15, super.getKontrakoErpina().getY()-(altuera*10));
        g.drawLine(super.getKontrakoErpina().getX()+15, super.getKontrakoErpina().getY()-(altuera*10), super.getErpinBat().getX()+15, super.getKontrakoErpina().getY()-(altuera*10));
        g.drawLine(super.getErpinBat().getX()+15, super.getKontrakoErpina().getY()-(altuera*10), super.getErpinBat().getX(), super.getErpinBat().getY()-(altuera*10));
    }
    
    
    /**
     * Método que devuelve la longitud tanto de la base del Laukizuzena como 
     * del lado del mismo. Se calcula haciendo la diferencia entre ambos valores 
     * de X (kontrakoErpina - erpinBat) para la base; y lo mismo con los valores 
     * de Y (kontrakoErpina - erpinBat) para el lado del Laukizuzena. 
     * 
     * Los resultados de ambas diferencias se guardarán en un array (int[])
     * 
     * @return 
     */
    public int[] getErtzenLuzera() {
        int[] ertzenLuzera = new int[2];
        ertzenLuzera[0] = super.getKontrakoErpina().getX() - super.getErpinBat().getX();
        ertzenLuzera[1] = super.getKontrakoErpina().getY() - super.getErpinBat().getY();
        
        return ertzenLuzera;
    }
    
    /**
     * Método para calcular el volumen de las Kutxa.
     * @return 
     */
    public int getBolumena() {
        int aT = this.getKontrakoErpina().getX() - super.getErpinBat().getX();
        int bT = super.getKontrakoErpina().getY() - super.getErpinBat().getY();
        int cT = this.getAltuera();
        
        int volumenThis = aT * bT * cT;
        
        return volumenThis;
    }
    
    /**
     * Método para conocer cuál de todas las Kutxa de una lista/array es 
     * la más grande. Para conocer la más grande, se hará una comparación 
     * de todos los volúmenes. 
     * 
     * @return 
     */
    public static Kutxa handiena(ArrayList<Kutxa> kutxenLista) {
        Kutxa kutxaHandiena = kutxenLista.get(0);
        
        for (int i = 0; i < kutxenLista.size(); ++i) {
            if (kutxenLista.get(i).getBolumena() > kutxaHandiena.getBolumena()) {
                kutxaHandiena = kutxenLista.get(i);
            }
        }
        
        return kutxaHandiena;
    }
    
}
