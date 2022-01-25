package EjerciciosPrueba;
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
public class palabraPalindroma {
    public static void main(String[] args) {
        
        String mistr;
        int mistrLen;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a palindromic word: ");
        mistr = in.next();
        mistrLen = mistr.length();
        
        String reversestr = "";
        
        for (int i = mistrLen - 1; i >= 0; --i) {
            reversestr = reversestr + mistr.charAt(i);
        }
        
        if (mistr.equals(reversestr)) {
            System.out.println("La palabra SI es palindroma. ");
        } else {
            System.out.println("La palabra NO es palindroma. ");
        }
        
        
        System.out.println(mistr);
        System.out.println(reversestr);
        
    }
}
