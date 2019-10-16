/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.gumball.state.context;

import hfdp.chp9.code.gumball.state.states.HasQuarterState;
import hfdp.chp9.code.gumball.state.states.NoQuarterState;
import hfdp.chp9.code.gumball.state.states.SoldOutState;
import hfdp.chp9.code.gumball.state.states.SoldState;
import hfdp.chp9.code.gumball.state.states.State;
import hfdp.chp9.code.gumball.state.states.WinnerState;
/**
 *
 * @author Mohammed Hussein
 */
public class GumballMachine {
    State    noQuarterstate;
    State    hasQuarterState;
    State    soldState;
    State    soldOutState;
    State    winnerState;
    State    state;
    int count;        
    
    //constructor
    public GumballMachine(int count){
        this.count = count;
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterstate = new NoQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        if (count > 0){
            state = noQuarterstate;
        }
    }
    
    
    public void insertQuarter(){
        state.insertQuarter();
    }
    
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    
    public void turnCrank(){
        state.turnCrank();
        if (state != soldState){
            return;
        }
        state.dispence();
    }
    
    public State getState(){
        return this.state;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public State getSoldOutState(){
        return this.soldOutState;
    }
    
    public State getSoldState(){
        return this.soldState;
    }
    
    public State getHasQuarterState(){
        return this.hasQuarterState;
    }

    public State getNoQuarterState(){
        return this.noQuarterstate;
    }
    
    public State getWinnerState(){
        return this.winnerState;
    }
    
    public void releaseBall(){
        System.out.println("a gumball comes rolling out...");
        if (count > 0){
            count = count - 1;
        }
    }
    
    public int getCount(){
        return this.count;
    }
    
    public void setCount(int n){
        this.count = n;
    }
}

