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
public class StoneMonster extends Monster {
    
    /**
     * Constructor de un nuevo Monstruo (clase Monster). Este monstruo nuevo 
     * tendrá unas características concretas (clase StoneMonster).
     * 
     * Es decir, es un objeto de tipo Monster, pero con características de 
     * la clase StoneMonster. 
     * @param name 
     */
    public StoneMonster(String name) {
        super(name);
    }
    
    
    /**
     * Se definirán unos valores nuevos para esta clase (StoneMonster), en el 
     * método attack().
     * 
     * @return 
     */
    @Override
    public String attack() {
        return "Attack with STONES! ";
    }
    
    
}
