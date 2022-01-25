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
public class Seigarrena {

    private static Langilea[] langileak = new Langilea[10];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ejer 6 - Apartado a)
        langileak = Langilea.nireHamarLagunLangile();

        //Ejer 6 - Apartado b)
        imprimatu();

        //Ejer 6 - Apartados c, d
        System.out.println("");
        System.out.println("Zein izen nahi duzu bilatu?");
        String buscarNombre = in.next();

        System.out.println(izenaEskatu(buscarNombre));

        //Ejer 6 - Apartados e) y f)
        System.out.println("Zenbateraino nahi duzu soldata igo? ");
        double subirSalario = in.nextDouble();
        for (int i = 0; i < langileak.length; ++i) {
            soldataBerria(subirSalario);
        }
        imprimatu();

        //Ejer 6 - Apartados g)
        System.out.println("\nEnpresak ordaindu behar duen dirua = " + gastosEmpresaSoldata());

        //Ejer 6 - Apartado h)
        System.out.println("Soldata handiena = " + soldataHandiena());

        //Ejer 7 ------------------------------------ 
        //Solo un elemento ->comprobar si "lanaldia" cumple las condiciones requeridas
        Langilea uno = new Langilea(1, "nombre", "apellido", 2, "2021-10-08");
        if (konprobatuLanaldia(uno.getLanaldia()) == true) {
            uno.setLanaldia(new Zatikia(1, 1));
            System.out.println("Behin lanaldia modifikatuta: " + uno.toString());
        } else {
            System.out.println(uno.getLanaldia());
        }

        //Ejer 7 ------------------------------------ 
        //Todo el array -> utilizando solamente el setter, comprobar si el valor introducido de "lanaldia" es correcto.
        imprimatu();
        System.out.println("Introduce el id de un trabajador para cambiar su jornada:");
        int idLangile = in.nextInt();
        System.out.print("Sartu lanaldi berriaren balioa (x/x): ");
        String nuevaJornadaValor = in.next();   //strin que meteremos por teclado, y que gracias al siguiente método, se convertirá en un objeto de tipo Zatikia
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getId() == (idLangile)) {
                    langileak[i].setLanaldia(new Zatikia(nuevaJornadaValor)); //Sale al encontrar el primero de ellos que cumple la condición
                    System.out.println(langileak[i]);
                }
            }

        }
        imprimatu();

        /*Utilizando el método "lanaldiBerria"
        System.out.println("Introduce el id de un trabajador para cambiar su jornada:");
        int idLangile = in.nextInt();
        
        System.out.println(lanaldiBerria(idLangile, langileak));
        imprimatu();*/
    }

    public static void imprimatu() {
        System.out.println("");
        System.out.printf("%-15s %-15s  %-8s \n", "Id-a", "Izena Abizena", "Soldata");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] == null) { //esto hace que aunque un elemento del array sea nulo (no tiene ningún objeto), se muestre null (o lo que nosotros queramos que muestre)
                System.out.println("\tPuesto libre. ");
            } else {
                System.out.printf("\t%d \t%s \t%.2f \t%s \n", langileak[i].getId(), langileak[i].getIzenOsoa(), langileak[i].getSoldata(), langileak[i].toStringLanaldia());
            }
        }
    }

    public static Langilea izenaEskatu(String izenaSartu) {

        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getIzena().equals(izenaSartu) == true) {
                    return langileak[i];
                }
            }
        }
        return null;
    }

    public static void soldataBerria(double nuevoSueldo) {

        for (int i = 0; i <= langileak.length - 1; ++i) {
            if (langileak[i] != null) {
                if (i == 5) {
                    langileak[i].setSoldata(9.2);
                } else {
                    langileak[i].setSoldata(nuevoSueldo);
                }
            }
        }
    }

    public static double gastosEmpresaSoldata() {

        double gastosEnSalarios = 0;
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                gastosEnSalarios = gastosEnSalarios + langileak[i].getUrtekoSoldata();
            }
        }
        return gastosEnSalarios;
    }

    public static Langilea soldataHandiena() {

        double salMaximo = 0.0;
        int posMax = -1;

        //Langilea mayorSalario = langileak[0];
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getSoldata() >= salMaximo) {
                    salMaximo = langileak[i].getSoldata();
                    posMax = i;
                }
            }
        }

        if (posMax == -1) {  // no he encontrado ningun elemento lleno
            return null;
        } else {
            return langileak[posMax];
        }
    }

    public static boolean konprobatuLanaldia(Zatikia jornada) {
        if (jornada.hamartarBaliokidea() >= 1) {
            return true;
        }
        return false;
    }

    public static Langilea lanaldiBerria(int numeroId, Langilea[] trabajadores) {

        for (int i = 0; i < trabajadores.length; ++i) {
            if (langileak[i] != null) {
                if (trabajadores[i].getId() == (numeroId)) {
                    trabajadores[i].setLanaldia(new Zatikia(3, 2)); //Sale al encontrar el primero de ellos que cumple la condición
                    return trabajadores[i];
                }
            }

        }
        // si no lo ha encontrado
        return null;
    }

}
