
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
public class Mkt {
    public static void main(String[] args) {
        
        int num1, num2;
        int txikiena;       //esta variable recogerá el valor del número más pequeño. Con esto podremos obtener el MKT
        int mkt = 0;
        int zkh = 0;        //para calcular el MKT de una forma más sencilla, se puede utilizar el ZKH. Este habrá que calcularlo también.
        
        Scanner in = new Scanner(System.in);
        System.out.print("Lehenengo zenbakia: ");
        num1 = in.nextInt();
        System.out.print("Bigarren zenbakia: ");
        num2 = in.nextInt();
        
        if (num1 > num2) {
            txikiena = num2;
        } else {
            txikiena = num1;
        }
        
        //si ahora calculamos el ZKH, podremos obtener el MKT de una forma más sencilla.
        while (zkh == 0) {
            if (num1 % txikiena == 0 && num2 % txikiena == 0) {
                zkh = txikiena;
            } else {
                --txikiena;
            }
        }
        System.out.println(zkh);
        //una forma eficaz de calcular el MKT, es utilizando el ZKH. Para ello, usaríamos la siguiente formula.
        mkt = (num1 * num2) / zkh;
        System.out.println(mkt);
        
    }
}
