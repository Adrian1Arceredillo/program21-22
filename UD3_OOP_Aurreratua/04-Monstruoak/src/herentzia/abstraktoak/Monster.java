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
public abstract class Monster {
    
    private String name;
    
    
    /**
     * Constructor de un nuevo monstruo.
     * @param name 
     */
    public Monster(String name) {
        this.name = name;
    }
    
    /**
     * Define un comportamiento común llamado attack() para todas sus 
     * subclases. 
     * @return 
     */
    abstract public String attack();
    
}


//las clases abstractas no se pueden instanciar