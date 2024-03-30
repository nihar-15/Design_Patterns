/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgedp;

/**
 *
 * @author ACER
 */
public class ConcreteRemote extends RemoteControl{
    int currentChannel;
    public ConcreteRemote(TV tv,int c) {
        super(tv);
        this.currentChannel=c;
    }
    
       public void nextChannel(){       
        currentChannel++;   
        setChannel(currentChannel);   
    }      
    public void prevChannel(){       
        currentChannel--;   
        setChannel(currentChannel);   
    }      
    
}
