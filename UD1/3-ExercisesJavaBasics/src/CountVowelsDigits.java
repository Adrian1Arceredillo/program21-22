
import java.util.Scanner;
//import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class CountVowelsDigits {

    public static void main(String[] args) {

        String mistr;
        int mistrLen;
        int cVocal = 0;
        int cDigit = 0;
        
        double averageV = 0;
        double averageD = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un string: ");
        mistr = in.next();
        mistrLen = mistr.length();

        mistr = mistr.toLowerCase();

        for (int incharIdx = 0; incharIdx <= mistrLen - 1; ++incharIdx) {
            char charidx = mistr.charAt(incharIdx);
            
            if ((charidx == 'a' || charidx == 'e' || charidx == 'i' || charidx == 'o' || charidx == 'u')) {
                ++cVocal;
            } else if (charidx >= '0' && charidx <= '9') {
                ++cDigit;
            }

            
            //System.out.println(mistr.charAt(charIdx));
        }
        
        System.out.println("El número de vocales es: " + cVocal);
        System.out.println("El número de dígitos es: " + cDigit);
        
        averageV = (cVocal * 100) / (mistrLen);
        averageD = (cDigit * 100) / (mistrLen);
        
        //DecimalFormat formato1 = new DecimalFormat("#.##");
        
        System.out.printf("La media de vocales es de: %.2f \n", averageV);
        System.out.printf("La media de vocales es de: %.2f \n", averageD);
        System.out.println();
    }
}


/*
https://www.javatpoint.com/java-program-to-count-the-total-number-of-vowels-and-consonants-in-a-string
*/
