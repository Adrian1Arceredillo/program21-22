/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class Konbertsioak {

    public static void main(String[] args) {

        //String => int
        int aldagai0 = Integer.valueOf("0");
        int aldagai1 = Integer.parseInt("1");

        //int => String
        String aldagai2 = String.valueOf(2);
        String aldagai3 = "" + 3;
        String aldagai4 = String.format("%d", 4);
        String aldagai5 = Integer.toString(5);

        //double => String        
        String aldagai6 = String.valueOf(6.6666666);
        String aldagai7 = String.format("%10.2f", 7.77777777);

        //String => double
        double aldagai8 = Double.parseDouble("8");

        //char[] => String
        char[] array1 = {'a', 'b', 'c'};
        String aldagai9 = new String(array1);

        //imprimir todos los resultados
        //String => int
        System.out.println("-----------------");
        System.out.println("//String => int");
        System.out.println(aldagai0);
        System.out.println(aldagai1);
        System.out.println("-----------------");
        System.out.println("//int => String");
        System.out.println(aldagai2);
        System.out.println(aldagai3);
        System.out.println(aldagai4);
        System.out.println(aldagai5);
        System.out.println("-----------------");
        System.out.println("//double => String");
        System.out.println(aldagai6);
        System.out.println(aldagai7);
        System.out.println("-----------------");
        System.out.println("//String => double");
        System.out.printf("%.2f", aldagai8);
        System.out.println("");

        System.out.println("-----------------");
        System.out.println("//char[] => String");
        System.out.println(aldagai9);
    }
}
