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
public class MongoDbImpl implements Database{

    @Override
    public void saveData(Object o) {
        System.out.println("I am saving data to MonogoDbImpl"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object retriveData(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
