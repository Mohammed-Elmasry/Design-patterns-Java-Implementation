/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shops;
import MenuItems.MenuItem;
import hfdp.chp9.code.iterator.pancake.diner.Iterator.DinerIterator;
import hfdp.chp9.code.iterator.pancake.diner.Iterator.Menu;
import java.util.Iterator;
/**
 *
 * @author Mohammed Hussein
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfitems = 0;
    MenuItem[] menuItems;
    
    //constructor
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole of wheat"
                , true, 2.99f);
        addItem("BLT", "Bacon with lettuce & tomato on whole of wheat", false, 2.99f);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.99f);
        addItem("Hotdog", "A hotdog, with saurkraut, relish, onions, topped with cheese",
                true, 3.05f);
    }
    
    
    public void addItem(String name, String description, boolean isVegetarian,
            float price){
        
        MenuItem item = new MenuItem(name, description, isVegetarian, price);
        if(numberOfitems < menuItems.length){
            menuItems[numberOfitems] = item;
            numberOfitems++;
        } else {
            System.err.println("Sorry, Menu is full!");
        }
    }
    
    public Iterator createIterator(){
        DinerIterator iterator = new DinerIterator(menuItems);
        return iterator;
    }
}
