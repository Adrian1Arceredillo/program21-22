/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import java.util.Scanner;
import model.Account;
/**
 *
 * @author arceredillo.adrian
 */
public class TestAccount {
    public static void main(String[] args) {
        
        
        System.out.println("TESTING ACCOUNT CLASS");
        System.out.println("=======================");
        
        //testear constructores y el método toString()
        Account a1 = new Account("1023-21", "Adrian", 1000);    //método -> Account (String id, String name, int balance)
        System.out.println("(a) " + a1.toString());
        
        Account a2 = new Account("2563-01", "Juan"); //método -> Account (String id, String name)
        System.out.println("(b) " + a2.toString());
        
        //testear getters y setters
        System.out.println("(c) " + a1.getId());
        a1.setName("Anne");
        System.out.println("(d) " + a1.getName());
        System.out.println("(e) " + a1.getBalance());
        
        //testear credit() y debit()
        System.out.println("(f) " + a1.credit(10));
        System.out.println("(g) " + a1.debit(5));
        System.out.println("(h) " + a1.debit(2000)); //tiene que dar error; ya que el valor introducido es mayor que balance
        
        //testear el método transferTo()
        a1.transferTo(a2, 100);
        System.out.println("(i) " + a1.toString());
        System.out.println("(j) " + a2.toString());
        
        a2.transferTo(a1, 150);
        System.out.println("(k) " + a1.toString());
        System.out.println("(l) " + a2.toString());
    }
}
