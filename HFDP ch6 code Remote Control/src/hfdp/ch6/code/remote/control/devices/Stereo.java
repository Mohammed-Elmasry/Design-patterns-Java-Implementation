/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.devices;

/**
 *
 * @author Mohammed Hussein
 */
public class Stereo {
    public String room;
    public int volume;
    public static final int CD = 0;
    public static final int DVD = 1;
    public static final int RADIO = 2;
    public static final int OFF = 3;
    public static final int NONE = 4;
    public int currentMode;
    
    //constructor
    public Stereo(String room){
        this.room = room;
    }
    
    //functionality
    
    public void on(){
        this.currentMode = this.NONE;
        System.out.println("Stereo is on!");
    }
    
    public void off(){
        currentMode = this.OFF;
        System.out.println("Stereo is off!");
    }
    
    public void setCd(){
        currentMode = CD;
        System.out.println("Radio is running on CD on volume" + this.volume);
    }
    
    public void setDvd(){
        currentMode = DVD;
        System.out.println("Radio is running on DVD on volume" + this.volume);
    }
    
    public void setRadio(){
        currentMode = RADIO;
        System.out.println("Radio is running on Radio on volume " + this.volume);
    }
    
    public void setVolume(int vol){
        this.volume = vol; 
    }
    
    public int getMode(){
        return this.currentMode;
    }
}
