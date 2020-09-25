package chapter02.custom_implementation.displays;

import chapter02.custom_implementation.Observer;
import chapter02.custom_implementation.Subject;

public class CurrentConditionalDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionalDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }
}
