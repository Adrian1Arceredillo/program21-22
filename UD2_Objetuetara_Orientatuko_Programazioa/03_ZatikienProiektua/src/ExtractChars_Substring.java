/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class ExtractChars_Substring {

    public static void main(String[] args) {

        String mistr = "1/2";
        String separator = "/";
        int posSeparator = mistr.indexOf(separator);
        
        System.out.println("Substring before separator = " + mistr.substring(0, posSeparator));
        System.out.println("Substring after separator = " + mistr.substring(posSeparator + separator.length()));
        
    }
}

/*Teniendo un string establecido, obtener los carácteres existentes hasta un carácter concreto.
Por ejemplo: -> Obtener los carácteres que hay hasta llegar al carácter "R".
String mistr = "tecladoRojo"; 
 */
