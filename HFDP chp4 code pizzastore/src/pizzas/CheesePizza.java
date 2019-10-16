/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import ingredientFactories.PizzaIngredientFactory;
import ingredients.veggies.Garlic;
import ingredients.veggies.Mushroom;

/**
 *
 * @author Mohammed Hussein
 */
public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    //constructor 
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        this.cheese = this.ingredientFactory.get_cheese();
        this.meat = this.ingredientFactory.get_meat();
        this.dough = this.ingredientFactory.get_dough();
        this.sauce = this.ingredientFactory.get_sauce();        
        this.veggie = this.ingredientFactory.get_veggie();
    }
}
