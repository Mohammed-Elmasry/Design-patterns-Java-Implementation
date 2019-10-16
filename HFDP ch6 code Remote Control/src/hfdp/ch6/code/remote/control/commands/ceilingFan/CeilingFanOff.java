/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.commands.ceilingFan;

import hfdp.ch6.code.remote.control.commands.Command;
import hfdp.ch6.code.remote.control.devices.CeilingFan;

/**
 *
 * @author Mohammed Hussein
 */
public class CeilingFanOff implements Command{
    public CeilingFan fan;
    public int previousSpeed;
    //constructor
    public CeilingFanOff(CeilingFan fan){
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        this.previousSpeed = fan.getSpeed();
        this.fan.fanOff();
    }
    
    @Override
    public void undo(){
        if (this.previousSpeed == CeilingFan.LOW){
            this.fan.fanLow();
        } else if (this.previousSpeed == CeilingFan.MID){
            this.fan.fanMid();
        } else if (this.previousSpeed == CeilingFan.HIGH){
            this.fan.fanHigh();
        }
    }
}
