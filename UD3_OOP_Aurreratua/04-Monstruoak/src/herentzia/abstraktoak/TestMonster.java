/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herentzia.abstraktoak;

/**
 *
 * @author AdriAlex
 */
public class TestMonster {
    public static void main(String[] args) {
        
        //declarar instancias de la superclase, sustituidos por las subclases
        Monster m1 = new FireMonster("fuego");
        Monster m2 = new WaterMonster("agua");
        Monster m3 = new StoneMonster("piedra");
        
        //invocar la implementación actual - ver el ataque de cada monstruo
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        System.out.println("--------");
        
        //cambiar el tipo de monstruo de m1
        m1 = new StoneMonster("piedra nueva");
        System.out.println(m1.attack());
        System.out.println("--------");
        
        //nuevo monstruo de tipo Monster
        //  Monster m4 = new Monster("u2u2");   //la clase Monster NO se puede instanciar - ya que es abstracta
        //System.out.println(m4.attack());
        System.out.println("--------");
        
        //filthyWaterMonster - subclase de una subclase
        Monster filthy1 = new FilthyWaterMonster("Filthy");
        System.out.println(filthy1.attack());
        
        filthy1 = new StoneMonster("Filthy to Stone");
        System.out.println(filthy1.attack());
        
    }
}
