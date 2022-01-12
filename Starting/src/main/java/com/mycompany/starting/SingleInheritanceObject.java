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
public class SingleInheritanceObject extends SingleInheritance {
     
    public String lastName = "Ojha";

    public static void main(String[] args)
    {
        SingleInheritanceObject myObj = new SingleInheritanceObject();
        myObj.welcome();
        System.out.println("My name is " + myObj.fristName + " " + myObj.lastName);
    }
}


