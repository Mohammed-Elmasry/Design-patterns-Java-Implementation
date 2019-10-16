/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck;

/**
 *
 * @author Mohammed Hussein
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

     
    public void perform_fly(){
        flyBehavior.fly();
    }
    
    public void perform_quack(){
        quackBehavior.quack();
    }
    
    public void set_fly(FlyBehavior fb){
        this.flyBehavior = fb;
    }
    
    public void set_quack(QuackBehavior qb){
        this.quackBehavior = qb;
    }
}
