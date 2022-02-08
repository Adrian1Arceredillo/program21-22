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
public class Monster {
    
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
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
    
}
