/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proxydp;

/**
 *
 * @author ACER
 */
public interface Bank {
    
    public void transfer(Account sender,Account rec,float amt );
    public void deposit(Account a,float amt);
    public void withdraw(Account a,float amt);
    
}
