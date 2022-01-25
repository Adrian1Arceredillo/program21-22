/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen1;

import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class CuantasMeLlevoHOME {

    public static void main(String[] args) {

        int contAcarreo = 0;
        int sumaDigits = 0;
        int primero = 0;
        int segundo = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        

        while (num1 + num2 != 0) {
            primero = num1 % 10;
            segundo = num2 % 10;
            

            sumaDigits = primero + segundo;
            
            if (sumaDigits >= 10) {
                ++contAcarreo;                
            }
            //System.out.println(sumaDigits);
            num1 = num1 / 10;
            num2 = num2 / 10;
            
        }
        System.out.println(contAcarreo);
        
    }
}

/*
https://www.javatpoint.com/java-int-to-string
https://gist.github.com/vjfernandez/9281517
*/
