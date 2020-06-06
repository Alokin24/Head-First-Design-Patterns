package chapter02.custom_implementation.displays;

import chapter02.custom_implementation.Observer;
import chapter02.custom_implementation.Subject;

public class ForecastDisplay implements Observer, Display {

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
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
