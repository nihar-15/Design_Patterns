/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositedp;

/**
 *
 * @author ACER
 */
public class SubComponent implements Component {

    
    
    String name;
    float price;

    public SubComponent(String name, float price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void addComponent(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeComponent(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        
        
        System.out.print(price);
    }
    
   
    
}
