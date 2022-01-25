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
public class OddEvenTest {

    public static void main(String[] args) {

        int number;     //número que tendremos que introducir; el cual se comprobará si es impar o impar

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        number = in.nextInt();

        in.close();

        if (isOdd(number) == true) {
            System.out.println(number + " is an ODD number. ");
        }

        if (isEven(number) == true) {
            System.out.println(number + " is an EVEN number. ");
        }

    }

    public static boolean isOdd(int number) {

        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
