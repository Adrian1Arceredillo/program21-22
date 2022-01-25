/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.lang.Object;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public final class Hitza extends java.lang.Object {

    //public static String[] palabras = {"casa", "perro", "helicoptero"};
    private char[] palabrasPosibles;
    //private final char[] palabrasPosibles = new char[3];

    private String hitza = getHitza();
    private String kategoria;
    private int erabilitakoAldiak;
    private char[] asmatutakoa;

    public Hitza() {
        this.hitzBatAukeratu();
        this.kategoria = kategoria;
        this.erabilitakoAldiak = 0;
        this.setAsmatutakoa(asmatutakoa);
    }

    public String getHitza() {
        return this.hitza;
    }

    public int getErabilitakoAldiak() {
        return erabilitakoAldiak;
    }

    public void setErabilitakoAldiak(int erabilitakoAldiak) {
        this.erabilitakoAldiak = erabilitakoAldiak;
    }
    
    

    public void setHitza(String hitzaBerria) {

        /*Random r = new Random();
        int n = r.nextInt(palabras.length);
        this.hitza = palabras[n];*/
        this.hitza = hitzaBerria;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public char[] getAsmatutakoa() {
        //char[] palabraGuiones = new char[hitza.length()];
        //asmatutakoa = palabraGuiones;
        return asmatutakoa;
    }
    
    public String getStrAsmatutakoa() {
        return new String (asmatutakoa);
    }

    public void setAsmatutakoa(char[] asmatutakoCharArraya) {
        /*Scanner in = new Scanner(System.in);
        char letraUser;
        char letraInput = in.next().charAt(0);*/

        asmatutakoCharArraya = new char[hitza.length()];
        for (int i = 0; i < asmatutakoCharArraya.length; ++i) {
            asmatutakoCharArraya[i] = '-';
        }

        this.asmatutakoa = asmatutakoCharArraya;
    }
    
    public boolean egiaztatu(char hizkia) {
        boolean encontrada = false;
        for (int i = 0; i < this.getHitza().length(); ++i) {
            if (hitza.charAt(i) == hizkia && hitza.charAt(i) != '-') {
                asmatutakoa[i] = hizkia;
                encontrada = true;
            }
        }
        return encontrada;
    }
    
    /*public boolean egiaztatu2(char hizkia) {
        for (int i = 0; i < this.getHitza().length(); ++i) {
            if (hitza.charAt(i) == hizkia && hitza.charAt(i) != '-') {
                asmatutakoa[i] = hizkia;
                return true;
            }
        }
        return false;
    }*/

    public void hitzBatAukeratu() {
        String[] palabras = {"casa", "perro", "helicoptero", "pinza", "violeta"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);

        this.hitza = palabras[n];
    }
    
    //creado por mi
    public static boolean hayGuiones(char[] arrayConGuiones) {
        for (int i = 0; i < arrayConGuiones.length; ++i) {
            if (arrayConGuiones[i] == '_') {
                return true;
            }
        }
        return false;
    }

}

/*
https://pablomonteserin.com/curso/java/juego-del-ahorcado/
 */
