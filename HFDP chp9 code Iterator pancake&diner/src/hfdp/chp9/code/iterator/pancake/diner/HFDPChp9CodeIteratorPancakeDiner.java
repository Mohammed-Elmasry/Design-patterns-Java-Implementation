/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.iterator.pancake.diner;

import Composite.CompositeTreeLogic.Menu;
import Composite.CompositeTreeLogic.MenuComponent;
import Composite.CompositeTreeLogic.MenuItem;
import shops.DinerMenu;
import shops.PanCakeHouseMenu;
import shops.Waitress;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp9CodeIteratorPancakeDiner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);
        
        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with marinara sauce, and a slice sourdough bread",
                true, 3.89f));
        
        dinerMenu.add(dessertMenu);
        
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flaky crust,"
                + " topped with vanilla icecream",
                true, 1.59f));
        
        Waitress waitress = new Waitress(allMenus);
        
        waitress.printMenu();
    
    }
    
}
