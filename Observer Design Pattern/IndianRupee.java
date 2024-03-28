/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obseverdp;

/**
 *
 * @author ACER
 */
public class IndianRupee  implements Observer {

    
     Subject a;
     int val;

    public IndianRupee(Subject a) {
        this.a = a;
        val=a.val+72;
    }

   void display(){
       System.out.println("Current value of Indian Rupee is "+val);
   }
    
     
     
    @Override
    public void makeChange() {
       val=a.val+72;
       display();
    }
    
}
