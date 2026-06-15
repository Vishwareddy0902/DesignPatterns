package Observer;

import Subject.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class AverageWeatherData implements Display, Observer {

    List<Float>  temperatures;
    List<Float>  pressure;
    List<Float>  humidity;

    public AverageWeatherData(WeatherData weatherData) {
        temperatures = new ArrayList<>();
        pressure = new ArrayList<>();
        humidity = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float averageTemp =  getAverageTemp();
        float averagePressure = getAveragePress();
        float averageHumidity = getAverageHum();
        System.out.println("Average temperature: " + averageTemp);
        System.out.println("Average pressure: " + averagePressure);
        System.out.println("Average humidity: " + averageHumidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        this.pressure.add(pressure);
        this.humidity.add(humidity);
        display();
    }

    private float getAverageTemp() {
        float sum = 0;
        for (Float f : temperatures) {
            sum += f;
        }
        return sum / temperatures.size();
    }

    private float getAveragePress() {
        float sum = 0;
        for (Float f : pressure) {
            sum += f;
        }
        return sum/pressure.size();
    }

    private float getAverageHum() {
        float sum = 0;
        for (Float f : humidity) {
            sum += f;
        }
        return sum/humidity.size();
    }
}
