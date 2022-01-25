
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arceredillo.adrian
 */
public class Laukia {

    private int zabalera;
    private int altuera;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zabalera, int altuera) {
        this.zabalera = zabalera;   //"this" es para diferenciar entre conceptos con el mismo nombre; permitiendo referirnos al que nosotros le pongamos "this" por delante
        this.altuera = altuera;
        /*si no queremos poner "this";
        public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
         */

    }
    
    /**
     * Obtener el valor correspondiente a la ANCHURA del elemento (cuadrado)
     * @return -> anchura del elemento
     */
    public int getZabalera() {
        return zabalera;
    }
    
    /**
     * Obtener el valor correspondiente a la ALTURA del elemento (cuadrado)
     * @return -> altura del elemento
     */
    public int getAltuera() {
        return altuera;
    }
    
    /**
     * Obtener el valor del área del cuadrado(s) deseado(s). Para ello se realizará el cálculo del método.
     * @return -> valor del área
     */
    public int getAzalera() {
        return zabalera * altuera;
    }
    
    /**
     * Obtener el valor del perímetro del cuadrado(s) deseado(s). Para ello se realizará el cálculo del método.
     * @return -> valor del perímetro
     */
    public int getPerimetroa() {
        return 2 * zabalera + 2 * altuera;
    }
    
    /**
     * Establecer una nueva ANCHURA
     * @param zabaleraBerria 
     */
    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }
    
    /**
     * Establecer una nueva ALTURA
     * @param altueraBerria 
     */
    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }
    
    /**
     * Convertir un elemento del array, o un array, en un String; de esta forma se podrá imprimir correctamente
     * @return -> un string con el dato deseado
     */
    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";
    }
    
    /**
     * Con este método se busca conocer de qué tipo es el cuadrado que nosotros especifiquemos
     * @return -> tipo de cuadrado (horizontal o vertical) será diferente en función de las dimensiones de los cuadrados.
     * 
     */
    public String getMota() {
        String laukiMota = "";
        if (zabalera > altuera) {
            laukiMota = "Horizontala da.";
            //System.out.println(laukiMota);
        } else if (altuera > zabalera) {
            laukiMota = "Bertikala da.";
            //System.out.println(laukiMota);
        } else if (zabalera == altuera) {
            laukiMota = "Karratua da.";
            //System.out.println(laukiMota);
        }
        return laukiMota;

    }
    
    /**Este método tiene como objetivo, dibujar el lauki completo; es decir, dibujar tanto el contorno, como el interior.
     * (ver bucle 'for' del método).
     */
    public void marraztuBeteta() {

        for (int row = 1; row <= altuera; ++row) {
            for (int col = 1; col <= zabalera; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    /**Este método tiene como objetivo, dibujar el contorno/silueta de X cuadrado del array, en función de sus dimensiones.
     * Para ello, hay que establecer como condición, que solamente se dibujen las líneas laterales. (ver sentencia 'if' del método).
     */
    public void marraztuHutsik() {
        for (int row = 1; row <= altuera; ++row) {
            for (int col = 1; col <= zabalera; ++col) {
                if (row == 1 || row == altuera || col == 1 || col == zabalera) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                //System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    /**
     * Compara dos elementos (cuadrados del array), para saber cuál de los dos es más grande.
     * @param besteLaukia
     * @return -> devolverá true si el cuadrado indicado es más grande que el otro.
     */
    public boolean isBiggerThan(Laukia besteLaukia) {
        if (this.getAzalera() > besteLaukia.getAzalera()) {
            return true;
        } else {
            return false;
        }
    }
    
    
    /**
     * Este método devuelve qué elemento (cuadrado) del array (laukiak) es el más grande; es decir, el que tenga el mayor área.
     * @param otherLaukiak -> Laukia klasearen array bat. Array honen elementuak, hutsik egon ahal dira.
     * @return -> arrayaren zein karratu da handiena (referencia)
     */
    public static Laukia getTheBiggest(Laukia[] otherLaukiak) {     // or -> public Laukia getTheBiggest(Laukia[] otherLaukiak)
    

        Laukia handienaLauki = otherLaukiak[0];

        for (int i = 1; i <= otherLaukiak.length - 1 && otherLaukiak[i] != null; ++i) {
            if (otherLaukiak[i].isBiggerThan(handienaLauki)) {
                handienaLauki = otherLaukiak[i];

            }
        }
        System.out.println("Laukirik handiena hau da: " + handienaLauki.toString());
        //return handienaLauki;
        return null;
    }
    
    /**
     * 
     * @param laukiak -> es un array de la clase Laukiak. Dentro tendra múltiples laukiak
     * @return -> ordenara los elementos (cada cuadrado) del array (laukiak). En este caso, de menor a mayor
     */
    public static Laukia ordenatu(Laukia[] laukiak) {

        //Laukia temporal = laukiak[0];

        for (int i = 0; i < laukiak.length; i++) {
            Laukia temporal = laukiak[i];       // --> ?
            for (int j = 1; j < (laukiak.length - i); j++) {
                if (laukiak[j - 1].isBiggerThan(laukiak[j])) {
                    temporal = laukiak[j - 1];
                    laukiak[j - 1] = laukiak[j];
                    laukiak[j] = temporal;
                }
            }
        }
        //System.out.println(Arrays.toString(laukiak));
        return null;
    }
}
//Documentación sobre clases, tipos de clases... -> https://docs.oracle.com/javase/8/docs/api/index.html

//https://www.discoduroderoer.es/formas-de-ordenar-un-array-en-java/
//https://es.stackoverflow.com/questions/106335/ordenar-arreglo-de-menor-a-mayor

/*public static Laukia ordenatu(Laukia[] laukiak) {
        
        //Laukia handienaLauki = laukiak[0];
        for (int i = 0; i <= laukiak.length - 1; ++i) {
            for (int j = i + 1; j < laukiak.length; ++j) {
                if (laukiak[i].isBiggerThan(laukiak[i + 1])) {
                    Laukia variableauxiliar = laukiak[i];
                    laukiak[i] = laukiak[j];
                    laukiak[j] = variableauxiliar;
                } 
            }

        }
        return null;
    }*/


