/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hfdp.chp2.code.weatherdata;

import concreteClasses.CurrentConditionsDisplay;
import concreteClasses.WeatherObject;

/**
 *
 * @author Mohammed Hussein
 */
public class HFDPChp2CodeWeatherData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       WeatherObject weatherdata = new WeatherObject();
       CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherdata);
       weatherdata.setMeasurements(80, 65, 30.4f);
       
    }
    
}
