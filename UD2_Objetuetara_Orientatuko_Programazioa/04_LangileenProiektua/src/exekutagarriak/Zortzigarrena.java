/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Arrays;
import java.util.Scanner;
import model.Langilea;
import model.Zatikia;

/**
 *
 * @author AdriAlex
 */
public class Zortzigarrena {

    private static Langilea[] langileak = new Langilea[10];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ejer 8 - Apartado a)
        //CLangileen array bat sortu nireHamarLagunLangile metodoari deituta.
        System.out.println("Array-aren sorkuntza:");
        System.out.println("");
        langileak = Langilea.nireHamarLagunLangile();

        System.out.println(Arrays.toString(langileak));
        System.out.println("");

        //Ejer 8 - Apartado b)
        //Lehenengo eta azken langileen lanaldiak erdira murriztu.
        //para el primer elemento y para el último, establecer un valor de "lanaldia" de "2/6".
        System.out.println("Lehenengo eta azkenengo langileen lanaldia, erdira zatitu. ");
        System.out.println("");
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                langileak[i].setLanaldia(new Zatikia(4, 6));
                break;
            }

        }

        for (int i = langileak.length - 1; i >= 0; --i) {
            if (langileak[i] != null) {
                langileak[i].setLanaldia(new Zatikia(4, 6));
                break;
            }
        }

        //langileak[0].setLanaldia(new Zatikia(4, 6));
        //langileak[langileak.length - 1].setLanaldia(new Zatikia(4, 6));
        //para esos dos elementos (primero y último), dividir "lanaldia" entre 2.
        //a)  modificar el primero
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) { // si está ocupado...
                langileak[i].lanaldiaZatitu(); //modificar el valor a la mitad
                break; //salimos depué de encontrar el primero
            }
        }
        //b) modificar el último
        for (int i = (langileak.length - 1); i >= 0; --i) {
            if (langileak[i] != null) { // si está ocupado ...
                langileak[i].lanaldiaZatitu();
                break;
            }
        }
        System.out.println(Arrays.toString(langileak));

        //Ejer 8 - Apartado c)
        // Suposatuz lanaldi osoko langile batek astero 35 ordu lan egiten dituela, inprimatu honelako mezua: "Enpresan guztira astero X orduko lana egiten da" ( emandako datuekin: 315 ordu)
        int trabajadoresCompletos = 0;  //trabajadores que hacen jornada completa
        int trabajadoresParciales = 0;  //número de trabajadores que no tienen un lanaldia de 1/1
        
        int horasSemanaTraCompleto = 35;  //número de horas que mete A LA SEMANA cada trabajor a jornada compelta (lanaldia = 1/1)   

        for (int i = 0; i < langileak.length; ++i) { 
            if (langileak[i] != null) {
                if (langileak[i].getLanaldia().hamartarBaliokidea() == 1) {     //obtener el número de trabajadores COMPLETOS; es decir, lanaldi = 1/1
                    ++trabajadoresCompletos;
                } else if (langileak[i].getLanaldia().hamartarBaliokidea() < 1) {   //obtener el número de trabajadores PARCIALES; es decir, lanaldi < 1/1
                    ++trabajadoresParciales;
                }
            }

        }
        System.out.println("");
        System.out.println("Hay " + trabajadoresCompletos + " trabajadores a jornada completa. ");
        System.out.println("Hay " + trabajadoresParciales + " trabajadores a jornada reducida/parcial. ");
        
        double totalHorasDeLaEmpresa = 0;   //número total de horas que se trabaja en la empresa (todos los trabajadores).
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getLanaldia().hamartarBaliokidea() == 1) {
                    totalHorasDeLaEmpresa = totalHorasDeLaEmpresa + 35;
                } else if (langileak[i].getLanaldia().hamartarBaliokidea() < 1) {
                    totalHorasDeLaEmpresa = totalHorasDeLaEmpresa + (horasSemanaTraCompleto * langileak[i].getLanaldia().hamartarBaliokidea());
                }
            }

        }
        System.out.println("");
        System.out.printf("En la empresa se trabaja un total de %.2f horas. \n", totalHorasDeLaEmpresa);

    }

    public static void lanaldiarenZatiketa() {
        //a)  modificar el primero
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) { // si está ocupado...
                langileak[i].lanaldiaZatitu(); //modificar el valor a la mitad
                break; //salimos depué de encontrar el primero
            }
        }
        //b) modificar el último
        for (int i = (langileak.length - 1); i >= 0; --i) {
            if (langileak[i] != null) { // si está ocupado ...
                langileak[i].lanaldiaZatitu();
                break;
            }
        }

    }

}
