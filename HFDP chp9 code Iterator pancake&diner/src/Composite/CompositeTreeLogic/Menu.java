/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite.CompositeTreeLogic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mohammed Hussein
 */
public class Menu extends MenuComponent{
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    
    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void print(){
        System.out.print("\n" + getName());
        System.out.print(",  " + getDescription());
        System.out.print("-----------------");
    
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
