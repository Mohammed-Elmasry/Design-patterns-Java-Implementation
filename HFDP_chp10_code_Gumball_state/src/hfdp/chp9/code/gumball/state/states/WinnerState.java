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
public class WinnerState implements State{

    GumballMachine machine;
    
    //constructor
    public WinnerState(GumballMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter, we're already giving"
                + "you the gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Too late, you turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("You already turned the crank");
    }

    @Override
    public void dispence() {
        System.out.println("You're a winner! YOU GET TWO GUMBALLS FOR YOUR "
                + "QUARTER!");
        
        machine.releaseBall();
        if (machine.getCount() == 0){
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if(machine.getCount() > 0){
                machine.setState(machine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                machine.setState(machine.getSoldOutState());
            }
        }
    }
    
    
}
