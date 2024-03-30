/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype1dp;

/**
 *
 * @author ACER
 */
public class EmpRecord implements Prototype  {
    
    
    String name,designation;
    int age;
    float salary;

    public EmpRecord(String name, String designation, int age, float salary) {
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpRecord{" + "name=" + name + ", designation=" + designation + ", age=" + age + ", salary=" + salary + '}';
    }
    
    
    @Override
    public void show(){
        System.out.println(this.toString());
    }
    
    @Override
    public Prototype getClone(){
        return new EmpRecord(name,designation,age,salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
