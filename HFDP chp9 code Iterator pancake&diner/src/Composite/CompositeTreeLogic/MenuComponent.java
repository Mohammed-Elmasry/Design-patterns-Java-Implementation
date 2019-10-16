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
public abstract class MenuComponent {
    
    //management Methods for Menus
    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    };
    
    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException(); 
    }
    //operations for MenuItems
    public String getName(){
        throw new UnsupportedOperationException();
    };
    public String getDescription(){        
        throw new UnsupportedOperationException();
    };
    public float getPrice(){
        throw new UnsupportedOperationException();
    };
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    };
    
    public void print(){
        throw new UnsupportedOperationException();
    }
}
