/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxydp;

/**
 *
 * @author ACER
 */
public class ProxyDp {

    public static void main(String[] args) {
        System.out.println("Hello Baby!");
        
        Bank obj=new BankProxyServer();
        Account a1=new Account(10001,98800,"Rohan");
        Account a2=new Account(10003,00,"Mohan");
        Account a3=new Account(10091,100,"Sohan");
        
        obj.deposit(a3, 2000);
        System.out.println(a3);
        obj.withdraw(a2, 100000);
        obj.transfer(a1, a3, 10000);
        System.out.println(a1);
    }
}
