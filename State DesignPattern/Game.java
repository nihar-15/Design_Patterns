/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statedesignpattern;

/**
 *
 * @author ACER
 */
public class Game {
    
    Level l;
    
    Game(){
        l=new Level1();
        
    }
    
    void setState(Level l){
        this.l=l;
    }
    
    void currentLevelResources() {
        this.l.currentLevelResources();
    }
    
}
