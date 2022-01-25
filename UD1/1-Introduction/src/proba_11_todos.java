/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */
public class proba_11_todos {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {

        final int hasiera = 1;
        final int bukaera = 10;
        
        int product = 1;
        
        int number = hasiera;
        
        while (number <= bukaera) {
           product = product * number;
           ++number;
            
        }
       
        System.out.println("El producto de todos los números que hay entre " + hasiera + " y " + bukaera + " es: " + product);
   }
}
//proba_11_todos