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
public class Soy extends CondimentDecorator{

    private Beverage beverage;
    
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String get_description() {
        return this.beverage.get_description() + ", Soy";
    }
    
    public double cost(){
        return .20 + this.beverage.cost();
    }
    
}
