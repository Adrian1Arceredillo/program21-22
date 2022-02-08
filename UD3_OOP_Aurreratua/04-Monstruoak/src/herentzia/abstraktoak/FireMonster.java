/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herentzia.abstraktoak;

/**
 *
 * @author arceredillo.adrian
 */
public class FireMonster extends Monster {
    
    
    /**
     * Constructor de un nuevo Monstruo (clase Monster). Este monstruo nuevo 
     * tendrá unas características concretas (clase FireMonster).
     * 
     * Es decir, es un objeto de tipo Monster, pero con características de 
     * la clase FireMonster. 
     * @param name 
     */
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with FIRE! ";
    }

    
    
    
    
}
