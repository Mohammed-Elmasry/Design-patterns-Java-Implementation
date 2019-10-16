/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shops;
import Composite.CompositeTreeLogic.MenuComponent;
import java.util.Iterator;
import MenuItems.MenuItem;
import hfdp.chp9.code.iterator.pancake.diner.Iterator.Menu;
/**
 *
 * @author Mohammed Hussein
 */
public class Waitress {
    MenuComponent  allMenus;
    
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    
    public void printMenu(){
        this.allMenus.print();
    };
    
    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    public void printBreakfastMenu(){};
    public void printLunchMenu(){};
    public void printVegetarianMenu(){};
    public boolean isItemVegetarian(String name){return true;};
    
}
