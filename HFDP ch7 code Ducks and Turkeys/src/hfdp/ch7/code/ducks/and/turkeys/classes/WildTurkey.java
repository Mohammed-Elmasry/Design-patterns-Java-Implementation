/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch7.code.ducks.and.turkeys.classes;

import hfdp.ch7.code.ducks.and.turkeys.interfaces.Turkey;

/**
 *
 * @author Mohammed Hussein
 */
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I fly small distances");
    }
    
}
