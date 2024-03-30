/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridgedp;

/**
 *
 * @author ACER
 */
public class BridgeDp {

    public static void main(String[] args) {
        RemoteControl rc=new ConcreteRemote(new SonyTV(),100);
        rc.on();
        rc.setChannel(50);
        rc.off();
    }
}
