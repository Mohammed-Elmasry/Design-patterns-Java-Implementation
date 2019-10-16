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
public class Light {
    public String room;
    
    //constructor
    public Light(String room){
        this.room = room;
    }
    
    //functionality
    public void on(){
        System.out.println("Light is on in " + this.room);
    }
    
    public void off(){
        System.out.println("Light is off in " + this.room);
    }
}
