/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chainofresponsibilitydp;

/**
 *
 * @author ACER
 */
public class ChainOfResponsibilityDP {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Email e1=new Email("sa@gmail","spam");
        Email e2=new Email("sa@gmail","complaint");
        Email e3=new Email("sa@gmail","fan");
        
        Handler s1=new SpamHandler();
        Handler c1=new ComplaintHandler();
        Handler f1=new FanHandler();
        
        s1.setNextHandler(c1);
        c1.setNextHandler(f1);
        
        s1.handleEmail(e3);
        s1.handleEmail(e2);
        s1.handleEmail(e1);
    }
}
