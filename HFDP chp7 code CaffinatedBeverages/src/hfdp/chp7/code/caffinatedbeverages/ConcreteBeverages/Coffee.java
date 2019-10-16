/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp7.code.caffinatedbeverages.ConcreteBeverages;

import hfdp.chp7.code.caffinatedbeverages.templates.CaffinatedBeverage;

/**
 *
 * @author Mohammed Hussein
 */
public class Coffee extends CaffinatedBeverage{

    @Override
    public void brew() {
        System.out.println("Grinding Coffee Beans!");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Milk and Sugar");
    }
    
    @Override
    public boolean customerWantsCondiments(){
        return false;
    }
}
