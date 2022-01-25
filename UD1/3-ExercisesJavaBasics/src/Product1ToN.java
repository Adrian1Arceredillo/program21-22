/*
Write a program called Product1ToN to compute the product of integers from 1 to 10 (i.e., 1×2×3×...×10), as an int. Take note that It is the same as factorial of N.
Declare an int variable called product, initialize to 1, to accumulate the product.
Respuesta correcta:     
 */

/**
 *
 * @author arceredillo.adrian
 */
public class Product1ToN {
    public static void main(String[] args) {
        
        //final int hasiera, bukaera;
        final int hasiera = 2;          //primer valor del rango
        final int bukaera = 3;         //último valor del rango
        //int numero = 0;
                
        int product = 1;
        int number = hasiera;
        
        while (number <= bukaera ) {
            product = product * number;
            ++number;
        }
        
        System.out.println(product);
        
    }
}

/* otra forma de hacerlo:
          for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        
        
        System.out.println(product);
*/
    