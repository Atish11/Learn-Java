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
public class HierarchicalInheritancebaseObject extends HierarchicalInheritancebase{
    public void lastName() 
    { 
        System.out.println("Ojha"); 
    }
    public static void main(String[] args)
    {
        HierarchicalInheritancebase1 myObj1 = new HierarchicalInheritancebase1();
        myObj1.hi();
        myObj1.welcome();
        
        HierarchicalInheritancebase2 myObj2 = new HierarchicalInheritancebase2();
        myObj2.hi();
        myObj2.firstName();
        
        HierarchicalInheritancebaseObject myObj3 = new HierarchicalInheritancebaseObject();
        myObj3.hi();
        myObj3.lastName();
    }
}


