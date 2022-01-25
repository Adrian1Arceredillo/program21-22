/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Arrays;
import model.Zatikia;

/**
 *
 * @author arceredillo.adrian
 */
public class Langilea {

    private int id = 0;
    private String izena;
    private String abizena;
    private double soldata;
    private Zatikia lanaldia;
    
    private LocalDate diacomienzo;

    /**
     * Este constructor nos permite crear un objeto nuevo (de clase
     * Langilea).Para ello, tendremos que especificarle los siguientes
     * valores/parámetros.
     *
     * @param id
     * @param izena
     * @param abizena
     * @param soldata
     * @param lanaldia
     */
    public Langilea(int id, String izena, String abizena, double soldata, String fechaComienzo) {
        this.id = ++id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
        this.lanaldia = lanaldia;
        this.lanaldia = new Zatikia();
        this.diacomienzo = LocalDate.parse(fechaComienzo);
    }

    public Langilea(int id) {
        this.id = id;
        this.getIzenOsoa();
        this.soldata = 0;
    }
    
    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getIzenOsoa() {
        return this.izena + " " + this.abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public double getUrtekoSoldata() {
        return soldata * 12;
    }

    //-----------------------------------------------------------
    //-----------------------------------------------------------
    public Zatikia getLanaldia() {
        return this.lanaldia;
    }

    public Zatikia setLanaldia(Zatikia lanaldia) {
        //this.lanaldia = lanaldia;

        if (lanaldia.hamartarBaliokidea() > new Zatikia().hamartarBaliokidea()) {
            this.lanaldia = new Zatikia();
        } else {
            this.lanaldia = lanaldia;
        }
        return lanaldia;

    }

    public LocalDate getDiacomienzo() {
        return diacomienzo;
    }

    public String toStringLanaldia() {
        return "[" + lanaldia.getZenbakitzailea() + "/" + lanaldia.getIzendatzailea() + "]";
    }

    //-----------------------------------------------------------
    //-----------------------------------------------------------
    /**
     * Imprimir los datos del objeto en un String con forma de array.
     *
     * @return
     */
    public String toString() {
        return "Langile[id = " + this.id + ", izena = " + this.getIzenOsoa() + ", soldata = " + this.soldata + ", lanaldia = " + this.lanaldia + ", comienzo =" + this.diacomienzo+ "]\n";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    /**
     * Este setter nos permite establecer un nuevo valord de "soldata"; y por lo
     * tanto, sustituir el anterior, por el que nosotros especifiquemos
     *
     * @param soldata
     */
    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    /**
     * Este método nos da la opción de incrementar un X porcentaje el valor de
     * "soldata" Dicho porcentaje será el valor/parámetro que nosotros
     * especifiquemos
     *
     * @param portzentaia
     * @return
     */
    public double soldataIgo(int portzentaia) {
        //double salarioBase = soldata;
        //double nuevoPrecio = soldata;
        //nuevoPrecio = salarioBase + ((soldata * portzentaia) / 100);
        this.soldata = soldata + ((soldata * portzentaia) / 100);
        return 0;
    }

    public static Langilea[] nireHamarLagunLangile() {

        int maxLangile = 10; //número máximo de objetos (Langile) que tendrá el array (langileak)
        Langilea[] langileak = new Langilea[maxLangile];

        for (int i = 0; i < 7; ++i) {       //aquí le digo que haga solamente 7 elementos, para que al ejecutar el Menu, si le doy a crear un langile nuevo, tenga que comprobar

            if (i == 5) {
                langileak[i] = new Langilea(i, "Juan", "Lopez", 16, "2021-10-08");
            } else {
                langileak[i] = new Langilea(i, "Adri", "Pepe" + i, 2, "2017-04-14");
            }
            //++id;
            //System.out.println(langileak[i]);
        }
        return langileak;
    }

    public Zatikia lanaldiaZatitu() {
        this.setLanaldia(new Zatikia(
                this.lanaldia.getZenbakitzailea(),
                this.lanaldia.getIzendatzailea() * 2)
        );
        return null;

    }
    
}

//https://devs4j.com/2018/10/30/java-8-manejo-de-fechas-y-tiempo-localdate-localtime-y-localdatetime/
//http://recursostic.educacion.es/descartes/web/materiales_didacticos/Fracciones_y_porcentajes/porcentajes4.htm
//https://www.discoduroderoer.es/funcion-tostring-para-clases-en-java/
