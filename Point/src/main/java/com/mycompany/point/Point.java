/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.point;

/**
 *
 * @author Atish
 */
public class Point {
    
    int x;
    int y;
    
    //Constructor is such a function which has same name as a class.
    
    Point() //default constructor
    {
        
    }
    Point(int a, int b) //parameterise constructor
    {
        this.x = a;
        this.y = b;
    }
    
    Point add(Point p)
    {
        Point temp = new Point();
        temp.x = p.x +this.x;
        temp.y = p.y +this.y;
        return temp;
    }
    
    void display()
    {
        System.out.println("X = "+this.x+" Y = "+this.y);
    }
    
    public static void main (String[] args) //main
    {
        Point p1 = new Point(6,7);
        Point p2 = new Point(61,57);
        Point p3;
        
        p3 = p1.add(p2);
        p3.display();
    }
    
}
