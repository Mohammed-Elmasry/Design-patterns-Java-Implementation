/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp7.code.caffinatedbeverages;

import hfdp.chp7.code.caffinatedbeverages.ConcreteBeverages.Coffee;
import hfdp.chp7.code.caffinatedbeverages.ConcreteBeverages.Tea;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp7CodeCaffinatedBeverages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("Preparing Coffee");
        coffee.prepareBeverage();
        
        System.out.println("Preparing Tea");
        tea.prepareBeverage();
    }
    
    
}
