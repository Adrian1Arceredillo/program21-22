package EjerciciosPrueba;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AdriAlex
 */
public class enterOddandEvenNames {

    public static void main(String[] args) {

        String nombre;
        final int numNombres = 5;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numNombres; ++i) {
            System.out.print("Introduce el nombre número " + (i + 1) + ": ");
            nombre = in.next();

            if (i % 2 != 0) {   //si la peticion es impar...
                nombre = nombre.toLowerCase();
                //System.out.println("ODD");
            } else {        //si la peticion es par...
                nombre = nombre.toUpperCase();
                //System.out.println("EVEN");
            }
            System.out.println("El nombre introducido es: " + nombre);

        }

    }
}
