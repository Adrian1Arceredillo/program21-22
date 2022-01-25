/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_decision_loop_5_exercises;

/**
 *
 * @author AdriAlex
 */
public class sumAverageRunningInt_HOME {
    public static void main(String[] args) {
        
        int hasiera = 45;
        int bukaera = 100;
        int suma = 0;
        double average;
        
        int number = hasiera;
        
        while (number <= bukaera) {
            suma = suma + number;
            ++number;
        }
        
        average = (double) suma / (bukaera - hasiera + 1);
        System.out.println("The sum from " + hasiera + " to " + bukaera + " is: " + suma);
        System.out.printf("The average is %.2f\n", average);
    }
}
