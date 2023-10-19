package Weather_Station;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData  weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 30, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 30.2f);
    }
}
