/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.statedesignpattern;

/**
 *
 * @author ACER
 */
public class StateDesignPattern {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
      Game g=new Game();
      g.currentLevelResources();
      g.setState(new Level2());
      
        g.currentLevelResources();      
    }
}
