/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositedp;

/**
 *
 * @author ACER
 */

import java.util.ArrayList;

public class MajorComponent implements Component {
    
  
    String name;
    float price;

    public MajorComponent(String name) {
        this.name = name;
        
    }
    
    
    ArrayList<Component> arr=new ArrayList<>();

    @Override
    public void addComponent(Component c) {
        
    arr.add(c);
    price += c.getPrice();
    }

    public float getPrice() {
        return price;
    }
    

    @Override
    public void removeComponent(Component c) {
        arr.remove(c);
    }

    @Override
    public void showPrice() {
       
        
        System.out.println(name+":");
        
        for(int i=0;i<arr.size();i++){
            arr.get(i).showPrice();
        }
        
        System.out.println("Total price:  "+price);
    }
    
    
    
    
    
}
