/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obseverdp;

/**
 *
 * @author ACER
 */
public class EuropeanEuro implements Observer {

    
     Subject a;
     int val;

    public  EuropeanEuro(Subject a) {
        this.a = a;
        val=a.val+30;
    }

   void display(){
       System.out.println("Current value of  European Euro is "+val);
   }
    
     
     
    @Override
    public void makeChange() {
       val=a.val+30;
       display();
    }
    
    
}
