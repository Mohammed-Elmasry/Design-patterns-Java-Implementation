/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck.ducks;

import Duck.behaviors.Flywithrockets;
import Duck.behaviors.Squeck;

/**
 *
 * @author Mohammed Hussein
 */
public class Rubberduck extends Duck.Duck{
    
    public Rubberduck(){
        flyBehavior = new Flywithrockets();
        quackBehavior = new Squeck();
    }
   
}
