/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaStores;

import pizzas.Pizza;

/**
 *
 * @author Mohammed Hussein
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);
    public final Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
}
