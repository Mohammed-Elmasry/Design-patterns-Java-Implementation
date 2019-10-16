/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp4.code.pizzastore;

import pizzaStores.ChicagoPizzaStore;
import pizzaStores.NYPizzaStore;
import pizzas.Pizza;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp4CodePizzastore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChicagoPizzaStore store = new ChicagoPizzaStore();
        store.orderPizza("Mince");
    }
    
}
