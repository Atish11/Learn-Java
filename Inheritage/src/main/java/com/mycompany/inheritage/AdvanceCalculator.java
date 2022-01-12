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
public class AdvanceCalculator extends BasicCalculator{ //extends is used to inherite from basic Calculator
      
    AdvanceCalculator()
    {
    }
    
    AdvanceCalculator(int a)
    {
        super(a);  // super is used for call costructor of base class
        
    }

    
    public int mul(int b) {
        return this.x * b; // or return super.x * b
    }
    
    public int div(int b)
    {
        return this.x / b; // return super.x * b
    }
    public void display()
     {
         
           super.display();
         
         //System.out.println("I am from derived class");
     }
    
}
