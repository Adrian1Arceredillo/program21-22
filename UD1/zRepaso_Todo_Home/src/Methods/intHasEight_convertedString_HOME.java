/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Scanner;
/**
 *
 * @author AdriAlex
 */
public class intHasEight_convertedString_HOME {
    public static void main(String[] args) {
        
        int number;
        final int key = 8;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int: ");
        number = in.nextInt();
        
        if (hasEight(number) == true) {
            System.out.println("Entered number contains " + key);
        } else {
            System.out.println("Entered number doesnt contain " + key);
        }
        
    }
    
    public static boolean hasEight(int number) {
        
        int ult;
        final int key = 8;
        String str_number = Integer.toString(number);
        int str_numberLen = str_number.length();
        

        for (int i = 0; i <= str_number.length() - 1; ++i) {
            int espdigit = str_number.charAt(i);
            
            if (espdigit == '8') {
                return true;
            }
        }
        
        return false;
        
    }
}
