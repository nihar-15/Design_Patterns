/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxydp;

/**
 *
 * @author ACER
 */
public class BankServer implements Bank {
    
    public void deposit(Account a,float amt){
        a.bal+=amt;
    }
   
    public void withdraw(Account a,float amt){
        a.bal -= amt;
    }
    @Override
    public void transfer(Account sender, Account rec, float amt) {
       this.withdraw(sender,amt);
       this.deposit(rec,amt);
       System.out.println("Transfer succesfully");
               
    }
    
}
