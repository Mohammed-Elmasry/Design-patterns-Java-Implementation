/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.RemoteControlInvoker;

import hfdp.ch6.code.remote.control.commands.Command;

/**
 *
 * @author Mohammed Hussein
 */
public class RemoteControl {
    Command onCommand[];
    Command offCommand[];
    Command command;
    Command undoCommand;
    
    //setting slots to defaults
    public RemoteControl(){
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();
        
        for (int i = 0; i < 7; i++){
            this.onCommand[i]  = noCommand;
            this.offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    } //end of constructor
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }
    
    public void onButtonPushed(int slot){
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }
    
    public void offButtonPushed(int slot){
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }
    
    public void undoButtonPushed(){
        undoCommand.undo();
    }
    
    public String toString(){
        StringBuffer stringbuff = new StringBuffer();
        stringbuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommand.length; i++){
            stringbuff.append("[slot " + i + "] " + onCommand[i].getClass().
                    getName() + "     " + offCommand[i].getClass().getName() + "\n");
        }
        return stringbuff.toString();
    }
}
