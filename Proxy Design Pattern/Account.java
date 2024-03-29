/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxydp;

/**
 *
 * @author ACER
 */
class Account {
    int acNo;
    float bal;
    String name;

    
    public Account(int acNo, float bal, String name) {
        this.acNo = acNo;
        this.bal = bal;
        this.name = name;
    }

    public int getAcNo() {
        return acNo;
    }

    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    public float getBal() {
        return bal;
    }

    public void setBal(float bal) {
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Account{" + "acNo=" + acNo + ", bal=" + bal + ", name=" + name + '}';
    }


    
}
