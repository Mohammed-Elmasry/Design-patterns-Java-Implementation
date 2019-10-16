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
public class StereoSetDVD implements Command{
    
    public Stereo stereo;
    public int previousMode;
    //constructor
    public StereoSetDVD(Stereo stereo){
        this.stereo = stereo;
        this.previousMode = this.stereo.getMode();
    }
    
    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setDvd();
        this.stereo.setVolume(11);
    }
    
    public void undo(){
        if (previousMode == Stereo.CD){
            this.stereo.setCd();
        } else if (previousMode == Stereo.RADIO){
            this.stereo.setRadio();
        } else if (previousMode == Stereo.OFF){
            this.stereo.off();
        } else  if (previousMode == stereo.NONE){
            this.stereo.on();
        }
    }
}
