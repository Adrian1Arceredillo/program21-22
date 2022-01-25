/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Arrays;
import java.util.Scanner;
import model.Langilea;

/**
 *
 * @author arceredillo.adrian
 */
public class NiLangile {

    private static Langilea[] langileak = new Langilea[10];

    public static void main(String[] args) {

        String langileIzena = "";

        Scanner in = new Scanner(System.in);

        //moodle - Ejer 2.Apartado 1 y 2 -> crear un objeto con mi nombre y apellido, e imprimir el objeto con el método toString()
        System.out.println("----Ejer 1, 2----");
        Langilea yo = new Langilea(1, "Adrian", "Arceredillo", 600, "2021-10-08");    //System.out.printf("%.2f\n", yo.getSoldata());
        System.out.println(yo.toString());
        //moodle - Ejer 2. Apartado 3 y 4 -> incrementar un %50 el valor de soldata, y volver a imprimir los datos del langile
        yo.soldataIgo(50);
        System.out.println(yo.toString());

        //Ejer 11 - Apartado 1 -> NiLangilea.java programan, %50eko soldata igoeraren ostean bigarren igoera aplikatu, baina oraingoan igoeraren portzentaia erabiltzaileari eskatuz. Zenbaki osoa sartzen ez badu ez zaio igoera aplikatuko.
        System.out.println("----Ejer 11. Parte 1----");
        System.out.print("Zenbateko igoera nahi duzu? ");
        String valorPorcentaje = in.next(); // definir un string y asignarle un valor por teclado
        int valorNumericoPorcentaje;

        try {
            valorNumericoPorcentaje = Integer.parseInt(valorPorcentaje);
        } catch (NumberFormatException e) {
            System.out.println("Igoera gabe gelditu zara balio okerra sartzearren. ");
            valorNumericoPorcentaje = 0;
        }

        if (valorPorcentaje.charAt(0) == '-') {
            System.out.println("Igoera gabe gelditu zara balio okerra sartzearren. \n");
        } else if (valorNumericoPorcentaje > 0) {
            yo.soldataIgo(valorNumericoPorcentaje);
            System.out.println(yo.toString());
        } else if (valorNumericoPorcentaje == 0) {
            System.out.println("a");
            yo.soldataIgo(valorNumericoPorcentaje);
            System.out.println(yo.toString());
        }

        //Ejer 11 - Apartado 2 -> NiLangilea.java programan, %50eko soldata igoeraren ostean bigarren igoera aplikatu, baina oraingoan igoeraren portzentaia erabiltzaileari eskatuz. Zenbaki osoa sartzen ez badu ez zaio igoera aplikatuko.
        System.out.println("----Ejer 11. Parte 2----");
        String terceraSubidaPorcentaje = "";
        int valorNumericoTercera;
        int contNegativos = 0;
        do {
            System.out.print("Hirugarren igoera:? ");
            terceraSubidaPorcentaje = in.next(); // definir un string y asignarle un valor por teclado
            try {
                valorNumericoTercera = Integer.parseInt(terceraSubidaPorcentaje);
                if (valorNumericoTercera < 0) {
                    //++contNegativos;
                    System.out.println("Datua txarto sartuta dagoenez, %10 jaitsiera aplikatuko da.  \n");
                    yo.soldataIgo(-10);
                    System.out.println(yo.toString());
                }
                if (valorNumericoTercera == 0) {
                    System.out.println("Soldataren balioa ez da aldatu. ");
                    yo.soldataIgo(valorNumericoTercera);
                    System.out.println(yo.toString());
                }

            } catch (NumberFormatException e) {
                System.out.println("Datua txarto sartuta dagoenez, %10 jaitsiera aplikatuko da. ");
                valorNumericoTercera = -10;
                yo.soldataIgo(-10);
                System.out.println(yo.toString());
            } catch (Exception e) {
                System.out.println("El numero es negativo. ");
                valorNumericoTercera = -10;
                yo.soldataIgo(-10);
                System.out.println(yo.toString());
            }

        } while (valorNumericoTercera < 1 || terceraSubidaPorcentaje.charAt(0) == '-');

        if (terceraSubidaPorcentaje.charAt(0) == '-') {
            System.out.println("Datua txarto sartuta dagoenez, %10 jaitsiera aplikatuko da.  \n");
            valorNumericoTercera = -10;
            System.out.println(valorNumericoTercera);
            yo.soldataIgo(valorNumericoTercera);
            System.out.println(yo.toString());
        } else if (valorNumericoTercera > 0) {
            yo.soldataIgo(valorNumericoTercera);
            System.out.println(yo.toString());
        } else if (valorNumericoTercera == -10) {
            System.out.println("a");
            yo.soldataIgo(valorNumericoTercera);
            System.out.println(yo.toString());
        } else if (valorNumericoTercera == 0) {
            yo.soldataIgo(valorNumericoTercera);
            System.out.println(yo.toString());
        }

        //moodle - Ejer 3 -> crear un array de 10 elementos (Langilea)
        langileak = Langilea.nireHamarLagunLangile();
        System.out.println("----Ejer 3----");
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(langileak));
        System.out.println("-------------------------------------------------");

