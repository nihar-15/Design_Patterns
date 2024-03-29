/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsibilitydp;

/**
 *
 * @author ACER
 */
public abstract class Handler {
    
    protected Handler nextHandler;
    
    
    public void setNextHandler(Handler h){
        this.nextHandler=h;
    }
    public abstract void handleEmail(Email e);
}
