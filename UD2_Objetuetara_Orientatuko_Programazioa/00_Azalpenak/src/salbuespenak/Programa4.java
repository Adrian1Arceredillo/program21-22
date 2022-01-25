/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salbuespenak;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author arceredillo.adrian
 */
public class Programa4 {
    public static void main(String[] args) {
        
        int[] zenbakiak = {1, 15, 2};
        Scanner in = new Scanner(System.in);
        int zenbatgarrena;
        
        try {
            
            System.out.println("Zenbatgarren zenbakia ikusi nahi duzu? ");
            zenbatgarrena = in.nextInt();
            System.out.println(zenbakiak[zenbatgarrena]);
        } catch (InputMismatchException ex) {
            System.out.println("Zenbaki bat sartu behar duzu. ");
            in.next();  //esto se hace para vaciar el elemento que se ha quedado en el scanner
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Zenbaki okerra sartu duzu. ");
        } catch (Exception ex) { //entrará aquí en caso de que la Exception generada no sea ni InputMismatch ni ArrayIndexOutOfBounds
            System.out.println("Salbuespena gertatu da. Baina ez da ez InputMismatch-a ezta ArrayIndex klasekoa");
            System.out.println(ex.getMessage());
        } finally {     //este bloque SIEMPRE se va a ejecutar, ocurra una Exception o no.
            System.out.println("Agur.");
        }
        
    }
}

/*
Moodle:
Catch bloke bat jarri dezakegu, gertatu daitekeen exception 
bakoitzagatik. Gertatutakoarekin bat datorren lehengo cath-a 
exekutatuko da. Beraz, zehatzenetik hastea komeni da. 
try-catch blokearen azken atala finally-a izan daiteke. 
Bertan zehaztutako lerroak beti exekutatuko dira. 
Exceptionak salto egin ala ez egin.
*/
