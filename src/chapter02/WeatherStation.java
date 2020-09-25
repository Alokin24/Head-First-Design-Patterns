package chapter02;


import chapter02.java_built_in_implementation.WeatherData;
import chapter02.java_built_in_implementation.displays.CurrentConditionalDisplay;
import chapter02.java_built_in_implementation.displays.ForecastDisplay;
import chapter02.java_built_in_implementation.displays.StatisticsDisplay;

// Finished
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
