/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteClasses;

import hfdp.chp2.code.weatherdata.interfaces.DisplayElement;
import hfdp.chp2.code.weatherdata.interfaces.Observer;
import hfdp.chp2.code.weatherdata.interfaces.Subject;

/**
 *
 * @author Mohammed Hussein
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;
    private float heatIndex;
    private Subject WeatherData;
    
    //constructor
    public CurrentConditionsDisplay(Subject weatherData){
        //compositional relation
        this.WeatherData = weatherData;
        WeatherData.registerObserver(this);
    }
    
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = this.temp + this.humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temp + "F degrees and "
                + humidity + "% humidity as well as a heatindex of " + heatIndex);
    }
    
}
