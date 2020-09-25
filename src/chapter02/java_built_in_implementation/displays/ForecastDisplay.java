package chapter02.java_built_in_implementation.displays;

import chapter02.java_built_in_implementation.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display {

    private float currentPressure = 29.29f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Pressure: " + currentPressure + " Last Pressure: " + lastPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}