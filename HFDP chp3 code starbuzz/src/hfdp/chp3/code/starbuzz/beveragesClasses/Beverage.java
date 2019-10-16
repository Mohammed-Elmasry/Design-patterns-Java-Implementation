/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp3.code.starbuzz.beveragesClasses;

/**
 *
 * @author Mohammed Hussein
 */
public abstract class Beverage {
    public String description = "unknown beverage";
    public abstract double cost();
    public String get_description(){
        return this.description;
    }
}