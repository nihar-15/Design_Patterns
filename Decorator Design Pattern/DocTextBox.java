/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratordemo;

/**
 *
 * @author ACER
 */
public class DocTextBox extends TextBox {
    double val;
    
    
  DocTextBox(){
  val=500;
 }

    @Override
 public double show(String S){
     //You can type text here
     return val;
 }
    
}
