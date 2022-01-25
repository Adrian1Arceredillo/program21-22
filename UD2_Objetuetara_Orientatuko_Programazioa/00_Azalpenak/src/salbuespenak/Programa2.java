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
public class Programa2 {

    public static void main(String[] args) {

        int[] zenbakiak = {1, 15, 2};
        
        try {   //intentar (try) mostrar el valor del elemento que ocupa la posición 8 DEL ARRAY [0, 1, 2]
            System.out.println(zenbakiak[8]);
        } catch (Exception ex) {
            System.out.println("Salbuespena gertatu da. ");
            //System.out.println(ex.getMessage()); -> 
            //System.out.println(ex.getClass()); -> muestra el tipo/clase de excepción que se ha dado
        }

    }
}

/*
Moodle:
- try-catch bidez salbuespena "harrapatzea"

try-catch
Exception-a eragin dezakeen kodea try-catch bloke batekin inguratu dezakegu. Horrelako zerbait idatzi beharko genuke:

try {
   // Protected code
} catch (ExceptionName e1) {
   // Catch block
}
*/