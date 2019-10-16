/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp7.code.caffinatedbeverages.templates;

/**
 *
 * @author Mohammed Hussein
 */
public abstract class CaffinatedBeverage {
    final public void prepareBeverage(){
        boilWater();
        brew();
        pourIntoCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("Water is boiling at 100 C");
    }
    
    public void pourIntoCup(){
        System.out.println("pouring your drink into a cup");
    }
    
    // those are subclass-specific methods
    public abstract void brew();
    public abstract void addCondiments();
    
    //hook
    public boolean customerWantsCondiments(){
        return true;
    }
}
