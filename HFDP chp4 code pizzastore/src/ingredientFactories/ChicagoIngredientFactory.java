/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientFactories;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Marinara;
import ingredients.Meat;
import ingredients.Mince;
import ingredients.Parmisan;
import ingredients.Sauce;
import ingredients.ThickCrust;
import ingredients.veggies.Garlic;
import ingredients.veggies.Mushroom;
import ingredients.veggies.RedPepper;
import ingredients.veggies.Veggie;

/**
 *
 * @author Mohammed Hussein
 */
public class ChicagoIngredientFactory extends PizzaIngredientFactory{

    @Override
    public Cheese get_cheese() {
        return new Parmisan();
    }

    @Override
    public Meat get_meat() {
        return new Mince();
    }

    @Override
    public Veggie[] get_veggie() {
        Veggie veggies[] = {new Garlic(), new RedPepper(), new Mushroom()};
        return veggies;
    }

    @Override
    public Dough get_dough() {
        return new ThickCrust();
    }

    @Override
    public Sauce get_sauce() {
        return new Marinara();
    }
    
}
