/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteClasses;

import hfdp.chp2.code.weatherdata.interfaces.Observer;
import hfdp.chp2.code.weatherdata.interfaces.Subject;
import java.util.ArrayList;

/**
 *
 * @author Mohammed Hussein
 */
public class WeatherObject implements Subject{
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;
    
    
    //constructor
    public WeatherObject(){
        observers = new ArrayList(); //initialization of ArrayList
    }
    
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void unregisterObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }
    @Override
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void measuresChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measuresChanged();
    }
}
