/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientClasses;
import RemoteClasses.MyRemote;
import java.rmi.*;
/**
 *
 * @author Mohammed Hussein
 */
public class MyRemoteClient {
    public static void main(String[] args){
        new MyRemoteClient().go();
    }
    
    public void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
