package Strings;
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
public class CaesarCode2 {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        int salto;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un string: ");
        mistr = sc.next();
        mistrLen = mistr.length();
        System.out.print("Cuanto debe saltar? ");
        salto = sc.nextInt();
        
        char alfabeto;
        String resultado = "";
        
        
        mistr = mistr.toUpperCase();
        
        for (int idx = 0; idx <= mistrLen - 1; ++idx) {
            
            alfabeto = mistr.charAt(idx);
            
            if (alfabeto >= 'A' && alfabeto <= 'Z') {
                
                alfabeto = (char) (alfabeto + salto);
                
                if (alfabeto > 'Z') {
                    alfabeto = (char) (alfabeto + 'a' - 'z' - 1);
                }
                
                resultado = resultado + alfabeto;
            }
                    
        }
        System.out.println(resultado);
        System.out.println();
    }
}
