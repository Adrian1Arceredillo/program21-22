package probak;



import java.util.Arrays;
import model.Zatikia;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class TestZatikia {
    
    private static Zatikia[] zatikiak = new Zatikia[3];
    

    public static void main(String[] args) {
        
        
        Zatikia fr1 = new Zatikia(1, 2);
        Zatikia fr2 = new Zatikia(2, 3);
        Zatikia fr3 = new Zatikia(3, 4);
        Zatikia fr4 = new Zatikia(4, 5);
        Zatikia fr5 = new Zatikia(5, 6);
        Zatikia fr6 = new Zatikia(6, 7);
        
        Zatikia fr11 = new Zatikia(2, 6);
        Zatikia fr12 = new Zatikia(3, 9);
        Zatikia fr13 = new Zatikia(1, 5);
        Zatikia fr14 = new Zatikia(5, 5);
        
        //
        System.out.printf("%.2f", fr14.hamartarBaliokidea());
        if (fr14.hamartarBaliokidea() >= 1) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
        System.out.println("");
        
        Zatikia zatRandom = new Zatikia();
        System.out.println(zatRandom.toString());
        System.out.println("---------");
        //Multiplicar dos fracciones
        Zatikia fr15 = Zatikia.biderkatu(fr3, fr4);
        System.out.print("Biderketa: " + fr15);        
        System.out.println(" --> Bi zatiki biderkatu, eta zatiki berri bat sortu emaitzarekin. ");
        System.out.println("---------");
        
        //Sumar dos fracciones
        Zatikia fr16 = Zatikia.batu(fr1, fr4);
        System.out.print("Batuketa zatiki berrian: " + fr16);
        System.out.println(" --> Bi zatikiren batuketa egin, eta emaitza zatiki eran bueltatu. ");
        System.out.println("---------");
        
        //en la fracción actual, guardar el resultado de la suma entre la actual y la otra
        fr1.batu(fr3);
        System.out.println(fr1);
        System.out.println(" --> Bi zatiki batu, eta emaitza lehenengo zatikian sartu. ");
        System.out.println("---------");
        
        //simplificar una fracción todo lo que se pueda.
        
        //System.out.println(" --> Zatikiaren bi balioak, ahal den neurrian sinplifikaturik adierazi. ");
        
        //pasándole un string, haremos que lo que esté a la izquierda de "/" (separador) sea el numerador, y lo que se encuentre a la derecha sea el denominador
        Zatikia fr7 = new Zatikia("7/8");
        System.out.print(fr7.toString());
        System.out.println(" --> String bat pasatuta, zenbakitzailea eta izendatzailea daukan zatiki berri bat sortu. ");
        System.out.println("---------");
        
        //obtener la división entre el numerado y el denominador
        System.out.printf("%.2f", fr2.hamartarBaliokidea());
        
        System.out.println(" --> Zenbakitzailearen eta izendatzailearen arteko zatiketaren emaitza. " + fr2);
        
        System.out.printf("%.2f", fr7.hamartarBaliokidea());
        System.out.println(" --> Zenbakitzailearen eta izendatzailearen arteko zatiketaren emaitza. " + fr7);
        
        //saber si una fracción es mayor que otra.
        if (fr7.isBiggerThan(fr2) == true) {
            System.out.println("La fracción " + fr7 + "(" + fr7.hamartarBaliokidea() + ") es mayor que " + fr2 + "(" + fr2.hamartarBaliokidea() + ")");
        } else {
            System.out.println("No es mayor. ");
        }
        System.out.println("---------");
        
        //saber si dos fracciones son equivalentes o no.
        System.out.println(fr11);
        System.out.println(fr7);
        if (fr11.isBaliokidea(fr7) == true ) {
            System.out.println("Son iguales. ");
        } else {
            System.out.println("No son iguales. ");
        }
        System.out.println("---------");
        
        
        //crear tantas fracciones como elementos quepan en el array de objetos (fracciones)
        for (int i = 0; i <= zatikiak.length - 1; ++i) {
            zatikiak[i] = new Zatikia();
        }
        System.out.println(Arrays.toString(zatikiak));
        System.out.println("---------");
        
        //ordenar los objetos (fracciones) del array (p.e.: de mayor a menor)
        zatikiak[2].zatikiakOrdenatu(zatikiak);
        System.out.println("Zatikiak ordenatuta: " + Arrays.toString(zatikiak));
        System.out.println("---------");
        
        //RESTA entre dos fracciones con MISMO DENOMINADOR
        Zatikia fr17 = Zatikia.kenketa(fr12, fr13);
        System.out.print("Kenketa = " + fr17);
        System.out.println(" --> Resta entre dos fracciones.");
    }

    //0,85714285714285714285714285714286
}

//http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/estatico/fraccion/fraccion.htm