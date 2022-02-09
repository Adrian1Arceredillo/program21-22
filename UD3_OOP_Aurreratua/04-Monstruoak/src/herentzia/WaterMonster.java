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
public class WaterMonster extends Monster {
    
    /**
     * Constructor de un nuevo Monstruo (clase Monster). Este monstruo nuevo 
     * tendrá unas características concretas (clase WaterMonster).
     * 
     * Es decir, es un objeto de tipo Monster, pero con características de 
     * la clase WaterMonster. 
     * @param name 
     */
    public WaterMonster(String name) {
        super(name);
    }
    
    /**
     * Se definirán unos valores nuevos para esta clase (WaterMonster), en el 
     * método attack().
     * 
     * @return 
     */
    @Override
    public String attack() {
        return "Attack with WATER! ";
    }
    
}
