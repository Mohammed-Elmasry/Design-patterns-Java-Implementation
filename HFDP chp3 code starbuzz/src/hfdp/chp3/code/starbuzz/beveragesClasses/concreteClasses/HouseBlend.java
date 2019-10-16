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
public class HouseBlend extends Beverage{

    private String description;
    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String get_description() {
        return description = "House Blend coffee";
    }
    
}
