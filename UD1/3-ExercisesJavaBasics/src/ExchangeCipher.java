
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
public class ExchangeCipher {

    public static void main(String[] args) {

        String plaintext = ""; //input String
        int plaintextLen;   //length of the input string
        //int cVocal;     //contador de vocales del string
        char cambio;
        String ciphertext = "";
        

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        plaintext = in.next();
        plaintextLen = plaintext.length();

        in.close();

        for (int i = plaintextLen - 1; i >= 0; --i) {
            
            
            cambio = plaintext.charAt(i);
            ciphertext = ciphertext + cambio;
            
            
        }
        System.out.print(ciphertext.toUpperCase());
    }
}
/*
String plaintext = ""; //input String
        int plaintextLen;   //length of the input string
        //int cVocal;     //contador de vocales del string
        char cambio;
        String ciphertext = "";
        

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        plaintext = in.next().toUpperCase();
        plaintextLen = plaintext.length();

        in.close();

        for (int i = plaintextLen - 1; i >= 0; --i) {
            
            
            cambio = plaintext.charAt(i);
            ciphertext = ciphertext + cambio;
            
            
        }
        System.out.print(ciphertext);
    }
}
*/