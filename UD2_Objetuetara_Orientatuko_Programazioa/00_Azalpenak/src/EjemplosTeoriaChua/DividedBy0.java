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
public class DividedBy0 {
    public static void main(String[] args) {
        
        //4c Exception Handling Assertion --> ehchua
        /*apartados:
        1.2 Method Call Stack
        1.3  Exception & Call Stack
        1.4  Exception Classes - Throwable, Error, Exception & RuntimeException
        */
        
        
        System.out.println("Enter main()");
        methodA();  //ver el método
        System.out.println("Exit main()");
        
    }
    
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    
    /**
     * Ejemplo -> crear un método (y meterlo dentro de methodC()) que realice una división 
     * por 0; lo cual desencadena una ArithmeticException. El mensaje que aparecerá será 
     * el siguiente:
     * 
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     *      at EjemplosTeoria.MethodCallStack.methodD(MethodCallStack.java:67)
     *      at EjemplosTeoria.MethodCallStack.methodC(MethodCallStack.java:57)
     *      at EjemplosTeoria.MethodCallStack.methodB(MethodCallStack.java:51)
     *      at EjemplosTeoria.MethodCallStack.methodA(MethodCallStack.java:45)
     *      at EjemplosTeoria.MethodCallStack.main(MethodCallStack.java:28)
     */
    public static void methodB() {
        System.out.println("Enter methodB()");
        System.out.println(1 / 0);      // dividir por 0 desencadena una ArithmeticException
        System.out.println("Exit methodB()");
    }
    
}

