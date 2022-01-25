package Methods;
import java.util.Arrays;
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
public class GradesHistogram_method {

    public static void main(String[] args) {

        int[] grades;
        int num_students;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        num_students = in.nextInt();

        grades = new int[num_students];

        for (int i = 0; i <= grades.length - 1; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();

            if (!(grades[i] >= 0 && grades[i] <= 100)) {
                System.out.print("Error. Enter a grade between 0-100 for studen " + (i + 1) + ": ");
                grades[i] = in.nextInt();
            }

        }

        printGrades(grades);
        elements(grades);
        

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
    
    public static int elements(int [] notas) {
        
        for (int idx = 0; idx <= notas.length - 1; ++idx) {
            System.out.print(notas[idx] + ": ");
            
            for (int cant_stars = 1; cant_stars <= notas[idx]; ++cant_stars) {
                System.out.print("* ");
            }
            System.out.println("(" + notas[idx] + ")");
        }
        System.out.println();
        return 0;
    }
}


/*
for (int grade : grades) {
         if (grade == 100) {   // Need to handle 90-100 separately as it has 11 items.
            ++bins[9];
         } else {
            ++bins[grade/10];
         }
      }
 */
