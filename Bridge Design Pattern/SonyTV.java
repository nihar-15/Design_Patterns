/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgedp;

/**
 *
 * @author ACER
 */
public class SonyTV implements TV {

    @Override
    public void on() {
    System.out.println("Sony tv on");
    }

    @Override
    public void off() {
          System.out.println("Sony tv off");
    }

    @Override
    public void setChannel(int c) {
       System.out.println("Sony tv tuned to channel "+c);   
    }
}
