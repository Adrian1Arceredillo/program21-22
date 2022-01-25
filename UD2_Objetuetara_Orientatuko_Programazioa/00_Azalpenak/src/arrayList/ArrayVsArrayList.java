/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class ArrayVsArrayList {

    public static void main(String[] args) {
        
        
        //ARRAY NORMAL - crear un array normal con los siguientes datos.
        String[] izenenArraya = new String[3];
        izenenArraya[0] = "Jaimito";
        izenenArraya[1] = "Jorgito";
        izenenArraya[2] = "Juanito";

        System.out.println("--------------Array normala--------------");
        System.out.print("Array normala: ");
        System.out.println(Arrays.toString(izenenArraya));
        //imprimir un elemento concreto del array -> System.out.println(izenenArraya[2]);
        //imprimir todos los elementos del array
        verContenidoArrayNormal(izenenArraya);

        //vaciar el primer elemento del array
        izenenArraya[0] = null;
        System.out.println(Arrays.toString(izenenArraya));
        
        //en un array SE PUEDEN guardar datos primitivos
        int [] zenbakienArraya = new int [4];  //también se puede hacer: int [] zenbakienArraya = {4, 5, 7, 2}; -> esto hace que, automáticamente, la longitud del array sea la misma que el número de elementos que le pasemos
        zenbakienArraya[0] = 4;
        zenbakienArraya[1] = 5;
        zenbakienArraya[2] = 7;
        zenbakienArraya[3] = 2;
        
        
        //ARRAY LIST 1 - crear un ArrayList con los mismos datos.
        System.out.println("---------------Array lista---------------");
        ArrayList<String> ikasleenArrayLista = new ArrayList<String>();

        ikasleenArrayLista.add("Markel");
        ikasleenArrayLista.add("Aitzol");
        ikasleenArrayLista.add("Adrian");
        ikasleenArrayLista.add("Hodei");
        ikasleenArrayLista.add("Telmo");
        //si queremos introducir un elemento en una determinada posición, tendremos que especificarle la misma -> ikasleenArrayLista.add(2, "Adrian");
        

        System.out.print("Array lista: ");
        System.out.println(ikasleenArrayLista);

        verContenidoArrayList(ikasleenArrayLista);  //metodo para imprimir/ver TODO el contenido del ARRAY NORMAL - definido abajo

        //eliminar un elemento del arrayList
        System.out.println("-------------Array lista (modifikatu ondoren)--------------");
        System.out.println("Modifikazioa: arraylist-aren elementu bat ezabatu. ");
        ikasleenArrayLista.remove(1);
        System.out.println("Array lista: " + ikasleenArrayLista);
        System.out.println("");
        
        //b for-each
        for (String ikaslea : ikasleenArrayLista) {     //antes de ":", es la estructura que tiene más de un elemento --- después de ":", es dónde se va a guardar cada elemento
            System.out.println("Estimado " + ikaslea);
        }
        System.out.println("");
        
        //a verContenidoArrayList(ikasleenArrayLista);    //metodo para imprimir/ver TODO el contenido del ARRAY LIST - definido abajo
        
        //imprimir un elemento concreto del arraylist -> System.out.println(ikasleenArrayLista.get(1));
        System.out.print("Elemento de la posición 2: ");
        System.out.println(ikasleenArrayLista.get(1));
        
        //obtener la posición en la que está la primera ocurrencia
        int posicionArrayList;
        posicionArrayList = ikasleenArrayLista.indexOf("Hodei");    
                //el método indexOf busca en el arraylist el valor que nos pida como parámetro, y devuelve la posición que este ocupa en el arraylist
                //comparará el parámetro con los objetos del arrayList mediante el método EQUALS
                
        //System.out.println(posicionArrayList);
        System.out.println("");
        
        //ARRAY LIST 2 - crear otro ArrayList con elementos de tipo entero.
        //en un arrayList NO SE PUEDEN guardar datos primitivos
        ArrayList<Integer> zenbakienArrayLista = new ArrayList<Integer>();
        ikasleenArrayLista.add("Pedro");

    }

    public static void verContenidoArrayList(ArrayList listaArray) {    //metodo para imprimir/ver TODO el contenido del ARRAY LIST
        for (int i = 0; i < listaArray.size(); ++i) {
            System.out.println((i + 1) + " " + listaArray.get(i));
        }
        System.out.println("");
        //return null;
    }

    public static void verContenidoArrayNormal(String[] arrayNombres) { //metodo para imprimir/ver TODO el contenido del ARRAY NORMAL
        for (int i = 0; i < arrayNombres.length; ++i) {
            System.out.println((i + 1) + " " + arrayNombres[i]);
        }
        System.out.println("");
        //return null;
    }
}
