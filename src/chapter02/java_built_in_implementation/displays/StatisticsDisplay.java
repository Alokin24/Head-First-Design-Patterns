package chapter02.java_built_in_implementation.displays;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, Display {

    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