        //Ejer 4 -> bilatu metodoa: Hau ere estatikoa. Langile baten izena eta langileen array bat jaso eta Langilea bueltatuko du. Aurkitzen ez badu, null bueltatuko du.
        // Comprobacion método bilatu
        System.out.println("----Ejer 4----");
        System.out.print("Sartu langile baten izena: ");
        langileIzena = in.next();
        System.out.println(bilatu(langileIzena, langileak));

        //Ejer 5 -> bilatu metodoa. Metodo honek edozein eremutatik bilatuko du. Horretarako beste parametro bat izago du String motakoa. Bertan, bilaketa eremuaren izena jasoko dugu.
        System.out.println("----Ejer 5----");
        System.out.print("Nombre de campo (id, izena, abizena, soldata):");
        String campoArray = in.next();
        System.out.print("Valor del campo: ");
        String valorCampo = in.next();
        System.out.println("");

        System.out.println(bilatu(campoArray, valorCampo, langileak));

    }

    public static Langilea bilatu(String nombreLangile, Langilea[] trabajadores) {

        for (int i = 0; i < trabajadores.length; ++i) {

            if (trabajadores[i] != null) {
                if (trabajadores[i].getIzena().equals(nombreLangile) == true) {
                    return trabajadores[i]; //Sale al encontrar el primero de ellos que cumple la condición
                }
            }
        }
        // si no lo ha encontrado
        return null;
    }

    public static Langilea bilatu(String nombreDeCampo,
            String valordeCampo,
            Langilea[] trabajadores) {

        if (nombreDeCampo.equals("izena") == true) {
            //buscar coincidencias con la propiedad izena

            for (int i = 0; i < trabajadores.length; ++i) {
                if (langileak[i] != null) {
                    if (trabajadores[i].getIzena().equals(valordeCampo) == true) {
                        return trabajadores[i];
                    }
                }
            }
            // si no lo ha encontrado
            return null;

        } else if (nombreDeCampo.equals("abizena") == true) {
            //buscar por abizena

            for (int i = 0; i < trabajadores.length; ++i) {
                if (langileak[i] != null) {
                    if (trabajadores[i].getAbizena().equals(valordeCampo) == true) {
                        return trabajadores[i];
                    }
                }
            }
            // si no lo ha encontrado
            return null;

        } else if (nombreDeCampo.equals("id") == true) {
            //buscar por id

            int miId = Integer.valueOf(valordeCampo); //convierte en INT lo que se mete en modo string
            for (int i = 0; i < trabajadores.length; ++i) {
                if (langileak[i] != null) {
                    if (trabajadores[i].getId() == miId) {
                        return trabajadores[i];
                    }
                }
            }
            // si no lo ha encontrado
            return null;

        } else if (nombreDeCampo.equals("soldata") == true) {
            //buscar por soldata

            double miSoldata = Double.valueOf(valordeCampo); //convierte en DOUBLE lo que se mete en modo string
            for (int i = 0; i < trabajadores.length; ++i) {
                if (langileak[i] != null) {
                    if (trabajadores[i].getSoldata() == miSoldata) {
                        return trabajadores[i];
                    }
                }
            }
            // si no lo ha encontrado
            return null;
        }
        return null;
    }

}

//https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String)
//https://www.discoduroderoer.es/funcion-tostring-para-clases-en-java/
