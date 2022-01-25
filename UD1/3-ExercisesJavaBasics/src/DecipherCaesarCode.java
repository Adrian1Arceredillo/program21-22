import java.util.Scanner;
/*
https://www.geeksforgeeks.org/java-program-to-extract-digits-from-a-given-integer/
*/

/**
 *
 * @author AdriAlex
 */
public class DecipherCaesarCode {
    public static void main(String args[]) {
        
        int shift;
        String plaintext;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        plaintext = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             // Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet - shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet - shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println(" ciphertext : " + ciphertext);
  }
}