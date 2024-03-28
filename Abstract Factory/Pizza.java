/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactorydemo;

/**
 *
 * @author ACER
 */
public class Pizza  extends Item{
    
    
    Pizza(){
        item ="Pizza";
    }
    
    @Override
    public Item getItem(){
        return this;
    }
}
