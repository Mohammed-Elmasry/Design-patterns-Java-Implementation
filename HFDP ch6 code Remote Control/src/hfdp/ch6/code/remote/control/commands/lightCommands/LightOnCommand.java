/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.commands.lightCommands;

import hfdp.ch6.code.remote.control.commands.Command;
import hfdp.ch6.code.remote.control.devices.Light;

/**
 *
 * @author Mohammed Hussein
 */
public class LightOnCommand implements Command{

    public Light light;
    
    //constructor
    public LightOnCommand(Light light){
        this.light = light;
    }
    
    @Override
    public void execute() {
        this.light.on();
    }
    
    public void undo(){
        this.light.off();
    }
}
