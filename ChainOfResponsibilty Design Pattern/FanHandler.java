/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsibilitydp;

/**
 *
 * @author ACER
 */
public class FanHandler extends Handler {
    
    
     @Override
     public  void handleEmail(Email e){
         if(e.type.equalsIgnoreCase("Fan")){
             System.out.println("Mail directed to CEO");
         }else{
             this.nextHandler.handleEmail(e);
         }
     }
    
    
}
