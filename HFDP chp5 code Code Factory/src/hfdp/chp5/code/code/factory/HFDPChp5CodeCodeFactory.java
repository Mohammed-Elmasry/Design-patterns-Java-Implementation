/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp5.code.code.factory;

import hfdp.chp5.code.code.factory.singletons.ChocolateSingleton;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp5CodeCodeFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //we can't do this because it has a private constructor
//        ChocolateSingleton singleton = new ChocolateSingleton();
        ChocolateSingleton mySingleton = ChocolateSingleton.getInstance();
        if (mySingleton == null){
            System.out.println("singleton not created");
        } else {
            System.out.println("Singleton created successfully");
        }
    }
    
}
