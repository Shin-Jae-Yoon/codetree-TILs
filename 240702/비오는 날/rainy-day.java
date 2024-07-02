import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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

        List<WeatherData> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (weatherDatas[i].weather.equals("Rain")) {
                list.add(weatherDatas[i]);
            }
        }

        int lastIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            int prevDate = Integer.parseInt(list.get(lastIndex).date.replaceAll("-", ""));
            int nextDate = Integer.parseInt(list.get(i).date.replaceAll("-", ""));

            if (prevDate >= nextDate) {
                lastIndex = i;
            }
        }

        System.out.println(list.get(lastIndex).date + " " + list.get(lastIndex).day + " " + list.get(lastIndex).weather);
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