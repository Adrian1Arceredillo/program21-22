/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class Factorizar {

    public static void main(String[] args) {

        int zenbaki;        //número introducido por el usuario
        int i = 2;          //los números que se utilizarán para buscar los factores del número introducido. Se irá incrementando en uno, a medida que sea necesario.
        int j = 0;          //posición del array en la que se mostrarán los factores encontrados de dicho número.
        int[] intFaktoreak = new int[50];

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat:");
        zenbaki = in.nextInt();

        while (zenbaki <= 0) {
            System.out.println("Mesedez, zenbaki POSITIBO bat sartu:");
            zenbaki = in.nextInt();
        }

        while (zenbaki > 1) {
            if (zenbaki % i == 0) { //si al dividir el número entre el valor de "i", el resto es 0, "i" será un factor de ese número.

                zenbaki = zenbaki / i;  //dividimos entre "i" para continuar obteniendo factores.

                intFaktoreak[j] = i; //los factores del número se irán guardando en el array.
                ++j;    //incrementamos el valor de "j" (posición del array), para que el siguiente factor, se ponga en la siguiente posición del array
            } else {
                ++i;    //si al dividir el número entre "i", el resto es DISTINTO de 0, se incrementará en 1 el valor de "i".
            }
        }
        System.out.print("[");
        for (int x = 0; x < j; x++) {   //la condición "x < j" hace que, durante el bucle, se irán mostrando los datos del array, hasta llegar a "j", que es número total de elementos (factores encontrados)
            if (x == 0) {
                System.out.print(intFaktoreak[0]);
            } else {
                System.out.print(", " + intFaktoreak[x]);
            }
        }
        System.out.println("]");
        
    }
}

//https://www.superprof.es/diccionario/matematicas/aritmetica/factorizacion-numero.html
//http://programas-en-el-lenguaje-c.blogspot.com/2013/01/factorizar-un-numero.html
