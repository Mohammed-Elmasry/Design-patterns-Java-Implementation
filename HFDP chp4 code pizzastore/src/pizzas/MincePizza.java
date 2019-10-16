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
public class MincePizza extends Pizza{

    public PizzaIngredientFactory ingredientFactory;
    public MincePizza() {
    }
    //constructor
    public MincePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        this.meat = ingredientFactory.get_meat();
        this.sauce = ingredientFactory.get_sauce();
        this.cheese = ingredientFactory.get_cheese();
        this.veggie = ingredientFactory.get_veggie();
        this.dough = ingredientFactory.get_dough();
    }
    
}
