/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compositedp;

/**
 *
 * @author ACER
 */
public class CompositeDP {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
      Component c1 =new SubComponent("A",109);
      Component c3 =new SubComponent("d",9);
      Component c2 =new SubComponent("c",19);
      Component c4 =new SubComponent("b",10);
       Component C1 =new MajorComponent("A1");
        
        C1.addComponent(c1);
        
        C1.addComponent(c2);
        
        C1.addComponent(c3);
        
        Component C2 =new MajorComponent("B1");
        
        C2.addComponent(C1);
         C2.addComponent(c4);
         
         C2.showPrice();
        
    }
}
