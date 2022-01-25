/*
 * Sum the odd numbers and the even numbers from a lowerbound to an upperbound
 */
public class ThreeFiveSevenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      
       final int hasiera, bukaera;
       hasiera = 1;
       bukaera = 1000;
       
       final int div1, div2, div3;
       div1 = 3;      //divisibles entre 3
       div2 = 5;      //divisibles entre 5
       div3 = 7;      //divisibles entre 7

       final int nodiv1, nodiv2, nodiv3, nodiv4;
       nodiv1 = 15;
       nodiv2 = 21;
       nodiv3 = 35;
       nodiv4 = 105;
       
       int sum = 0;
       
       int number = hasiera;
       
       while (number <= bukaera) {
          if ((number % div1 == 0 || number % div2 == 0 || number % div3 == 0) && (number % nodiv1 != 0 || number % nodiv2 != 0 || number % nodiv3 != 0 || number % nodiv4 != 0)){
               System.out.println(number);
               sum = sum + number;
               
           } 
           
           ++number;
       }
       
       
      // Print the result
      System.out.println("La suma de los números que cumplen las condiciones es: " + sum);
      //System.out.println("La suma de los números divisibles entre 3, 5 y 7, pero no divisibles entre 15, 21, 35 y 105 es: " + sum);
      //System.out.println("The sum of even numbers from " + hasiera + " to " + bukaera + "  is " + sumEven);
      
   }
}