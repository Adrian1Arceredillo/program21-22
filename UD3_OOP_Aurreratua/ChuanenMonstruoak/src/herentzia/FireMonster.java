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
public class FireMonster extends Monster {
    
    
    public FireMonster(String name) {
        super(name);
    }
    
    /**
     * Métode de la clase padre que hemos modificado para que 
     * cuando se quiera utilizar con un objeto/elemento del 
     * tipo de la subclase, tenga una función diferente a la
     * que tiene en la clase padre (Monster). 
     * 
     * Para ello, tendremos que poner "@Override" justo antes 
     * del método.
     * 
     * @return 
     */
    @Override
    public String attack() {
        return "Attack with FIRE! ";
    }
    
}
