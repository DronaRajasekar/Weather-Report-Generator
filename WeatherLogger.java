import java.util.*;

public class WeatherLogger {
    public static void main(String[] args) {
        List<WeatherData> logs = new ArrayList<>();

        logs.add(new WeatherData(31.5, 45.0, "Sunny"));
        logs.add(new WeatherData(27.8, 60.0, "Cloudy"));
        logs.add(new WeatherData(25.2, 80.0, "Rainy"));
        logs.add(new WeatherData(29.0, 50.0, "Partly Cloudy"));

        System.out.println("=== Weather Log ===");
        for (WeatherData data : logs) {
            System.out.println(data);
        }

        double avgTemp = logs.stream().mapToDouble(WeatherData::getTemperature).average().orElse(0);
        System.out.printf("\nAverage Temperature: %.1f°C\n", avgTemp);
    }
}
