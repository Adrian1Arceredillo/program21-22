/*Obtener qué números son el mínimo y el máximo. Los números los meteremos cuando se ejecute el programa.
La variable "max" determina la cantidad de números que podemos registrar en variables. Es decir, no podremos introducir 
más variables que el número que esta variable indique.*/
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
public class SumProductMinMax5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number, number1, number2, number3;
        int sum, product;
        int max, mayor, menor;
        //max = 5;
        mayor = 0;
        menor = 0;
        //number1 = 2;
        //number2 = 3;
        //number3 = 4;        
        //number4 = 5;
        //number5 = 6;

        System.out.println("Inserte el máximo de números: ");
        max = in.nextInt();

        /*System.out.print("Primer número íntegro: ");
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        number1 = in.nextInt(); //define valor del primer numero
        
        System.out.print("Segundo número íntegro: ");
        number2 = in.nextInt(); //define valor del segundo numero
        
        System.out.print("Segundo número íntegro: ");
        number3 = in.nextInt(); //define valor del tercer numero
        
      
        in.close(); */
        //int cont = 1;
        int cont = 1;

        while (cont <= max) {
            System.out.print("Inserta el " + cont + " número íntegro: ");
            number = in.nextInt();
            

            if (cont == 1) {
                menor = number;
            }
            if (number > mayor) {
                mayor = number;
            }

            if (number < menor) {
                menor = number;
            }
            ++cont;
        }
        System.out.println("El valor mayor es: " + mayor);
        System.out.println("El valor menor es: " + menor);
    }
}

/*
int cont = 1;
        
        while (cont <= max) {
            System.out.print("Inserta el " + cont + " número íntegro: ");
            Scanner in = new Scanner(System.in);  // Scan the keyboard for input
            number = in.nextInt();
            ++cont;

if (cont == 1) {
                menor = number;
            }
            if (number > mayor)
            {
                mayor = number;
            }
            
            
            if (number < menor) {
                menor = number;
            }
 */
