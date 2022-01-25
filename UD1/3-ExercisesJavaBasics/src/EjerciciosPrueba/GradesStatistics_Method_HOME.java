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
public class GradesStatistics_Method_HOME {

    public static void main(String[] args) {

        int[] grades;
        int num_students;
        int nota_min = 0;
        int nota_max = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        num_students = in.nextInt();

        grades = new int[num_students];

        for (int i = 0; i <= grades.length - 1; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();

            while (!(grades[i] >= 0 && grades[i] <= 100)) {
                System.out.print("Invalid grade. Enter a grade between 0-100: ");
                grades[i] = in.nextInt();
            }

        }
        print(grades);
        System.out.println("The maximum grade is: " + maxGrade(grades));
        System.out.println("The minimum grade is: " + minGrade(grades));
        System.out.println("The sum of all grades is: " + sum(grades));
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));

    }

    public static void print(int[] notas) {

        System.out.print("The grades are: [");
        for (int i = 0; i <= notas.length - 1; ++i) {
            if (i == 0) {
                System.out.print(notas[i]);
            } else {
                System.out.print(", " + notas[i]);
            }
            
        }
        System.out.println("]");
    }
    
    public static int sum(int[] notas) {
        
        int suma_notas = 0;
        for (int i = 0; i <= notas.length - 1; ++i) {
            suma_notas = suma_notas + notas[i];
        }
        return suma_notas;
    }
    
    public static double average(int[] notas) {
        
        double average_media = 0;
        average_media = (double) (sum(notas)) / notas.length;
        return average_media;
    }
    
    public static double median(int[] notas) {
        
        double media_sindecimales = 0;
        media_sindecimales = (sum(notas)) / notas.length;
        return media_sindecimales;
    }
    
    public static int maxGrade(int [] notas) {
        
        int nota_maxima = 0;
        
        for (int i = 0; i <= notas.length - 1; ++i) {
            if (notas[i] > nota_maxima) {
                nota_maxima = notas[i];
            }
        }
        return nota_maxima;
    }
    
    public static int minGrade(int [] notas) {
        
        int nota_minima = 100;
        
        for (int i = 0; i <= notas.length - 1; ++i) {
            if (notas[i] < nota_minima) {
                nota_minima = notas[i];
            }
        }
        return nota_minima;
    }

}
