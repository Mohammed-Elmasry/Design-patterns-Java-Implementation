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
public class NoQuarterState implements State{

    GumballMachine machine;
    
    //constructor
    public NoQuarterState(GumballMachine gumballMachine){
        this.machine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry! you haven't inserted a quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned but you haven't inserted a quarted "
                + "in the first place");
    }

    @Override
    public void dispence() {
        System.out.println("You haven't inserted a quarted in the first place");
    }
    
}
