/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import model.Hitza;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author arceredillo.adrian
 */
public class TestUrkatuaYT {

    public static void main(String[] args) {

        String palabraSecreta = getPalabraSecreta();
        System.out.println("La palabra secreta es: " + palabraSecreta);
        char[] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner in = new Scanner(System.in);
        int numeroIntentos = 3;

        do {
            System.out.println(palabraGuiones);
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

            for (int i = 0; i < palabraSecreta.length(); ++i) {
                if (palabraSecreta.charAt(i) == letraUsuario) {
                    palabraGuiones[i] = letraUsuario;
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

            if (!hayGuiones(palabraGuiones)) {
                System.out.println("");
                System.out.println("********************************* ");
                System.out.println("Enhorabuena!! Has ganado el juego. ");
                System.out.println("La palabra era: " + palabraSecreta.toUpperCase());
                juegoTerminado = true;
            }
        } while (!juegoTerminado);

        //System.out.println(palabraGuiones);
    }

    public static String getPalabraSecreta() {
        String[] palabras = {"casa", "perro", "helicoptero"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);

        return palabras[n];
    }

    public static char[] getGuionesFromPalabra(String hitza) {
        int nLetrasPalabraSecreta = hitza.length();

        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        for (int i = 0; i < palabraGuiones.length; ++i) {
            palabraGuiones[i] = '_';
        }

        return palabraGuiones;
    }

    public static boolean hayGuiones(char[] arrayConGuiones) {
        for (int i = 0; i < arrayConGuiones.length; ++i) {
            if (arrayConGuiones[i] == '_') {
                return true;
            }
        }
        return false;
    }
}

/*
https://www.youtube.com/watch?v=Y9A9g35iDH4
 */
