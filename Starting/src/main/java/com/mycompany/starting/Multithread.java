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
public class Multithread{
   
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) 
        {
            Thread object = new Thread(new ThreadCreationByImplementingTheRunableInterface() {});
            object.start();
        }
    }
}




//public class Multithread{
//   
//    public static void main(String[] args)
//    {
//        int n = 8; // Number of threads
//        for (int i = 0; i < n; i++) 
//        {
//            ThreadCreationByExtendingtheThreadClass object = new ThreadCreationByExtendingtheThreadClass() {};
//            object.start();
//        }
//    }
//}
