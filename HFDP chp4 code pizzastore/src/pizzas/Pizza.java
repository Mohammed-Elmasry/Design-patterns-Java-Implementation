/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import ingredientFactories.PizzaIngredientFactory;
import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Meat;
import ingredients.Sauce;
import ingredients.veggies.Veggie;
import java.util.ArrayList;

/**
 *
 * @author Mohammed Hussein
 */
public abstract class Pizza {
    PizzaIngredientFactory factory;
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Meat meat;
    Veggie veggie[];
    
    public abstract void prepare();
    
    public Pizza(PizzaIngredientFactory factory){
        this.factory = factory;
    }
    
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    
}
