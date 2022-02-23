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
public class TestMonstruosoa {
    public static void main(String[] args) {
        
        Monstruosoa m1 = new FireMonster("Boss Fuego");   // upcast
        Monstruosoa m2 = new WaterMonster("Boss Agua");  // upcast
        
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println("----------------");
        
        m1 = new WaterMonster("Fire To Water");  // upcast
        System.out.println(m1.attack());
        
    }
}
