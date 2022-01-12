/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritage;

/**
 *
 * @author Atish
 */
public class BasicCalculator {
    int x;

    BasicCalculator() {
    }

    BasicCalculator(int x) {
        this.x = x;
    }
    
    
    public int add(int b)
    {
        return this.x + b;
    }
     public int sub(int b)
    {
        return this.x - b;
    }
     public void display()
     {
         System.out.println("I am from base class");
     }
    
}

