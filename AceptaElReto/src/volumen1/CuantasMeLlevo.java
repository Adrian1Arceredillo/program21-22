/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class CuantasMeLlevo {
    public static void main(String[] args) {
        
        final int num_elementos = 2;
        int [] numeros;
        numeros = new int [num_elementos];
        int sumaDigits = 0;
        String num1 = "";
        String num2 = "";
        int digit = 0;
        int contAcarreo = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values:");
        for (int i = 0; i <= numeros.length - 1; ++i) {
            numeros[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        
        for (int idx = 0; idx <= numeros.length - 1; ++idx) {
            
            if (idx == 0) {
                num1 = String.valueOf(numeros[idx]);
            } else {
                num2 = String.valueOf(numeros[idx]);
            }
            
            //System.out.println(digit);
            //System.out.println(num1);
            //System.out.println(num2);
        }
        System.out.println(num1);
        System.out.println(num2);
        
        for (int i = num1.length() - 1; i >= 0; --i) {
            
            
            //System.out.println(num1.charAt(i));
            //System.out.println(num2.charAt(i));
        }
        System.out.println(contAcarreo);
    }
}

/*
https://www.javatpoint.com/java-int-to-string
https://gist.github.com/vjfernandez/9281517
*/