/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.commands.Stereo;

import hfdp.ch6.code.remote.control.commands.Command;
import hfdp.ch6.code.remote.control.devices.Stereo;

/**
 *
 * @author Mohammed Hussein
 */
public class StereoOff implements Command{

    public Stereo stereo;
    
    //constructor
    public StereoOff(Stereo stereo){
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        this.stereo.off();
    }
    
    @Override
    public void undo(){
        this.stereo.setCd();
    }
    
}
