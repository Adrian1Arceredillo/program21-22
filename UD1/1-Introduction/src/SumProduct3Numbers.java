/*
 * Test Arithmetic Operations
 */
public class SumProduct3Numbers {     // Save as "ArithmeticTest.java"
   public static void main(String[] args) {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5;
      int number3 = 77; // Declare an int variable number2 and initialize it to 5
      int sum, product;  // Declare 5 int variables to hold results
   
      // Perform arithmetic Operations
      sum = number1 + number2 + number3;
      product = (number1 * number2) * number3;

  
      // Print results
      System.out.println("The sum and product results are: ");  // Print description
      System.out.print(number1);      // Print the value of the variable
      System.out.print(" + ");
      System.out.print(number2);
      System.out.print(" + ");
      System.out.print(number3);      // Print the value of the variable
      System.out.print(" is: ");
      System.out.println(sum);
      System.out.print(number1);
      System.out.print(" + ");
      System.out.print(number2);
      System.out.print(" + ");
      System.out.print(number3);
      System.out.print(" is: ");
      System.out.println(product);
   }
}