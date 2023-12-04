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


public class CheapestTicket implements Strategy{

    @Override
    public Ticket filter(ArrayList<Ticket> arr) {
        
        Ticket op=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).price<op.price){
                op=arr.get(i);
                
            }
        }
        return op;
    }
    
}
