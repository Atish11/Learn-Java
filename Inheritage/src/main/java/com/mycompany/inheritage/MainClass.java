/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritage;

/**
 *
 * @author Atish
 */
public class MainClass {
    public static void main(String[] args) {
        AdvanceCalculator ac = new AdvanceCalculator(10);
        int result = ac.mul(5);
        System.out.println("The Result is : "+result);
        ac.display();
    }
}
