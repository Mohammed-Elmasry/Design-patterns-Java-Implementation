/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shops;

import java.util.ArrayList;
import MenuItems.MenuItem;
import hfdp.chp9.code.iterator.pancake.diner.Iterator.PanCakeIterator;
import java.util.Iterator;
import hfdp.chp9.code.iterator.pancake.diner.Iterator.Menu;
/**
 *
 * @author Mohammed Hussein
 */
public class PanCakeHouseMenu implements Menu{

    ArrayList menuItems;
    
    //constructor
    public PanCakeHouseMenu(){
        menuItems = new ArrayList();
        
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs and toast"
                , true, 2.99f);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99f);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49f);
        addItem("Waffles", "with choice of blueberries or strawberries",
                true, 3.59f);
    }
    
    public void addItem(String name, String description, boolean isVegetarian, 
            float price){
        MenuItem item = new MenuItem(name, description, isVegetarian, price);
        menuItems.add(item);
    }
    
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
