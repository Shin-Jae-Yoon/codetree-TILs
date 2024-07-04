import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();

        int diff = numOfDays(m2, d2) - numOfDays(m1, d1) + 1;
        int count = diff / 7;

        String[] daysOfTheWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for (int i = 0; i < diff % 7; i++) {
            if (daysOfTheWeek[i].equals(targetDay)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int numOfDays(int m, int d) {
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        for (int i = 1; i < m; i++) {
            totalDays += days[i];
        }

        totalDays += d;

        return totalDays;
    }
}