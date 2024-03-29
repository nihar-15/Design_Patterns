/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsibilitydp;

/**
 *
 * @author ACER
 */
public class Email {
    
    String sender,type;

    public Email(String sender, String type) {
        this.sender = sender;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Email{" + "sender=" + sender + ", type=" + type + '}';
    }
        
}
