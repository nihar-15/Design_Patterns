/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototype1dp;

/**
 *
 * @author ACER
 */
public class Prototype1Dp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        EmpRecord e1=new EmpRecord("ABC","GHGHG",12,109090);
        
        EmpRecord e2=(EmpRecord)e1.getClone();
        
        e2.setName("bvbvb");
        
        e2.setAge(45);
        
        e1.show();
        e2.show();
    }
}
