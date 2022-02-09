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
public interface Monstruosoa {
    //en caso de haber atributos, tendrían que ser PÚBLICOS Y ESTÁTICOS (= klase mailakoak)
    
    /**
     * Define un comportamiento común llamado attack() para todas sus 
     * subclases. 
     * @return 
     */
    public String attack();
    
    
}

//las clases abstractas no se pueden instanciar
