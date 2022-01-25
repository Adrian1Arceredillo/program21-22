/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosTeoriaChua;

import java.util.Scanner;

/**
 *
 * @author arceredillo.adrian
 */
public class MethodCallStack {
    public static void main(String[] args) {
        
        //4c Exception Handling Assertion --> ehchua - 1.2 Method Call Stack
        /*
        Def. internet: 
        Una aplicación típica implica muchos niveles de llamadas a métodos, que se gestionan mediante la denominada 
        pila de llamadas a métodos. Una pila es una cola de último en entrar, primero en salir. 
        El método main () invoca a methodA (); methodA () llama a methodB (); methodB () llama a methodC ().
        
        En resumen, el último método al que se le llame, será el primero en completarse.
        */ 
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter main()");
        methodA();  //ver el método
        System.out.println("Exit main()");
        
    }
    
    /**
     * Una vez hayamos entrado en este método, a medida que se vaya ejecutando su 
     * contenido, nos encontraremos que existe una llamada a otro método. 
     * En cuanto el programa llegue a dicha llamada, se ejecutará el contenido de 
     * este otro método.
     * 
     * En este caso, mientras ejecutamos methodA(), llamaremos a methodB() y se 
     * ejecutará su contenido. Cuando methodB() termine, volveremos a methodA()
     * 
     */
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    
    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    
    public static void methodC() {
        System.out.println("Enter methodC()");
        
        System.out.println("Exit methodC()");
    }
    
}
