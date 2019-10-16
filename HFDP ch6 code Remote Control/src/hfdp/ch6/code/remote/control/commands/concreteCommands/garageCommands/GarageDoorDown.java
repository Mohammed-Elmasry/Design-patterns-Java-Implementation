/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.commands.concreteCommands.garageCommands;

import hfdp.ch6.code.remote.control.commands.concreteCommands.*;
import hfdp.ch6.code.remote.control.commands.Command;
import hfdp.ch6.code.remote.control.devices.GarageDoor;

/**
 *
 * @author Mohammed Hussein
 */
public class GarageDoorDown implements Command{
    public GarageDoor door;

    public GarageDoorDown(GarageDoor door){
        this.door = door;
    }
    
    @Override
    public void execute() {
        this.door.garageDoorClosed();
    }
    
    @Override
    public void undo(){
        this.door.garageDoorUp();
    }
}
