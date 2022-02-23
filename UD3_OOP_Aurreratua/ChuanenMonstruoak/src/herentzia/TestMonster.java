/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herentzia;

/**
 *
 * @author AdriAlex
 */
public class TestMonster {
    public static void main(String[] args) {
        
        //Monster
        Monster mons1 = new Monster("Jefe de todos");
        System.out.println("Nombre: " + mons1.getName());
        System.out.println(mons1.attack());
        System.out.println("----------------");
        
        //FireMonster   -   FireMonster fire1 = new FireMonster("Boss Fuego");
        Monster fire1 = new FireMonster("Boss Fuego");
        System.out.println("Nombre: " + fire1.getName());
        System.out.println(fire1.attack());
        System.out.println("----------------");
        
        //WaterMonster  -   WaterMonster water1 = new WaterMonster("Boss Agua");
        Monster water1 = new WaterMonster("Boss Agua");
        System.out.println("Nombre: " + water1.getName());
        System.out.println(water1.attack());
        System.out.println("----------------");
        
        //FireMonster to WaterMonster
        fire1 = new WaterMonster("Fire To Water");
        System.out.println("Nombre: " + fire1.getName());
        System.out.println(fire1.attack());
        System.out.println("----------------");
        
        //WaterMonster to Monster
        water1 = new Monster("Vuelvo a ser el Jefe");
        System.out.println("Nombre: " + water1.getName());
        System.out.println(water1.attack());
        System.out.println("----------------");
        
        //FilthyWaterMonster
        Monster filthy1 = new FilthyWaterMonster("Agua Lodosa");
        System.out.println("Nombre: " + filthy1.getName());
        System.out.println(filthy1.attack());
        System.out.println("----------------");
        
        //FilthyWaterMonster to FireMonster
        filthy1 = new FireMonster("Fuego Lodoso");
        System.out.println("Nombre: " + filthy1.getName());
        System.out.println(filthy1.attack());
        System.out.println("----------------");
        
    }
}
