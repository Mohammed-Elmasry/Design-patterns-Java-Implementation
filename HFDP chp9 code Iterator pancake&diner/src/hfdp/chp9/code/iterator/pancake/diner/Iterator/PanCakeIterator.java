/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.iterator.pancake.diner.Iterator;
import MenuItems.MenuItem;
import java.util.ArrayList;
/**
 *
 * @author Mohammed Hussein
 */
public class PanCakeIterator implements Iterator{
    
    int position = 0;
    ArrayList items;
    
    //constructor
    public PanCakeIterator(ArrayList items){
        this.items = items;
    }
    
    @Override
    public boolean hasNext() {
        return (position < items.size() && items.get(position) != null);
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem)items.get(position);
        position++;
        return item;
    }
    
}
