/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.iterator.pancake.diner.Iterator;
import MenuItems.MenuItem;
import java.util.Iterator;
/**
 *
 * @author Mohammed Hussein
 */
public class DinerIterator implements Iterator{

    int position = 0;
    MenuItem[] menuitems;
    
    //constructor
    public DinerIterator(MenuItem[] menuItems){
        this.menuitems = menuItems;
    }
    @Override
    public boolean hasNext() {
        return (position < menuitems.length && menuitems[position] != null);
    }
    

    @Override
    public Object next() {
        MenuItem item = this.menuitems[position];
        position++;
        return item;
    }
    
    public void remove(){
        if(position <= 0){
            throw new IllegalStateException
        ("You can't remove an item until you've done at least one next()");
        }
        
        if (menuitems[position - 1] != null){
            for (int i = position-1; i < (menuitems.length - 1); i++){
                menuitems[i] = menuitems[i+1];
            }
            menuitems[menuitems.length-1] = null; //last element
        }
    }
}
