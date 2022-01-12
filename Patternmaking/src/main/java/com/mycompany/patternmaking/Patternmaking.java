/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patternmaking;

/**
 *
 * @author Atish
 */
public class Patternmaking {
    
     public static void main (String arg[])
    {
        
        
        //*********here we will make different patterns***//
        
        
        
        /*          1st program
        
                        *
                        **
                        ***
                        ****
                        *****
        */
        
        
        
        int i, j;
        
        for(i=1; i<=5; i++) //first loop should be related to no of rows.
        {
            for(j=0; j<i; j++) //second loop should be about limiting the no of character in this case *
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//
        
        
        /*          2nd program
        
                            *
                           **
                          ***
                         ****
                        *****
        */
        
        
        
        
        /*
        int i, j, k;
        
        for(i=1; i<=5; i++) 
        {
            for(j=5; j>i; j--) 
            {
                System.out.print(" ");
            }
            for(k=0; k<i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        
        
        
         //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//
        
        
        /*          3rd program
        
                             *
                            ***
                           *****
                          *******
                         *********
        */
        
        
        
        
        /*
        int i, j, k,l;
        
        for(i=1; i<=5; i++) 
        {
            for(j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(k=0; k<i; k++)
            {
                System.out.print("*");
            }
            for(l=1; l<i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        */
        
        
        
        
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//
        
        
        /*          4th program

                         *********
                          *******
                           *****
                            ***
                             *
        */
        
        
        
        
        /*
        int i, j, k,l;
        
        for(i=1; i<=5; i++) 
        {
            for(j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(k=5; k>=i; k--)
            {
                System.out.print("*");
            }
            for(l=5; l>i; l--)
            {
                System.out.print("*");
            }
            System.out.println();
        
        }
        */
        
        
        
        
        //******How to print abbove program by using while loop**/
        
        
        
        
        /*
        int i, j, k,l;      
        i=1;
        while(i<=5)
        {
            j=1;
            while(j<i)
            {
                System.out.print(" ");
                j++;
            }
            k=5;
            while(k>=i)
            {
                System.out.print("*");
                k--;
            }
            l=5;
            while(l>i)
            {
                System.out.print("*");
                l--;
            }
            System.out.println();
            i++;
        }
         */  
        
        
    }
    
}
