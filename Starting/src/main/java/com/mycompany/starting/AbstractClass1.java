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
 class AbstractClass1 extends Abstract{
    @Override
    void run(){System.out.println("running safely..");}

    public static void main(String args[])
    {
     Abstract obj = new AbstractClass1();
     obj.run();
    }
 }

