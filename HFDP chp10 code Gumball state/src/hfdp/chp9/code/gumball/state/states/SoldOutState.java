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
public class SoldOutState implements State{

    GumballMachine machine;
    
    //constructor
    public SoldOutState(GumballMachine machine){
        this.machine = machine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("Sorry! the machine is out of gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry! the machine is out of gumballs and no"
                + "transactions will take place");
    }

    @Override
    public void turnCrank() {
        System.out.println("Stop playing!!, it doesn't have any gumballs!");
    }

    @Override
    public void dispence() {
        System.out.println("can't dispence from an empty machine!");
    }
    
    
    public void refill(int count){
        machine.setCount(5);
        machine.setState(machine.getNoQuarterState());
        System.out.println("Machine refill succeeded!");
    }
    
}
