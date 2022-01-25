
import java.util.Arrays;
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
public class MetodoInteresgarriak {

    public static void main(String[] args) {

        int num1, num2; //números para calcular el MKT
        int num3;   //número para factorizar
        
        Scanner in = new Scanner(System.in);
        System.out.println("Mkt:");
        System.out.print("Lehenengo zenbakia:");
        num1 = in.nextInt();
        System.out.print("Bigarren zenbakia:");
        num2 = in.nextInt();
        
        System.out.println("");
        System.out.println("Faktorizatu:");
        System.out.println("Zein zenbaki nahi duzu faktorizatu? ");
        num3 = in.nextInt();
        
        while (num3 <= 0) {
            System.out.print("Mesedez, zenbaki POSITIBO bat sartu:");
            num3 = in.nextInt();
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("EMAITZAK:");
        System.out.println("Mkt -> Sarturiko bi zenbakien MKT-a " + mkt(num1, num2) + " da. ");
        //System.out.println("Faktorizatu -> Hauek dira sarturiko zenbakien faktoreak: " + Arrays.toString(faktorizatu(num3)));
        System.out.print("Faktorizatu - > Zenbakiaren faktore guztiak: ");
        faktorizatu(num3);

    }

    public static int mkt(int zenb1, int zenb2) {
        
        int txikiena;   //esta variable recogerá el valor del número más pequeño. Con esto podremos obtener el MKT
        int mkt = 0;
        int zkh = 0;    //para calcular el MKT de una forma más sencilla, se puede utilizar el ZKH. Este habrá que calcularlo también.

        if (zenb1 > zenb2) {
            txikiena = zenb2;
        } else {
            txikiena = zenb1;
        }
        //si ahora calculamos el ZKH, podremos obtener el MKT de una forma más sencilla.
        while (zkh == 0) {
            if (zenb1 % txikiena == 0 && zenb2 % txikiena == 0) {
                zkh = txikiena;
            } else {
                --txikiena;
            }
        }
        //teniendo ya el ZKH, obtener el MKT
        mkt = (zenb1 * zenb2) / zkh;
        return mkt;
    }
    
    public static int[] faktorizatu(int zenb3) {
        
        int i = 2;          //los números que se utilizarán para buscar los factores del número introducido. Se irá incrementando en uno, a medida que sea necesario.
        int j = 0;          //posición del array en la que se mostrarán los factores encontrados de dicho número.
        int[] intFaktoreak = new int[50];
        
        while (zenb3 > 1) {
            if (zenb3 % i == 0) { //si al dividir el número entre el valor de "i", el resto es 0, "i" será un factor de ese número.

                zenb3 = zenb3 / i;  //dividimos entre "i" para continuar obteniendo factores.

                intFaktoreak[j] = i; //los factores del número se irán guardando en el array.
                ++j;    //incrementamos el valor de "j" (posición del array), para que el siguiente factor, se ponga en la siguiente posición del array
            } else {
                ++i;    //si al dividir el número entre "i", el resto es DISTINTO de 0, se incrementará en 1 el valor de "i".
            }
        }
        System.out.print("[");
        for (int x = 0; x < j; x++) {   //la condición "x < j" hace que, durante el bucle, se irán mostrando los datos del array, hasta llegar a "j", que es número total de elementos (factores encontrados)
            if (x == 0) {
                System.out.print(intFaktoreak[0]);
            } else {
                System.out.print(", " + intFaktoreak[x]);
            }
        }
        System.out.println("]");
        /*System.out.print("[");
        for (i = 0; i < j; i++) {
            System.out.print(intFaktoreak[i]);
        }
        System.out.print("]");*/
        return intFaktoreak;
        
    }
}
