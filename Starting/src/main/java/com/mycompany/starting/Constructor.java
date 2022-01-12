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
public class Constructor {
     int a;
     
     public Constructor()
     {
        a = 10;
     }
    public static void main (String args[])
    {
        Constructor myObj = new Constructor();
        System.out.println(myObj.a);
    }
}
