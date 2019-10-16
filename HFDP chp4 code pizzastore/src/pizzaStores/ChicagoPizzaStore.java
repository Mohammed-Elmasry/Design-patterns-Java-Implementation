/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaStores;

import ingredientFactories.ChicagoIngredientFactory;
import ingredientFactories.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.MincePizza;
import pizzas.PepperonniPizza;
import pizzas.Pizza;

/**
 *
 * @author Mohammed Hussein
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        
        if (type.equals("Cheese")){
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("Pepperonni")){
            pizza = new PepperonniPizza(ingredientFactory);
        } else if (type.equals("Mince")){
            pizza = new MincePizza(ingredientFactory);
        }
        
        return pizza;
    }
    
}
