package Observer;

import Subject.WeatherData;

public class CurrentWeatherData implements Display, Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentWeatherData(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature: " + temperature);
        System.out.println("Current pressure: " + pressure);
        System.out.println("Current humidity: " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
