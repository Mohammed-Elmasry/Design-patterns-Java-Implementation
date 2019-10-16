/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barista.models;

/**
 *
 * @author Mohammed Hussein
 */
public class BeansAmountException extends Exception{
   private double bean;
   
   //constructor
   public BeansAmountException(){
       super("not right amount of beans");       
   };
   
   public BeansAmountException(double beans){
       super("Beans are not enough, add more!");
   }
   
   public double getBeans(){
       return this.bean;
   }
}
