/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterdemo;

/**
 *
 * @author ACER
 */
public class AudioPlayer implements MultiMediaPlayer{
    
    Adapter adaptee;
    
    @Override
    public void play(String ext,String song){
        if(ext.equalsIgnoreCase("mp3")){
            System.out.println("I am the AudioPlayer playing " +song);
        }else{
            adaptee=new Adapter();
            adaptee.play(ext,song);
        }
    }
    
   
    
}
