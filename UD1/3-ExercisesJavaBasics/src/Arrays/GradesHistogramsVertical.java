package Arrays;
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
public class GradesHistogramsVertical {

    public static void main(String[] args) {

        final int numStudents;
        int[] grades;
        int[] bins = new int[10];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        for (int i = 0; i <= grades.length - 1; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        in.close();

        //System.out.println(Arrays.toString(grades));

        // Populate the histogram bins
        for (int grade : grades) {
            if (grade == 100) {   // Need to handle 90-100 separately as it has 11 items.
                ++bins[9];
            } else {
                ++bins[grade / 10];
            }
        }
        
        //System.out.println(Arrays.toString(bins));
        
        for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
         // Print label
         if (binIdx != 9) {  // Need to handle 90-100 separately as it has 11 items
            System.out.printf("%2d-%3d: ", binIdx*10, binIdx*10+9);
         } else {
            System.out.printf("%2d-%3d: ", 90, 100);
         }
         // Print columns of stars
         for (int itemNo = 0; itemNo < bins[binIdx]; ++itemNo) {  // one star per item
            System.out.print("*");
         }
         System.out.println();
      }

        //System.out.println(Arrays.toString(grades));
        //System.out.println(Arrays.toString(bins));
    }
}
