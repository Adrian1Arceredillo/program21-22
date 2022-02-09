/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazioa;
//import herentzia.*;


/**
 *
 * @author AdriAlex
 */
public class FilthyWaterMonster extends WaterMonster implements Monstruosoa {
    
    
    public FilthyWaterMonster(String name) {
        super(name);
    }
    
    
    public String attack() {
        return "Attack with FILTHY WATER! ";
    }
    
}
