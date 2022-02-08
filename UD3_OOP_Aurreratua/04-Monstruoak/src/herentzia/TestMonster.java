/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herentzia;

/**
 *
 * @author arceredillo.adrian
 */
public class TestMonster {

    public static void main(String[] args) {
        
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("fuego");   // upcast
        Monster m2 = new WaterMonster("agua");  // upcast
        Monster m3 = new StoneMonster("piedra");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        // m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());
        System.out.println("----");

        // We have a problem here!!!
        
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());  // garbage!!!
        
        //!^_&^$@+%$* I don't know how to attack!
        //filthyWaterMonster - subclase de una subclase
        Monster f1 = new FilthyWaterMonster("hola");
        System.out.println(f1.attack());
        
        f1 = new WaterMonster("aa2aa");
        System.out.println(f1.attack());
    }
}
