package Weather_Station;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private double headIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.headIndex = 16.923 + 1.85212 * (1 / 10) * this.temperature + 5.37941 * this.humidity;
        display();
    }

    public void display(){
        System.out.println("Head index is " + this.headIndex);
    }
}
