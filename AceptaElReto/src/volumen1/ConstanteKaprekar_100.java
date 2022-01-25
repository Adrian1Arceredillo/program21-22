package volumen1;


import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class ConstanteKaprekar_100 {

    public static void main(String[] args) {

        int [] zenbakia;
        final int num_items = 4;
        int digit;
        int min_num = 99999;
        int max_num = 0;

        Scanner in = new Scanner(System.in);
        //System.out.print("Enter a 4 digit number: ");
        //zenbakia[i] = in.nextInt();
        zenbakia = new int [num_items];
        
        
        
        System.out.print("Introduce un numero de 4 digitos: ");
        for (int i = 0; i <= zenbakia.length - 1; ++i) {
            zenbakia[i] = in.nextInt();
            
            if (zenbakia[i] < min_num) {
                min_num = zenbakia[i];
            }
            
            if (zenbakia[i] > max_num) {
                max_num = zenbakia[i];
            }

        }
        in.close();
        System.out.println(max_num);
        System.out.println(min_num);

        
    }

}

/*
https://www.aceptaelreto.com/problem/statement.php?id=100
*/