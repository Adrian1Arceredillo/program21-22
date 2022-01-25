/*
 * Sum the odd numbers and the even numbers from a lowerbound to an upperbound
 */
public class OddEvenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      
       final int hasiera = 1;
       final int bukaera = 1000;
       
       int sumEven = 0;
       int sumOdd = 0;
       
       int number = hasiera;
       
       while (number <= bukaera) {
           if (number % 2 == 0){     //números pares
               sumEven = sumEven + number;
           } else {         //números impares
               sumOdd = sumOdd + number;
           }
           ++number;
       }
       
       
      // Print the result
      System.out.println("The sum of odd numbers from " + hasiera + " to " + bukaera + " is " + sumOdd);
      System.out.println("The sum of even numbers from " + hasiera + " to " + bukaera + "  is " + sumEven);
      System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
   }
}
//OddEvenSum