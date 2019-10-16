/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck.ducks;

import Duck.behaviors.Flywithwings;
import Duck.behaviors.Quack;

/**
 *
 * @author Mohammed Hussein
 */
public class Mallardduck extends Duck.Duck{
    
    public Mallardduck(){
        flyBehavior = new Flywithwings();
        quackBehavior = new Quack();
    }

}
