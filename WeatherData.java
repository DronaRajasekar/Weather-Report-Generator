public class WeatherData {
    private double temperature;
    private double humidity;
    private String condition;

    public WeatherData(double temperature, double humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return String.format("Temp: %.1f°C | Humidity: %.1f%% | Condition: %s",
                temperature, humidity, condition);
    }
}
