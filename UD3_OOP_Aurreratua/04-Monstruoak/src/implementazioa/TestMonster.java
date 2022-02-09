/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazioa;

/**
 *
 * @author AdriAlex
 */
public class TestMonster {

    public static void main(String[] args) {
        // Declare instances of the superclass, substituted by subclasses.
        Monstruosoa m1 = new FireMonster("fuego");   // upcast
        Monstruosoa m2 = new WaterMonster("agua");  // upcast
        Monstruosoa m3 = new StoneMonster("piedra");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        // m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());
        
        System.out.println("--------");
        Monstruosoa filthy1 = new FilthyWaterMonster("Filthy");
        System.out.println(filthy1.attack());
        System.out.println("b");
        
        // We have a problem here!!!
        //Monstruosoa m4 = new Monstruosoa("u2u2");   //la clase Monstruosoa NO se puede instanciar - ya que es abstracta
        
    }
}