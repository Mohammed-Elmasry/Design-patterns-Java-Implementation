/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp3.code.starbuzz;

import hfdp.chp3.code.starbuzz.CondimentDecorator.Mocha;
import hfdp.chp3.code.starbuzz.CondimentDecorator.Whip;
import hfdp.chp3.code.starbuzz.beveragesClasses.Beverage;
import hfdp.chp3.code.starbuzz.beveragesClasses.concreteClasses.Espresso;
import hfdp.chp3.code.starbuzz.beveragesClasses.concreteClasses.HouseBlend;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp3CodeStarbuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.get_description() + " $" + beverage.cost());
    
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.get_description() + " $" + beverage2.cost());
    }
    
}
