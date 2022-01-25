/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arceredillo.adrian
 */
public class Account {
    
    private String id;
    private String name;
    private int balance = 0;
    
    
    public Account (String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public void setName(String nuevoNombre) {
        this.name = nuevoNombre;
    }
    
    /**
     * Suma amount (cantidades) a balance (saldo)
     * @param amount
     * @return 
     */
    public int credit (int amount) {
        this.balance = this.balance + amount;
        return balance;
    }
    
    /**
     * Si amount es MENOR o IGUAL que balance, a balance se le restará 
     * amount. De lo contrario, imprimiremos "Amount exceeded balance"
     * @param amount
     * @return balance
     */
    public int debit (int amount) {
        
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("Amount exceeded balance. No hay dinero suficiente para sacar. ");
        }
        return balance;
    }
    
    public int transferTo (Account otraCuenta, int amount) {
        if (amount <= balance) {
            //this.debit(amount)
            this.debit(amount);
            otraCuenta.credit(amount);
        } else {
            System.out.println("Amount exceeded balance. ");
        }
        return balance;
    }
    
    
    public String toString() {
        return "Account[id = " + this.getId() + ", " + this.getName() + ", " + this.getBalance() + "]";
    }
    
    
}
