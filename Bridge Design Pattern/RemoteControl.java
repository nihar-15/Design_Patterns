/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgedp;

/**
 *
 * @author ACER
 */
public  abstract class RemoteControl {
    protected TV implementor;          
    protected RemoteControl(TV tv){
      this.implementor = tv;
    }
    public void on(){      
        implementor.on();   
    }   
    public void off(){      
        implementor.off();   
    }      
    public void setChannel(int channel){   
        implementor.setChannel(channel);   
    }
}
