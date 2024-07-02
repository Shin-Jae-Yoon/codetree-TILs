import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        WeatherData[] weatherDatas = new WeatherData[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            weatherDatas[i] = new WeatherData(date, day, weather);
        }

        WeatherData result = new WeatherData("9999-99-99", "", "");

        for (int i = 0; i < n; i++) {
            if (weatherDatas[i].weather.equals("Rain")) {
                if (result.date.compareTo(weatherDatas[i].date) > 0) {
                    result = weatherDatas[i];
                }
            }
        }

        System.out.println(result.date + " " + result.day + " " + result.weather);
    }
}

class WeatherData {
    String date;
    String day;
    String weather;

    public WeatherData(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}