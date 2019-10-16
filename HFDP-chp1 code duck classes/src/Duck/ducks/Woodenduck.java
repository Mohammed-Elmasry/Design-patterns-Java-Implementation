/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck.ducks;

import Duck.behaviors.Flynoway;
import Duck.behaviors.Mutequack;

/**
 *
 * @author Mohammed Hussein
 */
public class Woodenduck extends Duck.Duck{
    
    public Woodenduck(){
        flyBehavior = new Flynoway();
        quackBehavior = new Mutequack();
    }
}
