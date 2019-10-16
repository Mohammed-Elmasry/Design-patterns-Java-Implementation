/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteClasses;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author Mohammed Hussein
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    public String sayHello(){
        return "Server says, `Hello!`";
    }
    
    public MyRemoteImpl() throws RemoteException{}
    
    public static void main(String[] args){
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
