/*
 * Write a program called PrintLeapYears to print all the leap years between AD999 and AD2010. Also print 
   the total number of leap years. (Hints: use a int variable called count, which is initialized to 
   zero. Increment the count whenever a leap year is found.)
 */
public class PrintLeapYears {  // Save as "OddEvenSum.java"

    public static void main(String[] args) {

        final int hasiera = 999;
        final int bukaera = 2010;

        final int div = 4;      //divisibles entre 3
        final int nodiv = 100;      //no-divisibles entre 100

        int count = 0;
        int number = hasiera;

        while (number <= bukaera) {
            if ((number % div == 0) && (number % nodiv != 0) || (number % 400 == 0)) {
                count = count + 1;

                System.out.println(number);
                ++number;

            } else {
                ++number;
            }

        }

        // Print the result
        System.out.println("La cantidad de años bisiestos es " + count);
        //System.out.println("La suma de los números divisibles entre 3, 5 y 7, pero no divisibles entre 15, 21, 35 y 105 es: " + sum);
        //System.out.println("The sum of even numbers from " + hasiera + " to " + bukaera + "  is " + sumEven);

    }
}
