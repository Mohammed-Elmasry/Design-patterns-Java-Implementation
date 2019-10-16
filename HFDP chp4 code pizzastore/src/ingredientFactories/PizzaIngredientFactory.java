/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientFactories;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Meat;
import ingredients.Sauce;
import ingredients.veggies.Veggie;

/**
 *
 * @author Mohammed Hussein
 */
public abstract class PizzaIngredientFactory {
    public abstract Cheese get_cheese();
    public abstract Meat get_meat();
    public abstract Veggie[] get_veggie();
    public abstract Dough get_dough();
    public abstract Sauce get_sauce();
}
