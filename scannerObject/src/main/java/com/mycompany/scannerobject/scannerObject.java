/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scannerobject;

import java.util.Scanner;

/**
 *
 * @author Atish
 */



public class scannerObject {
    
    

    public static void main(String[] args)
    {
                
        //monitor = System.out (for display)
        //keyboard = System.in (for input)
        
        //to print given hello + input name
        
          
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Nmae");

        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
         
        
        
        //tp add two numbers
        
        
        /*
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a: ");
         int a = sc.nextInt();
         System.out.println("Enter the value of b: ");
         int b = sc.nextInt();
         int c = a+b;
         
         System.out.println("The sum of a and b is " +c);
         */
        
        
        
        
        //make a calculator with menu
        
        
        
        
  /*
        int a, b, c, choice;
        double d;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.println("Welcome to our calculator!!!");
        System.out.println();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.println();
        System.out.println("Enter your choice (0 - 4)");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the value of a: ");
                a = sc.nextInt();
                System.out.println("Enter the value of b: ");
                b = sc.nextInt();
                c = a+b;
                System.out.println("The sum of "+a+" and "+b+" is "+c);
                System.out.println();
                break;
            case 2:
                System.out.println("Enter the value of a: ");
                a = sc.nextInt();
                System.out.println("Enter the value of b: ");
                b = sc.nextInt();
                c = a-b;
                System.out.println("The difference of "+a+" and "+b+" is "+c);
                System.out.println();
                break;
            case 3:
                System.out.println("Enter the value of a: ");
                a = sc.nextInt();
                System.out.println("Enter the value of b: ");
                b = sc.nextInt();
                c = a*b;
                System.out.println("The product of "+a+" and "+b+" is "+c);
                System.out.println();
                break;
            case 4:
                System.out.println("Enter the value of a: ");
                a = sc.nextInt();
                System.out.println("Enter the value of b: ");
                b = sc.nextInt();
                if(b==0)
                {
                    System.out.println("Denominator cannot be 0. Exiting back to menu.");
                    break;
                }
                d = (double)a/b;
                System.out.println("The division of "+a+" by "+b+" is "+d);
                System.out.println();
                break;
            default:
                System.out.println("Please enter valid choice from 0 to 4 only.");
                System.out.println();
                
        }
        }while(choice !=0);
        System.out.println("Exiting..");
        
 */
 }

   
    
    
    //****************************
    //next method for seperation of logic
    
    
     
    /*    
    static int a, b, c, choice;
    static double d;
    static Scanner sc = new Scanner(System.in);
   
    public static void add()
    {
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        c = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
        System.out.println();
    }
    public static void sub()
    {
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        c = a-b;
        System.out.println("The difference of "+a+" and "+b+" is "+c);
        System.out.println();
    }
    public static void mul()
    {
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        c = a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
        System.out.println();
    }
    public static void div()
    {
         System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        if(b==0)
        {
            System.out.println("Denominator cannot be 0. Exiting back to menu.");
            return;
        }
        d = (double)a/b;
        System.out.println("The division of "+a+" by "+b+" is "+d);
        System.out.println();
    }
    public static void showMenu()
    {
        System.out.println("Welcome to our calculator!!!");
        System.out.println();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.println();
        System.out.println("Enter your choice (0 - 4)");
    }
    public static void main(String[] args)
    {
       
       
      do
        {
        showMenu();
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                add();
                break;
            case 2:
                sub();
                break;
            case 3:
                mul();
                break;
            case 4:
               div();
                break;
            default:
                System.out.println("Please enter valid choice from 0 to 4 only.");
                System.out.println();
                
        }
        }while(choice !=0);
        System.out.println("Exiting..");
    }
    
    */

    
    
    
    
    
}


