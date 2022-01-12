/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array;

import java.util.Random;

/**
 *
 * @author Atish
 */
public class Arrays {
    
//    To run any Program given below one should uncomment that program by deleting "/* and */" from the first line
//            last line of that particular code
    
    
//    propertise of arrays
//    
//    1. homoginus collection of data(similar data collection)
//    2. all containtes are stored in contigius memory location (data are stored in
//       continus way in memory location
//    3. we cannot change size of array after it is fixed at complie time
    
    
    
    
          
    
        static String name;
        static int marks[] = {50,60,85,77,66};
        static double percentage;
        public static void main (String args[])
        {
            int total = 0;
            for(int i=0; i<5; i++)
            {
                total = total+marks[i];
            }
            percentage = total*100f/500; // here we can use litrals like f, d, l and so on.
            System.out.print("PER = "+ percentage);

        }
    
    
    
    //we can alocate array dynamically in java
    
    //****how to print random numbers in array**/
    
    //***these two programs uses normal forloop**//
    
    
/*
        public static void main(String[] args)
        {
            Random r = new Random();
            int[] arr; //size is not defined while declare
            arr = new int[10]; //size is defined dynamical by using new keyword
            for(int i=0; i<10; i++) //normal for loop
            {
                arr[i] = r.nextInt();
            }
            for(int i=0; i<10; i++)
            {
                System.out.println(arr[i]);
            }
        }
*/
    
    
    
    //*****above program in while loop****/
    
    
    /*
    public static void main(String[] args)
    {
        int i=0;
        Random r = new Random();
        int[] arr; //size is not defined while declare
        arr = new int[10]; //size is defined dynamical by using new keyword
        for(i=0; i<10; i++)
        {
            arr[i] = r.nextInt();
        }
        i=0;
        while(i<10)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
    */
    
    
    
    //*********enhanced forloop***//
    // enhanced for loop is used while read it is not used while write 
    
    
    /*
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] arr; //size is not defined while declare
        arr = new int[10]; //size is defined dynamical by using new keyword
        for(int i=0; i<arr.length; i++) //.length gives length of arr
        {
            arr[i] = r.nextInt();
        }
        for(int x:arr) //enhanced for loop
        {
            System.out.println(x);
        }
    }
    */
    
    
    
    
    //*****multidimational array****//
    
    
    /*
     public static void main(String[] args)
    {
        int i;
        String[][] students = {{"101", "Atish Ojha", "855221453"},
                               {"105", "Anil Bhatta", "98545144"},
                               {"109", "Mukesh Chand", "98547221"}                      
        };
        for(String[] x:students) //enhanced for loop
        {
            for(i=0; i<x.length; i++)
            {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
    }
    */
    
    
    
    //*********how to do 2X2 matrix addition *****//
    
    /*
    public static void main(String[] args)
    {
        int[][] mat1 ={{1, 6},
                       {9, 4}
        };
        int[][] mat2 ={{10, 5},
                       {8, 6}
        };
        int[][] mat3 = new int[2][2];
        
        for(int i=0; i<mat1.length; i++)
        {
            for(int j=0; j<mat2.length; j++)
            {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int[] x: mat3)
        {
            for(int i=0;i<x.length; i++)
            {
                System.out.print(x[i]+"\t");
            }
            System.out.println();
        }
    }
    */
    
    
    
    
    //***function***//
    //****Here we isolate the add function**//
    
    /*
    int[][] add(int[][] mat1, int[][] mat2)
    {
        int[][] mat3 = new int[2][2];
        
        for(int i=0; i<mat1.length; i++)
        {
            for(int j=0; j<mat2.length; j++)
            {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return mat3;
    }
    
    public static void main(String[] args)
    {
        Arrays a = new Arrays();
        int[][] mat1 ={{1, 6},
                       {9, 4}
        };
        int[][] mat2 ={{10, 5},
                       {8, 6}
        };
        int[][] mat4 = a.add(mat1, mat2);
        for(int[] x: mat4)
        {
            for(int i=0;i<x.length; i++)
            {
                System.out.print(x[i]+"\t");
            }
            System.out.println();
        }
    }
    */
    
    
}
