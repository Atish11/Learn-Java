/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaceclass;

/**
 *
 * @author Atish
 */
public class MySqlimol implements Database{ //for inhert interface we use implements keyword

    @Override // it is known as annotation
    public void saveData(Object o) {
         System.out.println("I am saving data to mysql");//To change body of generated methods, choose Tools | Templates.
    }

    @Override // use me instate of other 
    public Object retriveData(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
