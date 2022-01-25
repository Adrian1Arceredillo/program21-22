package volumen1;
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
public class EncriptacionMensajeCaesar_102 {

    public static void main(String[] args) {

        String entrada = "";
        int desplazamiento;
        boolean isValid = true;
        String condFin = "FIN";

        char letra;

        Scanner in = new Scanner(System.in);

        //.-.-.-.-.-.-.
        do {
            String resultado = "";
            int cVocales = 0;
            //System.out.println("Enter a word: ");
            entrada = in.nextLine();

            int salto = 'p' - entrada.charAt(0);
            //System.out.println(salto);

            for (int i = 1; i <= entrada.length() - 1; ++i) {
                letra = entrada.charAt(i);
                //letra = (char) (letra + salto);

                if (letra >= 'a' && letra <= 'z') {

                    letra = (char) (letra + salto);

                    if (letra > 'z') {
                        letra = (char) (letra + 'a' - 'z' - 1);
                    }

                    resultado = resultado + letra;

                } else if (letra >= 'A' && letra <= 'Z') {
                    // shift alphabet
                    letra = (char) (letra + salto);

                    // if shift alphabet greater than 'Z'
                    if (letra > 'Z') {
                        //reshift to starting position 
                        letra = (char) (letra + 'A' - 'Z' - 1);
                    }
                    resultado = resultado + letra;

                } else {
                    resultado = resultado + letra;

                }
                //System.out.print(letra);

                //resultado = resultado + letra;
            }
            //System.out.println(resultado); -> ver el contenido/valor de "resultado", cada vez que se introduzca una nueva entrada

            if (resultado.equals(condFin)) {
                isValid = false;
            } else {
                //contar vocales
                for (int i = 0; i < resultado.length(); ++i) {
                    char karakterea = resultado.charAt(i);
                    if ((karakterea == 'a' || karakterea == 'e' || karakterea == 'i' || karakterea == 'o' || karakterea == 'u') || (karakterea == 'A' || karakterea == 'E' || karakterea == 'I' || karakterea == 'O' || karakterea == 'U')) {
                        ++cVocales;
                    }
                }

                System.out.println(cVocales);
            }

        } while (isValid == true);
        

        //.-.....-.-.-.-.
    }
}

/*
pEsta cadena esta sin codificar
pfin
qbfjpvBFJPV
ozdhntZDHNT
xXzwoziui-Um
qGJO
 */
