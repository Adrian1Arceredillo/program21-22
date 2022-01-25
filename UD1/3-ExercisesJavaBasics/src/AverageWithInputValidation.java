
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class AverageWithInputValidation {

    public static void main(String[] args) {

        final int NUM_ESTUDIANTES = 3;
        final int NOTA_MIN = 0;
        final int NOTA_MAX = 100;
        boolean isValid;
        int suma = 0;
        double media;

        int nota;

        for (int estudiante = 1; estudiante <= NUM_ESTUDIANTES; ++estudiante) {

            do {
                //pedir el valor
                Scanner in = new Scanner(System.in);
                System.out.println("Estudiante " + estudiante + " Nota entre " + NOTA_MIN + " y " + NOTA_MAX + ":");
                nota = in.nextInt();

                if ((nota >= NOTA_MIN) && (nota <= NOTA_MAX)) {
                    isValid = true;
                    System.out.println("El número introducido es: " + nota);
                    
                } else {
                    isValid = false;
                    System.out.println("Vuelve a intentarlo...");
                }
                System.out.println("- - - - - - - - - ");
            } while (!isValid);
            suma = suma + nota;

        }

        DecimalFormat formato1 = new DecimalFormat("#.##");

        System.out.println("La suma de los " + NUM_ESTUDIANTES + " es: " + suma);
        media = (double) suma / NUM_ESTUDIANTES;
        System.out.println("La media es: " + formato1.format(media));
    }
}
