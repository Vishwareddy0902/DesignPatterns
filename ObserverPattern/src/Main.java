import Observer.AverageWeatherData;
import Observer.CurrentWeatherData;
import Subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        var weatherData = new WeatherData();
        var currentWeatherData = new CurrentWeatherData(weatherData);
        var averageWeatherData = new AverageWeatherData(weatherData);

        weatherData.setMeasurements(100,50,40 );

        weatherData.setMeasurements(102,60,50);

    }
}
