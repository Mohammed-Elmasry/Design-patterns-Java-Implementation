/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch7.code.ducks.and.turkeys.adapters;

import hfdp.ch7.code.ducks.and.turkeys.interfaces.Duck;
import hfdp.ch7.code.ducks.and.turkeys.interfaces.Turkey;

/**
 *
 * @author Mohammed Hussein
 */
public class DuckAdapter implements Duck{

    Turkey turkey;
    
    public DuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    
    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++){
            this.turkey.fly();
        }
    }    
}
