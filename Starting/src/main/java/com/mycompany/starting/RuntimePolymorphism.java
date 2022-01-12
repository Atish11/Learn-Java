/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.starting;

/**
 *
 * @author Atish Ojha
 */
class RuntimePolymorphism extends MethodOverriding{
    
     @Override
     void Print()
    {
        System.out.println("Ojha");
    }
     
    public static void main(String[] args)
    {
        MethodOverriding a;
  
        a = new MethodOverriding1();
        a.Print();
  
        a = new RuntimePolymorphism();
        a.Print();
    }
}