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
public class WaterMonster implements Monstruosoa {

    String name;
    
    public WaterMonster(String name) {
        this.name = name;
    }
    
    @Override
    public String attack() {
        return "Attack with Water! ";
    }
    
}
