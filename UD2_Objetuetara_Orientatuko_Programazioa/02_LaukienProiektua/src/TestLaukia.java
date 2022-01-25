/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arceredillo.adrian
 */
public class TestLaukia {
    public static void main(String[] args) {
        
        Laukia la1 = new Laukia();
        
        la1.setZabalera(la1.getZabalera() - 2); //modificar la anchura para ver de qué tipo es
        la1.setAltuera(la1.getAltuera() + 1); //modificar la altura para ver de qué tipo es
        
        //me dice si el objeto es horizontal, vertical, cuadrado...
        //ver método getMota() en Laukia.java
        System.out.println(la1.getMota());
        
        //System.out.println(la1);
    }
}
