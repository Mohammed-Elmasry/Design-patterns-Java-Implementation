/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.gumball.state.states;

import hfdp.chp9.code.gumball.state.context.GumballMachine;
import java.util.Random;

/**
 *
 * @author Mohammed Hussein
 */
public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine machine;
    
    //constructor
    public HasQuarterState(GumballMachine machine){
        this.machine = machine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("You already inserted a quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter Ejected!");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank Turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && machine.getCount() >1 ){
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
        
    }

    @Override
    public void dispence() {
        System.out.println("You haven't turned the crank yet");
    }
    
}
