/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp9.code.gumball.state.states;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mohammed Hussein
 */
public interface State extends Remote{
    public void insertQuarter() throws RemoteException;
    public void ejectQuarter() throws RemoteException;
    public void turnCrank() throws RemoteException;
    public void dispence() throws RemoteException;
}
