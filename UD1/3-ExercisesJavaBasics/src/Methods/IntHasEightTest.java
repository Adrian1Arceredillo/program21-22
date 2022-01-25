package Methods;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AdriAlex
 */
public class IntHasEightTest {

    public static void main(String[] args) {

        int number;     //será el número a comprobar. Queremos saber si contiene el dígito 8
        

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int: ");
        number = in.nextInt();
        in.close();
        
        if (hasEight(number) == true) {
            System.out.println("The number \"" + number + "\" contains the digit 8. ");
        } else {
            System.out.println("The number \"" + number + "\" doesnt contain the digit 8. ");
        }

        

    }

    public static boolean hasEight(int number) {
        int ult;
        final int midigit = 8;

        while (number > 0) {
            ult = number % 10;
            if (ult == midigit) {
                //number = number / 10;  // esta línea no es 100% necesaria
                return true;
            }

            number = number / 10;
        }
        return false;

    }
}