/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barista;

import barista.models.BeansAmountException;
import barista.models.CoffeeMaker;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohammed Hussein
 */
public class Barista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        CoffeeMaker coffeeMachine = new CoffeeMaker(1);
        try {
            coffeeMachine.pourCoffee();
            coffeeMachine.pourCoffee();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
