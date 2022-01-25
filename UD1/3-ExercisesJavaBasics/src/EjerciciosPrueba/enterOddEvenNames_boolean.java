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
public class enterOddEvenNames_boolean {

    public static void main(String[] args) {

        String nombre;
        final int numNombres = 2;
        boolean isPar = true;
        int cEven = 0;
        int cOdd = 0;
        int totalParesLetras = 0;
        int totalImparesLetras = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numNombres; ++i) {

            if (i % 2 != 0) {   //si la peticion es impar...
                isPar = false;

            } else {        //si la peticion es par...
                isPar = true;

            }

            System.out.print("Introduce el nombre número " + (i + 1) + ": ");
            nombre = in.next();

            if (isPar == true) {   //si la peticion es impar...
                nombre = nombre.toLowerCase();
                ++cEven;
                
                totalParesLetras = totalParesLetras + (nombre.length());
                
                //System.out.println("ODD");
            } else {        //si la peticion es par...
                nombre = nombre.toUpperCase();
                ++cOdd;
                
                totalImparesLetras = totalImparesLetras + (nombre.length());
                
                //System.out.println("EVEN");
            }
            System.out.println("El nombre introducido es: " + nombre);

        }
        System.out.println("La cantidad de PARES es: " + cEven);
        System.out.println("La cantidad de IMPARES es: " + cOdd);
        
        System.out.println("La cantidad de letras PARES es: " + totalParesLetras);
        System.out.println("La cantidad de letras IMPARES es: " + totalImparesLetras);

    }
}
