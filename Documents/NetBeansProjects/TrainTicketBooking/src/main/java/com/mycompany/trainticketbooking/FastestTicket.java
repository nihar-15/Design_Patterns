/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainticketbooking;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */


public class FastestTicket implements Strategy{

    @Override
    public Ticket filter(ArrayList<Ticket> arr) {
        
        Ticket op=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).time<op.time){
                op=arr.get(i);
                
            }
        }
        return op;
    }
    
}
