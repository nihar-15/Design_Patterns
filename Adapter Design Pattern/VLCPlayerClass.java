/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterdemo;

/**
 *
 * @author ACER
 */
public class VLCPlayerClass implements AdvanceMediaPlayer {

    @Override
    public void playVLC(String ext, String song) {
         System.out.println("I am VLCPlayer playing  "+song);
    }

    @Override
    public void playmp4(String ext, String song) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
