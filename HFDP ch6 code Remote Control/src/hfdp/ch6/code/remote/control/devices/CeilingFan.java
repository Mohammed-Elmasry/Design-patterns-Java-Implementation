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
public class CeilingFan {
    public String room;
    public static final int HIGH = 3;
    public static final int MID = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    public int speed;
    
    //constructor
    public CeilingFan(String room){
        this.room = room;
        speed = OFF;
    }
    
    //functionality
    public void fanHigh(){
        this.speed = this.HIGH;
        System.out.println("Fan is on high speed");
    }
    
    public void fanOff(){
        this.speed = this.OFF;
        System.out.println("Fan is Off!");
    }
    
    public void fanMid(){
        this.speed = this.MID;
        System.out.println("Fan is on mid speed");
    }
    
    public void fanLow(){
        this.speed = this.LOW;
        System.out.println("Fan is on low speed");
    }
    
    public int getSpeed(){
        return speed;
    }
}
