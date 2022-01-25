/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosTeoriaChua;

/**
 *
 * @author arceredillo.adrian
 */
public class Zati0_Adrian {

    public static void main(String[] args) {

        //utilizando try-catch
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
     * Ejemplo -> crear un método (y meterlo dentro de methodC()) que realice
     * una división por 0; lo cual desencadena una ArithmeticException. El
     * mensaje que aparecerá será el siguiente:
     *
     * Exception in thread "main" java.lang.ArithmeticException: / by zero at
     * EjemplosTeoria.MethodCallStack.methodD(MethodCallStack.java:67) at
     * EjemplosTeoria.MethodCallStack.methodC(MethodCallStack.java:57) at
     * EjemplosTeoria.MethodCallStack.methodB(MethodCallStack.java:51) at
     * EjemplosTeoria.MethodCallStack.methodA(MethodCallStack.java:45) at
     * EjemplosTeoria.MethodCallStack.main(MethodCallStack.java:28)
     */
    public static void methodB() {
        System.out.println("Enter methodB()");

        try {
            System.out.println("1/0 = " + 1 / 0);   // dividir por 0 desencadena una ArithmeticException
        } catch (ArithmeticException ex) {
            System.out.println("Ez dakit 0 zenbakiarekin zatitzen. ");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
        
        System.out.println("Exit methodB()");
    }
}
