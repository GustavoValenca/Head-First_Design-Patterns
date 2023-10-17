package Weather_Station;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
