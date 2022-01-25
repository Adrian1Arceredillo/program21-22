package Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class GradesStatistics {

    public static void main(String[] args) {

        int numStudents;
        int[] grades;
        double average;
        int suma_notas = 0;
        int max_nota = 0;
        int min_nota = 100;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el número de estudiantes: ");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        for (int i = 0; i <= grades.length - 1; ++i) {
            System.out.print("Introduce la nota del estudiante " + (i + 1) + ": ");
            grades[i] = in.nextInt();

            if (grades[i] < min_nota) {
                min_nota = grades[i];
            }
            
            if (grades[i] > max_nota) {
                max_nota = grades[i];
            }

        }
        in.close();

        for (int idx = 0; idx <= grades.length - 1; ++idx) {
            suma_notas = suma_notas + grades[idx];
        }

        average = (double) suma_notas / numStudents;
        System.out.printf("La media es: %.2f \n", average);
        System.out.println("La mayor nota es: " + max_nota);
        System.out.println("La menor nota es: " + min_nota);

    }
}

/*
if (grades[i] > max_nota) {
                max_nota = grades[i];
            }
 */
