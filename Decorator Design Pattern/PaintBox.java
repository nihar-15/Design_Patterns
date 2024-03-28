/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratordemo;

/**
 *
 * @author ACER
 */
public class PaintBox extends TextBox{
    
    double value;

 public PaintBox() {
  value=100;
 }

    @Override
 public double show(String S){
  return value;
 }

}
