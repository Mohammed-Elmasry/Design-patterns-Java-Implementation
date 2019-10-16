/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp3.code.starbuzz.beveragesClasses.concreteClasses;

import hfdp.chp3.code.starbuzz.beveragesClasses.Beverage;

/**
 *
 * @author Mohammed Hussein
 */
public class Espresso extends Beverage{

    //constructor
    public Espresso(){
        description = "Expresso";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String get_description() {
        return description;
    }
    
}
