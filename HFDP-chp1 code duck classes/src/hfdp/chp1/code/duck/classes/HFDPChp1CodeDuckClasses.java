/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp1.code.duck.classes;

import Duck.Duck;
import Duck.behaviors.Flywithwings;
import Duck.ducks.Mallardduck;
import Duck.ducks.Rubberduck;
import java.util.HashSet;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp1CodeDuckClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck rubberDuck = new Rubberduck();
        rubberDuck.perform_fly();
        
        rubberDuck.set_fly(new Flywithwings());
        rubberDuck.perform_fly();
    }
    
}
