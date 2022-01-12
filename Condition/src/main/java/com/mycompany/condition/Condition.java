/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.condition;

/**
 *
 * @author Atish
 */
public class Condition {
    
     public static void main (String arg[])
    {
        
        /*
        there are two types of conditions which are
        1. If else
        2. Switch case
        
        
        
        ************************ 1.*************
        if (condition)
        {
        statement if true
        }
        
        
        ----------second type------------------------
        
        if (condition)
        {
        statement if true
        }
        else
        {
        starement if false
        }
        
        
        ----------third type------------------------
        
        if (condition1)
        {
        statement if  condition1 true
        }
        else if(condition2)
        {
        starement if condition2 true
        }
        *
        *
        *
        *
        else if(conditionN)
        {
        starement if conditionN true
        }
        else
        {
        statement if all the conditions false
        }
        
        
        
        
        **********************2.**********************
        
        
        switch(expression)
        {
        
        case number or character;
                statement for case
                break;
        case number or character;
                statement for case
                break;
        
        }
        
        
        
        */
        
        //-----------EXAMPLE-------------//
        
        
        int a, b, c;
        
        a = 80;
        b = 30;
        c = 75;
        
        int result = a+b+c;
        
        System.out.println("The result is " + result );
        
        if(result == 185)
        {
            System.out.println("You are right");
        }
        
        
        
        //***********************to find odd or even*************//
        
        
        /*
        int x = 98;
        int remainder = x%2;
        
        if (remainder == 0)
        {
            System.out.println("The number is EVEN number");
        }
        else
        {
            System.out.println("The number is an ODD number");
        }
        */
        
        
        
        
        
        //*****************find division of students*****************//
        
        
        /*
        int marksobt = 595;
        
        double per = (double)marksobt *100/800;
        
        System.out.println("The percentage is " + per);
        
        if(per >= 32 && per < 50)
        {
            System.out.println("Third Division");
        }
        else if(per >=50 && per < 60)
        {
            System.out.println("Second Division");

        }
        else if(per >=60 && per < 80)
        {
            System.out.println("First Division");

        }
        else if(per >=80)
        {
            System.out.println("Distinction Division");

        }
        else
        {
            System.out.println("Fail !!");
        }
        */
        
        
        
        //***************switch****************************//
        
        /*
        int choice = 1;
        
        System.out.println("Welcome to MY Market Place Center");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Buy Anything.");
        System.out.println("2. Sell Anything.");
        System.out.println("3. Exchange Anything.");
        System.out.println("0. Exit");
        
        switch(choice)
        {
            case 1:
                System.out.println("Let's buy.");
                break;
            case 2:
                System.out.println("Let's Sell.");
                break;
            case 3:
                System.out.println("Let's Exchange.");
                break;
            case 0:
                System.out.println("Ending....");
        }

*/
        
        
    }
    
}
