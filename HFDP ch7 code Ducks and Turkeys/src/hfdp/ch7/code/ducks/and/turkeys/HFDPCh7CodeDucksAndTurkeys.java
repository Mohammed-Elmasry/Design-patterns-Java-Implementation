/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch7.code.ducks.and.turkeys;

import hfdp.ch7.code.ducks.and.turkeys.adapters.DuckAdapter;
import hfdp.ch7.code.ducks.and.turkeys.classes.MallardDuck;
import hfdp.ch7.code.ducks.and.turkeys.classes.WildTurkey;
import hfdp.ch7.code.ducks.and.turkeys.interfaces.Duck;
import hfdp.ch7.code.ducks.and.turkeys.interfaces.Turkey;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPCh7CodeDucksAndTurkeys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        MallardDuck duck = new MallardDuck();
        DuckAdapter adapter = new DuckAdapter(turkey);
        duckTest(adapter);
    }
    
    public static void duckTest(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
