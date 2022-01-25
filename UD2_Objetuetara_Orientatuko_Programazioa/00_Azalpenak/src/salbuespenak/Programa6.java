/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salbuespenak;

/**
 *
 * @author arceredillo.adrian
 */
public class Programa6 {
    public static void main(String[] args) {
        
        int[] zenbakiak = {1, 15, 2};
        
        try {
            metodoArriskutsua(zenbakiak);   //unreported exception Exception;   must be caught or declared to be thrown
        } catch (Exception ex) {
            System.out.println("Salbuespena gertatu da. ");
            System.out.println(ex.getMessage());
        }
        
    }
    
    public static String metodoArriskutsua(int[] z) throws Exception {
        System.out.println(z[5]);
        return null;
        
    }
}

/*
Moodle:
THROWS
Salbuespenak metodo jakin bat exekutatzen dugun bitartean gertatzen dira. Momentu horretan 
bertan harrapatu eta kudeatu beharrean, badago aukera salbuespen hori kudeatzearen lana 
atzeratzeko. Hau da, uneko metodoak berak salbuespena eragingo luke eta metodoari deitu 
dionaren erantzunkizuna izango litzateke salbuespenaren kudeaketa.
*/