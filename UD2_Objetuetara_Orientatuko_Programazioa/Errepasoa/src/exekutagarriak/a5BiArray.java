/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class a5BiArray {
    
    private static String[] euskara = {"kaixo", "emakume", "marrubia", "teklatua", "bihar"};
    private static String[] gaztelera = {"hola", "mujer", "fresa", "teclado", "mañana"};
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Zein hitz nahi duzu itzuli gaztelerara? ");
        String palabraUsuario = in.next();
        
        //System.out.println(palabraUsuario + " -> " + hitzaBilatu(palabraUsuario));
        System.out.println(hitzaBilatu(palabraUsuario));
        
    }
    
    public static String hitzaBilatu(String palabraSolicitada) {
        int pos = -1;
        for (int i = 0; i < euskara.length; ++i) {
            if (palabraSolicitada.equals(euskara[i])) {
                pos = i;
                break;
            } 
        }
        if (pos == -1) {
            return "Sentitzen dugu. Ez daukagu " + palabraSolicitada + " hitza gure hiztegian. ";
        } else {
            return palabraSolicitada + " -> " + gaztelera[pos];
        }
        
    }
    
    
}
