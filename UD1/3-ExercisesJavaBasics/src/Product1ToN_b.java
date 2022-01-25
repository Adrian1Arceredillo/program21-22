/*
1. Compute the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. Write down the product obtained and decide if the results are correct.

 */

/**
 *
 * @author arceredillo.adrian
 */

public class Product1ToN_b {
    public static void main(String[] args) {
        
        //final int hasiera, bukaera;
        final int hasiera = 1;          //primer valor del rango
        final int bukaera = 12;         //último valor del rango
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

/*
HINTS: Factorial of 13 (=6227020800) is outside the range of int [-2147483648, 2147483647].
Take note that computer programs may not produce the correct result even though the code seems correct!
*/