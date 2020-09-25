package chapter02.custom_implementation.displays;

import chapter02.custom_implementation.Observer;
import chapter02.custom_implementation.Subject;

public class StatisticsDisplay implements Observer, Display {

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
