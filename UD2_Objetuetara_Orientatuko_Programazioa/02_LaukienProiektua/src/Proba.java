/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Proba {

    public static void main(String[] args) {

        double zHamartarra;
        double zHamartarraTarte;
        int zOsoa;
        int numeroDado; //tiene que estar entre 1-6

        /*        
        zHamartarra = 48.7 % 10; //debug -> 8.700000000000003
        */
        
        zHamartarra = Math.random();    //debug -> primer paso = 0.8584437927780564
        zHamartarra = zHamartarra * 10; //debug -> segundo paso = 8.584437927780563
        zHamartarra = zHamartarra % 10; //debug -> tercer paso = 8.584437927780563
        
        
        //ejemplo:
        //¿Qué tendríamos que hacer para obtener un número aleatorio de una sola cifra?
        zOsoa = (int) zHamartarra; //de 0-9
        
        //ejemplo:
        //¿Qué tendríamos que hacer para obtener un número aleatorio que esté dentro de un determinado rango?
        //En este caso, el rango irá desde el 1 hasta el 6 (ambos incluidos)
        numeroDado =(int) (Math.random() * 6 + 1);
        
        
        System.out.println(numeroDado);
    }
}

//ejercicio de prueba para ver cómo funciona el concepto de crear un número de forma aleatorioa
