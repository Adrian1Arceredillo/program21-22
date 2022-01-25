/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExamen1;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class Ejer3_HitzEzkutua {
    public static void main(String[] args) {
        
        String hitza = "udazkena";
        int hitzaLen = hitza.length();
        char letra;
        String sartutakoKarakterea; //string que recoge la letra que queramos buscar en la palabra secreta
        String letraStr;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu karaktere bat: ");
        sartutakoKarakterea = in.nextLine();
        
        for (int i = 0; i <= hitzaLen - 1; ++i) { //bucle para comparar cada caracter del string inicial (hitza) con el caracter que metamos por input
            letra = hitza.charAt(i);    //identificar cada caracter de la palabra secreta (string inicial)
            letraStr = Character.toString(letra);   //convertir el caracter anterior en un string para despues compararlo con la letra que metamos (string)
            
            if (letraStr.equals(sartutakoKarakterea)) {     //comparar cada caracter con el que hemos introducido
                System.out.print(sartutakoKarakterea);      //imprimir el caracter del input si son iguales
            } else {
                System.out.print("_");      //en caso de no se iguales, imprimir una barra
            }
        }
        
    }
}

/*
for (int i = 0; i <= hitzaLen - 1; ++i) {
            letra = hitza.charAt(i);
            letraStr = Character.toString(letra);
            
            if (letraStr.equals(sartutakoKarakterea)) {
                System.out.print(sartutakoKarakterea);
            } else {
                System.out.print("_");
            }
        }
*/