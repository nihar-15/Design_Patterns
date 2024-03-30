/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapterdemo;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class AdapterDemo {

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        
        AudioPlayer obj=new AudioPlayer();
        System.out.println("Enter Extension:");
        String ext= sc.next();
        System.out.println("Enter Song:");
        String song= sc.next();
        
        obj.play(ext,song);
        
        obj.play("vlc", "ABBS");
        obj.play("mp3", "ACSSS");
    
       obj.play("mp4x", "ACSSS");
    }
}
