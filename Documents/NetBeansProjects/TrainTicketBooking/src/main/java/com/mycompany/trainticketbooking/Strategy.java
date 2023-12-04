/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.trainticketbooking;

/**
 *
 * @author ACER
 */

import java.util.*;

public interface Strategy {
    
    public Ticket filter(ArrayList<Ticket> arr);
    
}
