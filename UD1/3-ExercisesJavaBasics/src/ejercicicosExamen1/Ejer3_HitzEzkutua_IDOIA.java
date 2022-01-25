/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExamen1;
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class Ejer3_HitzEzkutua_IDOIA {
    public static void main(String[] args) {
        
        String hitza = "udazkena";
        
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Sartu karaktere bat: ");
        String strHizkia = in.next();
        char hizkia = strHizkia.charAt(0);
        
        for (int i = 0; i <= hitza.length() - 1; ++i) {
            if (hizkia == hitza.charAt(i)) {
                System.out.print(hizkia);
            } else {
                System.out.print("-");
            }
            
        }
        System.out.println("");
        
    }
}
