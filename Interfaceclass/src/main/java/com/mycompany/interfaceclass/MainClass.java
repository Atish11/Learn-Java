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
public class MainClass {
    public static void main(String[] args) {
        Database db = new MongoDbImpl();
        db.saveData(new Object());
    }
}
