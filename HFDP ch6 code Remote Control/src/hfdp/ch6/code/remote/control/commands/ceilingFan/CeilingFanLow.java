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
public class CeilingFanLow implements Command{

    CeilingFan fan;
    public int previousSpeed;
    //constructor
    public CeilingFanLow(CeilingFan fan){
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        this.previousSpeed = this.fan.getSpeed();
        this.fan.fanLow();
    }

    @Override
    public void undo() {
        if (this.previousSpeed == CeilingFan.OFF){
            this.fan.fanOff();
        } else if (this.previousSpeed == CeilingFan.MID){
            this.fan.fanMid();
        } else if (this.previousSpeed == CeilingFan.HIGH){
            this.fan.fanHigh();
        }
    }
    
}
