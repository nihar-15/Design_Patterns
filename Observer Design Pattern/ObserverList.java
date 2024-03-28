/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obseverdp;

/**
 *
 * @author ACER
 */
import java.util.*;
public class ObserverList {
    
    ArrayList<Observer> arr=new ArrayList<>();
    
    void add1(Observer a){
        arr.add(a);
    }
      void remove1(Observer a){
        arr.remove(a);
    }
      
     void  notifyAllObservers(){
         for(Observer a:arr){
             a.makeChange();
         }
     }
    
}
