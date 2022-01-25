package Methods;
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
public class GradesStatistics_method {

    public static void main(String[] args) {

        int[] grades;
        int num_items;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        num_items = in.nextInt();

        grades = new int[num_items];

        for (int i = 0; i <= grades.length - 1; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();

            if (!(grades[i] >= 0 && grades[i] <= 100)) {
                System.out.print("Error. Enter a grade between 0-100 for student " + (i + 1) + ": ");
                grades[i] = in.nextInt();
            }
        }
        
        printGrades(grades);
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.println("The sum of all grades is: " + suma(grades));
        System.out.println("The maximum is: " + max_nota(grades));
        System.out.println("The minimum is: " + min_nota(grades));
        //System.out.printf("The median is: %2.f\n",medianNota(grades));
        

    }

    public static void printGrades(int[] notas) {

        System.out.print("The grades are: [");
        for (int idx = 0; idx <= notas.length - 1; ++idx) {
            if (idx == 0) {
                System.out.print(notas[0]);
            } else {
                System.out.print(", " + notas[idx]);
            }
        }
        System.out.println("]");

    }
    
    public static int suma(int [] notas) {
        
        int sum_notas = 0;
        for (int idx = 0; idx <= notas.length - 1; ++idx) {
            sum_notas = sum_notas + notas[idx];
        }
        return sum_notas;
        
    }
    
    /*public static double medianNota(int [] notas) {
        
        double medNota = 0;
        medNota = suma(notas) / notas.length;
        return medNota;
        
    }*/
    
    public static double average(int [] notas) {
        
        double average_nota;
        average_nota = (double) (suma(notas)) / notas.length;
        return average_nota;
        
    }

    public static int min_nota(int[] notas_student) {

        int nota_minima = 100;

        for (int idx = 0; idx <= notas_student.length - 1; ++idx) {
            if (notas_student[idx] < nota_minima) {
                nota_minima = notas_student[idx];
            }
        }
        return nota_minima;

    }

    public static int max_nota(int[] notas_student) {

        int nota_maxima = 0;

        for (int idx = 0; idx <= notas_student.length - 1; ++idx) {
            if (notas_student[idx] > nota_maxima) {
                nota_maxima = notas_student[idx];
            }
        }
        return nota_maxima;

    }

}
