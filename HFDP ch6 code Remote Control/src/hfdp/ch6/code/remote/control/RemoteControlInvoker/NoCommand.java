/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.ch6.code.remote.control.RemoteControlInvoker;

import hfdp.ch6.code.remote.control.commands.Command;

/**
 *
 * @author Mohammed Hussein
 */
public class NoCommand implements Command{

    @Override
    public void execute() {}
    public void undo() {}
    
}
