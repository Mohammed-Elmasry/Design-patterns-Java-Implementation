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
public class Tea extends CaffinatedBeverage{

    @Override
    public void brew() {
        System.out.println("Put the tea packet");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding Lemon to Tea");
    }
    
}
