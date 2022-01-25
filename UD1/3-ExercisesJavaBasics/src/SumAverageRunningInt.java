/*
Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100. Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily. Also compute and display the average. The output shall look like:
 */

/**
 *
 * @author arceredillo.adrian
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        
        final int hasiera, bukaera;
        hasiera = 1;
        bukaera = 100;
        
        double average; //average variable
        
        
        int sum = 0;
                
        int number = hasiera;
                
        while (number <= bukaera) {
            
            sum = sum + number;
            ++number;
        }
        average = sum / (double)(bukaera);            //(double)(bukaera - hasiera + 1);   hace que lo de dentro del parentesis se convierta en lo que le ponemos delante (double)
         
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
        
    }
}
