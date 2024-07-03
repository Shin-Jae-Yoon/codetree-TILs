import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int totalMinutes = minutesCalculator(a, b, c) - minutesCalculator(11, 11, 11);

        if (totalMinutes >= 0) {
            System.out.println(totalMinutes);
        } else {
            System.out.println(-1);
        }
    }

    private static int minutesCalculator(int day, int hour, int minute) {
        return (day * 24 * 60) + (hour * 60) + minute;
    }
}