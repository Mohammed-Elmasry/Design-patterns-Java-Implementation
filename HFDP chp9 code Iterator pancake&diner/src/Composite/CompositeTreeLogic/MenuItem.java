/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite.CompositeTreeLogic;

/**
 *
 * @author Mohammed Hussein
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    float price;
    
    //constructor
    public MenuItem(String name, String description, boolean isVegetarian,
            float price){
    
        this.name = name;
        this.description = description;
        this.vegetarian = isVegetarian;
        this.price = price;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public float getPrice(){
        return this.price;
    }
    
    public boolean isVegetarian(){
        return this.vegetarian;
    }
    
    public void print(){
        System.out.print("  " + getName());
        if(isVegetarian()) {
            System.out.print("(V)");
        }
        System.out.print(", " + getPrice());
        System.out.println("     -- " + getDescription());
       
    }
}
