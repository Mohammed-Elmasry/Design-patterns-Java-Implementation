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
public abstract class CondimentDecorator extends Beverage{

    Beverage wrappedObject;
    @Override
    public abstract double cost();

    public abstract String get_description();
    
}
