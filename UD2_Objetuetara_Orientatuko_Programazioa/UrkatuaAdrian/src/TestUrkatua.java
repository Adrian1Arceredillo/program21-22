/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import model.Hitza;

/**
 *
 * @author arceredillo.adrian
 */
public class TestUrkatua {

    private static String[] palabras = {"casa", "perro", "helicoptero"};

    public static void main(String[] args) {

        Hitza h1 = new Hitza();
        System.out.println("La palabra secreta es: " + h1.getHitza());
        boolean juegoTerminado = false;
        Scanner in = new Scanner(System.in);
        int numeroIntentos = 3;

        do {
            System.out.println(h1.getAsmatutakoa());
            System.out.println("");

            if (numeroIntentos == 1) {
                System.out.println("ÚLTIMO INTENTO! ");
            } else {
                System.out.println("Intentos restantes: " + numeroIntentos);
            }

            //System.out.println("Intentos disponibles: " + numeroIntentos);
            System.out.print("Introduce una letra: ");
            char letraUsuario = in.next().charAt(0);
            boolean algunaLetraAcertada = false;

            for (int i = 0; i < h1.getHitza().length(); ++i) {
                if (h1.egiaztatu(letraUsuario)) {
                    algunaLetraAcertada = true;
                }
            }

            if (!algunaLetraAcertada) {
                System.out.println("");
                System.out.println("No has acertado ninguna letra. ");
                --numeroIntentos;
                if (numeroIntentos == 0) {
                    System.out.println("Has muerto. Te has quedado sin intentos... ");
                    juegoTerminado = true;
                }
            }

            if (!hayGuiones(h1.getAsmatutakoa())) {
                System.out.println("");
                System.out.println("********************************* ");
                System.out.println("Enhorabuena!! Has ganado el juego! ");
                System.out.println("La palabra era: " + h1.getHitza());
                juegoTerminado = true;
            }

        } while (!juegoTerminado);

    }

    public static boolean hayGuiones(char[] arrayConGuiones) {
        for (int i = 0; i < arrayConGuiones.length; ++i) {
            if (arrayConGuiones[i] == '-') {
                return true;
            }
        }
        return false;
    }

}
