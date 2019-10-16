/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

/**
 *
 * @author Mohammed Hussein
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    float price;
    
    
    //constructor
    public MenuItem(String name, String description, boolean vegi, float price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegi;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getPrice(){
        return this.price;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public boolean isVegetarian(){
        return this.vegetarian;
    }
}
