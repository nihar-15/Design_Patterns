/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterdemo;

/**
 *
 * @author ACER
 */
public class Adapter {
 
    AdvanceMediaPlayer obj;
    public Adapter() {
    System.out.println("Adapter intialized");
    }
    
    public void play(String ext,String song){
        if(ext.equalsIgnoreCase("mp4")){
            obj= new MP4PlayerClass();
            obj.playmp4(ext, song);
        }
         if(ext.equalsIgnoreCase("vlc")){
            obj= new VLCPlayerClass();
            obj.playVLC(ext, song);
        }
    }
     
    
}
