package chapter02.java_built_in_implementation.displays;
import chapter02.java_built_in_implementation.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionalDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionalDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }

    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }

    }
}
