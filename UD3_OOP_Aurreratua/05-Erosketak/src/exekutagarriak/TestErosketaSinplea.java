/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import model.*;
/**
 *
 * @author arceredillo.adrian
 */
public class TestErosketaSinplea {
    public static void main(String[] args) {
        
        //nuevo cliente
        Bezeroa cliente1 = new Pertsona(2, "Pedro", "Lopez", 
                    "Azitain z/g. Eibar.", "loPedro@uni.eus");
        
        //Erosketa bat sortu
        Erosketa erosketa1 = new Erosketa("E18-01", cliente1, 300);
        System.out.println(erosketa1.toString());
        
        
        
    }
}
