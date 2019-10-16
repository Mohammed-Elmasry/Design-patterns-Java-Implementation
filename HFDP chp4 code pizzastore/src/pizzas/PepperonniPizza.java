/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import ingredientFactories.PizzaIngredientFactory;

/**
 *
 * @author Mohammed Hussein
 */
public class PepperonniPizza extends Pizza{
    
    PizzaIngredientFactory ingredientFactory;
    
    //constructor
    public PepperonniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        this.meat = this.ingredientFactory.get_meat();
        this.sauce = this.ingredientFactory.get_sauce();
        this.dough = this.ingredientFactory.get_dough();
        this.cheese = this.ingredientFactory.get_cheese();
        this.veggie = this.ingredientFactory.get_veggie();
    }
    
}
