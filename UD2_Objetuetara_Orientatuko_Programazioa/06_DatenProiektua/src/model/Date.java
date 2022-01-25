/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Formatter;

/**
 *
 * @author arceredillo.adrian
 */
public class Date {

    private int day; // [1, 31]
    private int month;  //[1, 12]
    private int year;   //[1900, 9999]

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int nuevoDia) {
        this.day = nuevoDia;
    }

    public void setMonth(int nuevoMes) {
        this.month = nuevoMes;
    }

    public void setYear(int nuevoUrtea) {
        this.year = nuevoUrtea;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return String.format("%4d/%02d/%02d", this.getYear(), this.getMonth(), this.getDay());
        //return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }

    public String getHilabeteaLetretan() {
        String zeinHilabete = "";
        String[] hilabeteak = {"Urtarrila",
            "Otsaila",
            "Martxoa",
            "Apirila",
            "Maiatza",
            "Ekaina",
            "Uztaila",
            "Abuztua",
            "Iraila",
            "Urria",
            "Azaroa",
            "Abendua"};

        for (int i = 0; i < hilabeteak.length; ++i) {
            if (this.getMonth() == i + 1) {
                zeinHilabete = hilabeteak[i];
            }
        }

        return zeinHilabete;
    }

    public String getHilabeteaLetretan(String hizkuntza) {

        String euskara = "EU";
        String gaztelera = "ES";
        String ingles = "EN";
        String eskaturikoHilabetea = "";

        String[][] hilabeteGuztiak = {
            {"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"},
            {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"},
            {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}
        };
        if (hizkuntza.equals(euskara)) {
            for (int i = 0; i < hilabeteGuztiak.length; ++i) {
                for (int j = 0; j < hilabeteGuztiak[i].length; ++j) {
                    if (this.getMonth() == j + 1) {
                        eskaturikoHilabetea = hilabeteGuztiak[0][j];
                    }  
                }
            }
        } else if (hizkuntza.equals(gaztelera)) {
            for (int i = 0; i < hilabeteGuztiak.length; ++i) {
                for (int j = 0; j < hilabeteGuztiak[i].length; ++j) {
                    if (this.getMonth() == j + 1) {
                        eskaturikoHilabetea = hilabeteGuztiak[1][j];
                    }  
                }
            }
        } else if (hizkuntza.equals(ingles)) {
            for (int i = 0; i < hilabeteGuztiak.length; ++i) {
                for (int j = 0; j < hilabeteGuztiak[i].length; ++j) {
                    if (this.getMonth() == j + 1) {
                        eskaturikoHilabetea = hilabeteGuztiak[2][j];
                    }  
                }
            }
        }

        /*if (hizkuntza.equals(gaztelera)) {
            for (int i = 0; i < hilabeteGuztiak.length; ++i) {
                for (int j = 0; j < hilabeteGuztiak[i].length; ++j) {
                    if (this.getMonth() == j + 1) {
                        eskaturikoHilabetea = hilabeteGuztiak[i][j];
                    }
                }
            }
        }*/
        return eskaturikoHilabetea;

    }

}

/*
Array bidimensionales:
https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=569:matrices-array-arreglo-multidimensional-php-arrays-anidados-concepto-ejemplos-y-ejercicios-cu00824b&catid=70&Itemid=193
https://tutobasico.com/multidimensionales-javascript/
 */
