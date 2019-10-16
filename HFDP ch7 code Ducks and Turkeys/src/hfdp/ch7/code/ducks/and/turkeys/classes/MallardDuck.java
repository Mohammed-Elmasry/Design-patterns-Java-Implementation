/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch7.code.ducks.and.turkeys.classes;

import hfdp.ch7.code.ducks.and.turkeys.interfaces.Duck;

/**
 *
 * @author Mohammed Hussein
 */
public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
    
}
