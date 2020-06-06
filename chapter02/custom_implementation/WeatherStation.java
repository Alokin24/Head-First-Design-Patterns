package chapter02.custom_implementation;

import chapter02.custom_implementation.displays.CurrentConditionalDisplay;
import chapter02.custom_implementation.displays.ForecastDisplay;
import chapter02.custom_implementation.displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionalDisplay currentConditionalDisplay = new CurrentConditionalDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(3, 4, 5);

    }
}
