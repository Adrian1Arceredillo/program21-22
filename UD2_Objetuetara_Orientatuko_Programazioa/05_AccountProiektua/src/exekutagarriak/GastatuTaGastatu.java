/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import model.Account;

/**
 *
 * @author arceredillo.adrian
 */
public class GastatuTaGastatu {
    public static void main(String[] args) {
        
        int contAteraldiak = 0;
        int balanceNecesBesteAteraldi = 150;
        
        Account a1 = new Account("1284-66", "Adrian", 1000);
        System.out.println(a1.toString());
        System.out.println("");
        //System.out.println("(g) " + prueba1.debit(5));
        
        do {
            a1.debit(150);
            if (a1.getBalance() > 150) {
                ++contAteraldiak;
            } else {
                System.out.println("La cantidad " + a1.getBalance() + " no es suficiente. ");
            }
        } while(a1.getBalance() > 150);
        
        
        System.out.println("Triste nago; " + balanceNecesBesteAteraldi + " euro atera dut " + contAteraldiak + " aldiz, eta orain " + a1.getBalance() + " euro besterik ez zait geratzen kontuan.");
        
        
    }
}
