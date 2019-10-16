/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control;

import hfdp.ch6.code.remote.control.RemoteControlInvoker.RemoteControl;
import hfdp.ch6.code.remote.control.commands.Stereo.StereoOff;
import hfdp.ch6.code.remote.control.commands.Stereo.StereoSetCD;
import hfdp.ch6.code.remote.control.commands.ceilingFan.CeilingFanHigh;
import hfdp.ch6.code.remote.control.commands.ceilingFan.CeilingFanMid;
import hfdp.ch6.code.remote.control.commands.ceilingFan.CeilingFanOff;
import hfdp.ch6.code.remote.control.commands.concreteCommands.garageCommands.GarageDoorDown;
import hfdp.ch6.code.remote.control.commands.concreteCommands.garageCommands.GarageDoorUp;
import hfdp.ch6.code.remote.control.commands.lightCommands.LightOffCommand;
import hfdp.ch6.code.remote.control.commands.lightCommands.LightOnCommand;
import hfdp.ch6.code.remote.control.devices.CeilingFan;
import hfdp.ch6.code.remote.control.devices.GarageDoor;
import hfdp.ch6.code.remote.control.devices.Light;
import hfdp.ch6.code.remote.control.devices.Stereo;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPCh6CodeRemoteControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteControl remotecontrol = new RemoteControl();
        /*
        Light livingRoomLight = new Light("living-room");
        Light kitchenLight = new Light("kitchen");
        CeilingFan ceilingfan = new CeilingFan("living-room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("living-room");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        CeilingFanHigh ceilingFanOn = new CeilingFanHigh(ceilingfan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceilingfan);
        
        GarageDoorUp garageDoorUp = new GarageDoorUp(garageDoor);
        GarageDoorDown garageDoorDown = new GarageDoorDown(garageDoor);
        
        StereoSetCD stereoWithCd = new StereoSetCD(stereo);
        StereoOff stereoOff = new StereoOff(stereo);
        stereo.setVolume(11);
        remotecontrol.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remotecontrol.setCommand(1, kitchenLightOn, kitchenLightOff);
        remotecontrol.setCommand(2, garageDoorUp, garageDoorDown);
        remotecontrol.setCommand(3, stereoWithCd, stereoOff);
        
        
        System.out.println(remotecontrol);
        
        remotecontrol.onButtonPushed(0);
        remotecontrol.offButtonPushed(0);
        remotecontrol.onButtonPushed(1);
        remotecontrol.offButtonPushed(1);
        remotecontrol.onButtonPushed(2);
        remotecontrol.offButtonPushed(2);
        remotecontrol.onButtonPushed(3);
        remotecontrol.offButtonPushed(3);
        */
        
        CeilingFan livingRoomFan = new CeilingFan("living room");
        
        CeilingFanHigh fanHighCommand = new CeilingFanHigh(livingRoomFan);
        CeilingFanMid  fanMidCommand  = new CeilingFanMid(livingRoomFan);
        
        CeilingFanOff fanCommandoff = new CeilingFanOff(livingRoomFan);
        
        remotecontrol.setCommand(0, fanMidCommand, fanCommandoff);
        remotecontrol.setCommand(1, fanHighCommand, fanCommandoff);
        
        remotecontrol.onButtonPushed(0);
        remotecontrol.offButtonPushed(0);
        System.out.println("undo");
        remotecontrol.undoButtonPushed();
        
        remotecontrol.onButtonPushed(1);
        System.out.println("undo");
        remotecontrol.undoButtonPushed();
    }   
    
}
