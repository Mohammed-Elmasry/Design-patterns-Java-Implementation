/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp3.code.starbuzz.CondimentDecorator;

import hfdp.chp3.code.starbuzz.beveragesClasses.Beverage;

/**
 *
 * @author Mohammed Hussein
 */
public class Mocha extends CondimentDecorator{
    private Beverage beverage;
    
//constructor
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String get_description() {
        return this.beverage.get_description() + ", Mocha";
    }
    
    public double cost(){
        return 0.20 + beverage.cost();
    }
}
