/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.obseverdp;

/**
 *
 * @author ACER
 */
public class ObseverDP {

    public static void main(String[] args) {
        Subject obj=new DollarValue(1);
        Observer o1= new IndianRupee(obj);
        Observer o2= new EuropeanEuro(obj);
       obj.a.add1(o1); 
    }
}
