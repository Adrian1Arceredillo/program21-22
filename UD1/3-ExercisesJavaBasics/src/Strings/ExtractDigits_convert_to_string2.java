/*
https://www.geeksforgeeks.org/java-program-to-extract-digits-from-a-given-integer/
*/
package Strings;
/**
 *
 * @author AdriAlex
 */
public class ExtractDigits_convert_to_string2 {
    public static void main(String[] args) {
        //declarar la variable
        int number = 110602; //declarar la variable
        //convertir el integer en un string
        String string_number = Integer.toString(number);
        
        int i = 0;  //variable que hará referencia a la longitud del string
        
        while (i < string_number.length()) {
            System.out.println(string_number.charAt(i));
            ++i;
            
        }
        
    }
    
}

/*
Otra forma de hacerlo:
while (i < string_number.length()) {
            int digit = number % 10;
            System.out.print(" " + digit);
                
                number = number / 10;
                ++i;
        }
*/

/*
while (i < string_number.length()) {
            System.out.println(string_number.charAt(i));
            ++i;
            
        }
*/