/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.gumball.state.states;

import hfdp.chp9.code.gumball.state.context.GumballMachine;

/**
 *
 * @author Mohammed Hussein
 */
public class SoldState implements State{
    
    GumballMachine machine;
    
    //constructor
    public SoldState(GumballMachine machine){
        this.machine = machine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("Your transaction is in progress!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry! too late, your gumball is on the way");
    }

    @Override
    public void turnCrank() {
        System.out.println("Enough playing, you already turned it once. Your "
                + "gumball is on the way");
    }

    @Override
    public void dispence() {
        machine.releaseBall();
        if (machine.getCount() > 0){
            machine.setState(machine.getNoQuarterState());
        } else {
            machine.setState(machine.getSoldOutState());
            System.out.println("Please refill the machine");
        }
    }
    
    
    
}
