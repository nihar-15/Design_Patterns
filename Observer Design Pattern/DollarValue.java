/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obseverdp;

/**
 *
 * @author ACER
 */
public class DollarValue extends Subject{
    
    
    
    ObserverList a;

    public DollarValue(int val) {
        this.val = val;
        a=new ObserverList();
    }

    @Override
    public void update(int param) {
       val=param;
       a.notifyAllObservers();
        
    }

    @Override
    public void update(String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "DollarValue{" + "val=" + val + ", a=" + a + '}';
    }

   
    
    
}
