/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp5.code.code.factory.singletons;

/**
 *
 * @author Mohammed Hussein
 */
public class ChocolateSingleton {
    
    private static ChocolateSingleton instance = null;
    
    //private constructor
    private ChocolateSingleton(){}
    
    /**
     *
     * @return
     */
    public synchronized static ChocolateSingleton getInstance(){
        if (instance == null){
            instance = new ChocolateSingleton();
        }
        return instance;
    }
}
