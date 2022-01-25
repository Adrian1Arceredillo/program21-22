/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class gradesStatisticsHOME {
    public static void main(String[] args) {
        
        int [] grades;
        final int num_students;
        double average;
        int nota_max = 0;
        int nota_min = 100;
        int sum_notas = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        num_students = in.nextInt();
        
        grades = new int [num_students];
        
        for (int i = 0; i <= grades.length - 1; ++i) {
            System.out.print("Enter the grade for the student number " + (i + 1) + ": ");
            grades[i] = in.nextInt();
            sum_notas = sum_notas + grades[i];
            
            if (grades[i] < nota_min) {
                nota_min = grades[i];
            }
            
            if (grades[i] > nota_max) {
                nota_max = grades[i];
            }
            
        }
        
        average = (double) (sum_notas) / num_students;
        
        System.out.printf("The average is %.2f \n", average);
        System.out.println("The minimus grade is: " + nota_min);
        System.out.println("The maximus grade is: " + nota_max);
    }
}
